package com.example.demo.dao;

import com.example.demo.personl.User;
import com.example.demo.personl.UserResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
@Controller
@RequestMapping("/user")
public class SetUser {
    @RequestMapping("/getUser")
    @ResponseBody
    public User SetUser(){
    User user = new User();
    user.setName("张立俊");
    user.setPassword("zhanglijunsb");
    user.setBirthday(new Date());
    return user;
    }

    @RequestMapping("/getUserResult")
    @ResponseBody
    public UserResult SetUserResult(){
        User user = new User();
        user.setName("张立俊");
        user.setPassword("zhanglijunsb");
        user.setBirthday(new Date());
        user.setActive("hello lijun!");
        return UserResult.ok(user);
    }

}
