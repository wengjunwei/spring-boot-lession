package com.wjw.service;

import com.wjw.model.AnotherProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

@Component
@Validated
public class MyService {

    @Bean
    @ConfigurationProperties("acme")
    public AnotherProperties getAnotherProperties(){
        return new AnotherProperties();
    }
}
