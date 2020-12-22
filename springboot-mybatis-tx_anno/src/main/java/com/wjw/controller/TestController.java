package com.wjw.controller;


import com.wjw.mapper.PersonMapper;
import com.wjw.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private PersonMapper personMapper;


    @RequestMapping("hello")
    public Person show(){
        return personMapper.selectById(1);
    }
}

