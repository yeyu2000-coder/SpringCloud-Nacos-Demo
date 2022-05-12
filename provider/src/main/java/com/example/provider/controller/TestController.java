package com.example.provider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/test")
@RestController
public class TestController {

    @RequestMapping("/hello")
    public String hello(){
        return "Hello! I can provide serve";
    }
}
