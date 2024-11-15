package com.coffee.pojo;

public class Result {
    private Integer code;
    private String msg;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Result(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
