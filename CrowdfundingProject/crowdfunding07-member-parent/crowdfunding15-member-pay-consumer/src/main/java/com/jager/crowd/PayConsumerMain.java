package com.jager.crowd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

// 启用Feign客户端功能
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class PayConsumerMain {

    public static void main(String[] args) {
        SpringApplication.run(PayConsumerMain.class, args);
    }

}
