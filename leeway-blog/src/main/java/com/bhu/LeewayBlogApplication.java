package com.bhu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.bhu.mapper")
public class LeewayBlogApplication {
    public static void main(String[] args) {
        SpringApplication.run(LeewayBlogApplication.class, args);
    }
}

