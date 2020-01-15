package com.example.demo.personl;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Date;

public class User {
     private String name;
     @JsonIgnore
     private  String password;
     private int age;
   @JsonFormat(pattern = "yy-mm-dd hh-mm-ss",locale = "zh",timezone = "GMT+8")
     private Date birthday;

    @JsonInclude(JsonInclude.Include.NON_NULL)
     private String active;

    public User() {
    }

    public User(String name, String password, int age, Date birthday, String active) {
        this.name = name;
        this.password = password;
        this.age = age;
        this.birthday = birthday;
        this.active = active;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }
}
