package com.example.consumer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RestTemplateService {
    /**
     * 调用方式一：
     * 使用RestTemplate调用注册子模块接口方法
     */
    @Autowired
    private RestTemplate restTemplate;
    public String getServe(){
        //      http://调用的服务yml配置的服务名/请求路径
        String name=restTemplate.getForObject("http://provider/test/hello",String.class);
        return name;
    }
}
