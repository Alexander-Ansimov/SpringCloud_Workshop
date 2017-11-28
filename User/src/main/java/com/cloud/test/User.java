package com.cloud.test;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableScheduling
@EnableHystrix
public class User {

    @Autowired
    private Client client;

    public static void main(String[] args) {
        SpringApplication.run(User.class, args);
    }

    @HystrixCommand
    @Scheduled(fixedDelayString = "2000")
    public void goToShop() {
        System.out.println(client.goToShop());
    }
}
