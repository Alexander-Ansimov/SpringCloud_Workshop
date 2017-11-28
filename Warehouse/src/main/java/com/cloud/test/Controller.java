package com.cloud.test;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @HystrixCommand
    @GetMapping("/")
    public String goodsFromWarehouse() {
        if (Math.random() > 0.3) {
            return "*********  GOODS from WAREHOUSE  **********";
        } else {
            throw new RuntimeException();
        }
    }
}
