package com.haohua;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.haohua"})
@SpringBootApplication
public class ConsumerDeptFeign_8000 {
    public static void main(String[] args){
        SpringApplication.run(ConsumerDeptFeign_8000.class, args);
    }
}
