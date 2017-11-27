package com.cloud.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public String makeShopping() {
        return "I'm SHOP number TWO  +++ +++ +++ +++ +++";
    }
}