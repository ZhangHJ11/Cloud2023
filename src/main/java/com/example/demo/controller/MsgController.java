package com.example.demo.controller;

import com.example.demo.model.Message;
import com.google.common.util.concurrent.RateLimiter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

@Slf4j
@RestController
@RequestMapping("/msg")
public class MsgController {

    /**
     * 限流策略 ： 1秒钟2个请求
     */
    private final RateLimiter limiter = RateLimiter.create(2.0);
    private DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Message get() {
        // 500毫秒内，没拿到令牌，就直接进入服务降级
        boolean tryAcquire = limiter.tryAcquire(500, TimeUnit.MILLISECONDS);

        if (!tryAcquire) {
            log.warn("进入服务降级，时间{}", LocalDateTime.now().format(dtf));
            return new Message("当前排队人数较多，请稍后再试！");
        }

        log.info("获取令牌成功，时间{}", LocalDateTime.now().format(dtf));
        // Here, you can implement logic to fetch user by ID from a database or other
        // sources.
        return new Message();
    }
}
