package com.wjw.model;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

@Data
@Component
@ConfigurationProperties("acme.my-person.person")
@Validated
public class OwnerProperties {

    @NotNull
    private String firstName;

    @Max(30)
    private Integer age;

    @Email
    private String  email;

    private School school=new School();

    @Data
    class School{
        private String name;
    }
}
