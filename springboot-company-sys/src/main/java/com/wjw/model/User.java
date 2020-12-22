package com.wjw.model;

import lombok.Data;

import java.util.Date;

@Data
public class User {
    private int pid;
    private String username;
    private String password;
    private String p_addr;
    private int gender;
    private Date birth;
}
