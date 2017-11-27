package com.cloud.test;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @HystrixCommand
    @GetMapping("/")
    public String makeShopping() {
        return "I'm SHOP number TWO  +++ +++ +++ +++ +++";
    }
}