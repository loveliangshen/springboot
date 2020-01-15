package com.example.demo.personl;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Configuration
@ConfigurationProperties(prefix = "com.imooc.opensource")
@PropertySource(value = "classpath:resource.properties")
@Component
public class Resouce {
    private String name;
    private String webpage;
    private String language;

    public Resouce() {
    }

    public Resouce(String name, String webpage, String language) {
        this.name = name;
        this.webpage = webpage;
        this.language = language;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWebpage() {
        return webpage;
    }

    public void setWebpage(String webpage) {
        this.webpage = webpage;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
