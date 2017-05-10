package com.springboot.autoconfiguration;

/**
 * Created by maoyi.xuan on 2017/4/20.
 */
public class HelloService {
    private String msg;
    public String sayHello(){
        return "hello"+msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
