package com.taroballs.handler;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/native")
public class NativeConfigHandler {
    @Value("${server.port}")
    private String port;
    @Value("${foo}")
    private String content;

    @GetMapping("/things")
    public String getThings(){
        return "本地配置文件里面的东西"+this.port+" 某些东西 "+this.content;
    }
}
