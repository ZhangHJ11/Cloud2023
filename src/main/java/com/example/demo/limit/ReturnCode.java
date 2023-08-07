package com.example.demo.limit;

public enum ReturnCode {
    SUCCESS(0, "SUCCESS_MSG"),

    FAIL(404, "FAIL_MSG"),
    LIMIT_ERROR(405, "LIMIT_ERROR_MSG");

    private int code;
    private String msg;

    private ReturnCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

}
