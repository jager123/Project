package com.jager.crowd;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 扫描 MyBatis 的 Mapper 接口所在的包
@MapperScan(value = "com.jager.crowd.mapper")
@SpringBootApplication
public class MysqlProviderMain {

    public static void main(String[] args) {
        SpringApplication.run(MysqlProviderMain.class, args);
    }

}
