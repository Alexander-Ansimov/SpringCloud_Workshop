package com.cloud.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableScheduling
public class User {

    @Autowired
    private Client client;

    public static void main(String[] args) {
        SpringApplication.run(User.class, args);
    }


    @Scheduled(fixedDelayString = "2000")
    public void goToShop() {
        System.out.println(client.goToShop());
    }
}
