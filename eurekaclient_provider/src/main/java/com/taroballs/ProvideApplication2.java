package com.taroballs;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.taroballs.repository")
@SpringBootApplication
public class ProvideApplication2 {
    public static void main(String[] args) {
        SpringApplication.run(ProvideApplication2.class,args);
    }
}
