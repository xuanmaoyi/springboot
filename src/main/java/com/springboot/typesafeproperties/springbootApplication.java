package com.springboot.typesafeproperties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
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
    @Autowired
    private AuthorSettings authorSettings;
    @RequestMapping("/")
    public String index(){
        return "bookAuthor"+authorSettings.getAuthor()+"bookName"+authorSettings.getName();
    }
    public static void main(String[] args){
        SpringApplication.run(springbootApplication.class);
    }
}
