package com.wjw.controller;


import com.wjw.mapper.PersonMapper;
import com.wjw.model.Person;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    private PersonMapper personMapper;

    @RequestMapping("selectById")
    public Person selectById(){
        return personMapper.selectById(1);
    }

    @RequestMapping("selectAll")
    public List<Person> selectAll(){
        return personMapper.selectAll();
    }
}

