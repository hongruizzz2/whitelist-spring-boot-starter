package com.hongrui.middleware.whitelist.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author hongrui
 * @description
 * @date 2024-11-17 10:30
 */
@ConfigurationProperties(prefix = "jiumeng.whitelist")
public class WhiteListProperties {

    private String users;

    public String getUsers() {
        return users;
    }

    public void setUsers(String users) {
        this.users = users;
    }
}
