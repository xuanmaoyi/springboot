package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by maoyi.xuan on 2017/4/19.
 */
@SpringBootApplication
@RestController
public class springbootApplication {
    @RequestMapping("/")
    public String index(){
        return "hello springboot";
    }
    public static void main(String[] args){
        SpringApplication.run(springbootApplication.class);
    }
}
