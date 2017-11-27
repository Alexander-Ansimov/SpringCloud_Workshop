package com.cloud.test;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("Shop")
public interface Client {

    @HystrixCommand
    @GetMapping("/")
    String goToShop();
}
