package com.wjw.controller;


import com.wjw.model.YamlModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ModelController {

    @Autowired
    private YamlModel yamlModel;

    @RequestMapping("yaml")
    public YamlModel yaml(){

        System.out.println(yamlModel);
        return yamlModel;
    }
}


