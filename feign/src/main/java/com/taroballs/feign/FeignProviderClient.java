package com.taroballs.feign;

import com.taroballs.entity.Student;
import com.taroballs.feign.impl.FeignError;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Collection;

/*Feign是一个声明式的客户端，支持多种注解
    通过声明式的接口 相较于Ribbon+RestTemplate 大大减少了代码量
 */
@FeignClient(value = "provider",fallback = FeignError.class)
//请求名为Provider的微服务，请求失败时调用FeignError来处理
public interface FeignProviderClient {
    @GetMapping("/student/port")
    public String getCurrentPort();
    @GetMapping("/student/getId/{id}")
    public Student getStuById(@PathVariable("id") Integer id);
    @GetMapping("/student/getAll")
    public Collection<Student> getAllStu();
    @PostMapping("/student/insert")
    public String insertStu(@RequestBody Student student);
    @PostMapping("/student/update")
    public String updateStu(@RequestBody Student student);
    @GetMapping("/student/delete/{id}")
    public String deleteStu(@PathVariable("id") Integer id);


}
