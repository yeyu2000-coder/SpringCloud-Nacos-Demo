package com.example.consumer.controller;

import com.example.consumer.service.OpenFeignService;
import com.example.consumer.service.RestTemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/consumer")
@RestController
public class TestController {

    @Autowired
    private RestTemplateService restTemplateService;

    @Autowired
    protected OpenFeignService openFeignService;

    @RequestMapping("/getProvideServe")
    public String getProvideServe(){
        return restTemplateService.getServe();
    }

    @RequestMapping("/getProvideServe2")
    public String getProvideServe2(){
        return openFeignService.getServe2();
    }

    @RequestMapping("/hello")
    public String hello(){
        return "Hello! I can provide serve";
    }
}
