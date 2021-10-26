package com.haohua;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableDiscoveryClient  // 服务发现
@EnableEurekaClient     // 在服务启动后自动注册到Eureka中
@SpringBootApplication
public class ProviderDept_8001 {
    public static void main(String[] args){
        SpringApplication.run(ProviderDept_8001.class, args);
    }
}
