package com.maxbalance.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: maxbalance
 * Description: Hello Api
 * Date: 2017-01-07 21:57
 */
@RestController
@RequestMapping(value = "/hello")
public class Hello {

    @RequestMapping(method = RequestMethod.GET)
    public String hello(){
        return "Hello!";
    }
}
