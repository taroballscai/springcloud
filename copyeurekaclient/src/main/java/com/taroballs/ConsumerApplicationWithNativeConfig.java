package com.taroballs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

//此module用于读取native config server中的配置文件，实现配置文件与主体消费者相分离
@EnableEurekaClient
@SpringBootApplication
public class ConsumerApplicationWithNativeConfig {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplicationWithNativeConfig.class,args);
    }
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
