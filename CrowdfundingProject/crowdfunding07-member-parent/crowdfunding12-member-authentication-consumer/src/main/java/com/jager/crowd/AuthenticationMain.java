package com.jager.crowd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

// 启用 Feign 客户端
@EnableFeignClients
@EnableDiscoveryClient // 当前版本可以不写
@SpringBootApplication
public class AuthenticationMain {

    public static void main(String[] args) {
        SpringApplication.run(AuthenticationMain.class, args);
    }

}
