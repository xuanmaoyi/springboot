package com.springboot.autoconfiguration;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by maoyi.xuan on 2017/4/20.
 */
@ConfigurationProperties(prefix = "hello")
public class HelloServiceProperties {
    private static final String MSG="world";
    private String msg=MSG;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
