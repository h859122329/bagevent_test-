package com.example.bagevent_test;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.example.bagevent_test.dao")
public class BageventTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(BageventTestApplication.class, args);
    }

}
