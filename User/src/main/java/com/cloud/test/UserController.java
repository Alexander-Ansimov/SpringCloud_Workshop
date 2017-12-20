package com.cloud.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private Client client;

    @GetMapping("/")
    public String pingUser() {
        return client.goToShop();
    }
}
