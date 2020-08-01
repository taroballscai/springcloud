package com.taroballs.handler;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/github")
public class GithubConfigHandler {
    @Value("${server.port}")
    private String port;

    @GetMapping("/things")
    public String getThings(){
        return "远程配置文件里面的端口"+this.port;
    }
}
