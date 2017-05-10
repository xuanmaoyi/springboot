package com.springboot.properties;

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
    @Value("${book.author}")
    private String bookAuthor;
    @Value("${book.name}")
    private String bookName;
    @RequestMapping("/")
    public String index(){
        return "bookAuthor"+bookAuthor+"bookName"+bookName;
    }
    public static void main(String[] args){
        SpringApplication.run(springbootApplication.class);
    }
}
