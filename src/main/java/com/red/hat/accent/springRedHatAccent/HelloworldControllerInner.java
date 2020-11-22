package com.red.hat.accent.springRedHatAccent;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;

@RestController
@RequestMapping(value = "/v1", produces = MediaType.APPLICATION_JSON_VALUE)
public class HelloworldControllerInner {


    @GetMapping("/sayHello")
    public String sayGreeting(@RequestParam(name = "userName") String userName ){

        return "Hey..... "  + userName  ;
    }

}
