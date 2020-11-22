package com.red.hat.accent.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloworldController {


    @RequestMapping("/")
    public String sayGreeting(){

        return "Hey..... sanu"   ;
    }

}
