package com.cloud.test;

import org.springframework.beans.factory.annotation.Autowired;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private Client client;

    @HystrixCommand
    @GetMapping("/")
    public String makeShopping() {
        return "I'm SHOP number TWO  +++ +++ +++ +++ +++:  " + client.getGoodsFromWarehouse();
    }
}