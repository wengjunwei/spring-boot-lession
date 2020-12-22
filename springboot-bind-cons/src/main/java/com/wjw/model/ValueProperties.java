package com.wjw.model;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class ValueProperties {

    @Value("${acme.my-person.person.first-name}")
    private String firstName;

    @Value("#{12*3}")
    private int age;


}
