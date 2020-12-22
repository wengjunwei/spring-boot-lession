package com.wjw.model;

import lombok.Data;

@Data
public class Role {
    private String name;

    public Role(String name) {
        this.name = name;
    }
}
