package com.example.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("provider")
public interface OpenFeignService {
    @GetMapping("/test/hello")
    public String getServe2();
}
