package com.maxbalance.controller;

import com.maxbalance.model.TestUser;
import com.maxbalance.service.TestUserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Author: maxbalance
 * Description: Hello Api
 * Date: 2017-01-07 21:57
 */
@RestController
@RequestMapping(value = "/hello")
public class TestUserController {
    @Resource
    TestUserService testUserService;

    @RequestMapping(method = RequestMethod.GET)
    public String hello(){
        return "Hello!";
    }

    @RequestMapping(value = "/testUser",method = RequestMethod.GET)
    private TestUser creatUser(){
        TestUser testUser = new TestUser();
        testUser.setUsername("aaa");
        testUser.setPassword("bbb");

        return testUserService.createUser(testUser);
    }
}
