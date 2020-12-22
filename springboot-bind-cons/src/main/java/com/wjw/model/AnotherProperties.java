package com.wjw.model;

import lombok.Data;

import java.net.InetAddress;

@Data
public class AnotherProperties {
    private boolean enabled;

    private InetAddress remoteAddress;

}

