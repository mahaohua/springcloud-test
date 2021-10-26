package com.haohua;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ConsumerDept_8000 {
    public static void main(String[] args){
        SpringApplication.run(ConsumerDept_8000.class, args);
    }
}
