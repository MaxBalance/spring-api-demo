package com.maxbalance.model;

import org.apache.ibatis.type.Alias;

import java.util.UUID;

/**
 * Author: maxbalance
 * Description: TestUser
 * Date: 2017-01-08 14:48
 */
public class TestUser{

    private String id = UUID.randomUUID().toString().replaceAll("-","");

    private String username;

    private String password;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
