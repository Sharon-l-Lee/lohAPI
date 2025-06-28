package com.loharchive.lordlog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
public class LordlogApplication {

    public static void main(String[] args) {
        SpringApplication.run(LordlogApplication.class, args);
    }

}
