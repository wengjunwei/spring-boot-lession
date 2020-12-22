package com.wjw.controller;


import com.wjw.model.AcmeProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ModelController {
    @Autowired
    private AcmeProperties acmeProperties;


    @RequestMapping("test")
    public AcmeProperties test(){
        return acmeProperties;
    }

}


