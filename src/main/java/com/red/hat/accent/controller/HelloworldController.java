package com.red.hat.accent.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloworldController {


    @GetMapping( "/sayHello")
    public String sayGreeting(){

        return "Hey..... sanu"   ;
    }

}
