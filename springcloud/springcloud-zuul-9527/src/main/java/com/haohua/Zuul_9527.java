package com.haohua;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy    // 开启zuul
@SpringBootApplication
public class Zuul_9527 {
    public static void main(String[] args) {
        SpringApplication.run(Zuul_9527.class, args);
    }
}
