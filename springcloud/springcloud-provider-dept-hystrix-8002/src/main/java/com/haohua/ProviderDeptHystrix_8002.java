package com.haohua;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient     // 服务启动后自动注册到Eureka中
@EnableDiscoveryClient  // 服务发现
@EnableCircuitBreaker   // 添加对熔断的支持
@SpringBootApplication
public class ProviderDeptHystrix_8002 {
    public static void main(String[] args){
        SpringApplication.run(ProviderDeptHystrix_8002.class, args);
    }
}
