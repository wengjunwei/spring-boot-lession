package com.wjw.controller;


import com.wjw.model.AnotherProperties;
import com.wjw.model.Dept;
import com.wjw.model.OwnerProperties;
import com.wjw.model.ValueProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Bean
    private Dept getDept(){
        return new Dept();
    }

    @Autowired
    private Dept dept;

    @Autowired
    private AnotherProperties anotherProperties;


    @RequestMapping("hello")
    public String yaml(){
        System.out.println(dept);
        return "hhh";
    }
    @RequestMapping("another")
    public String another(){
        System.out.println(anotherProperties);
        return "hhh";
    }

    @Autowired
    private OwnerProperties ownerProperties;

    @RequestMapping("owner")
    public String owner(){
        System.out.println(ownerProperties);
        return "test";
    }

    @Autowired
    private ValueProperties valueProperties;

    @RequestMapping("value")
    public String value(){
        System.out.println(valueProperties);
        return "test123";
    }

}

