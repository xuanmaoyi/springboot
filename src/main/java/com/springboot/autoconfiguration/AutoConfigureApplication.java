package com.springboot.autoconfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by maoyi.xuan on 2017/4/20.
 */
@RestController
@SpringBootApplication
public class AutoConfigureApplication {
    @Autowired
    private HelloService helloService;
    @RequestMapping("/")
    public String hello(){
        return helloService.sayHello();
    }
    public static void  main(String[] args){
        SpringApplication.run(AutoConfigureApplication.class);
    }
}
