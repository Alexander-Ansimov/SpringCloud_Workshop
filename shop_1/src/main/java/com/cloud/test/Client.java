package com.cloud.test;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("Warehouse")
public interface Client {

    @GetMapping("/")
    String getGoodsFromWarehouse();
}
