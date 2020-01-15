package com.example.demo.controllor;

import com.example.demo.personl.Resouce;
import com.example.demo.personl.UserResult;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class hello {
    @RequestMapping("hello")
    public String Hello(){
        return "hello spring!" ;
    }

    @Autowired
    private Resouce resouce;

    @RequestMapping("/getResouce")
    public UserResult getResouce(){
        Resouce bean = new Resouce();
        BeanUtils.copyProperties(resouce, bean);
        return UserResult.ok(bean);
    }
}
