package com.taroballs.handler;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/zipkin")
public class ZipKinHandler {

    @Value("${server.port}")
    private String port;

    @GetMapping("/port")
    public String getPort(){
        return "当前追踪到所使用的端口为"+this.port;
    }
}
