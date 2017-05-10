package com.springboot.typesafeproperties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by maoyi.xuan on 2017/4/20.
 */
@Component
@ConfigurationProperties(prefix = "book")
public class AuthorSettings {
    private String author;
    private String name;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
