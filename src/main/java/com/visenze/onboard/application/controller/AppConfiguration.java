package com.visenze.onboard.application.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppConfiguration {

    @RequestMapping("/hello")
    public String hello(
            @RequestParam("name")
            String userName
    ){
        return "Welcome to Visenze, " + userName;
    }

    @RequestMapping("/home")
    public String home(){
        return "hello welcome to home";
    }
}