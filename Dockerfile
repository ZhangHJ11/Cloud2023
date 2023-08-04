# 使用的基础镜像
FROM openjdk:8-jre-slim

# 将工作目录设置为 /app
WORKDIR /app

# 将本地的jar文件拷贝到容器中的/app目录
COPY target/demo.jar /app/demo.jar

# 设置启动命令
CMD ["java", "-jar", "demo.jar"]
