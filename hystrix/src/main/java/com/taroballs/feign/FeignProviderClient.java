package com.taroballs.feign;

import com.taroballs.entity.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Collection;

//通过声明式接口的方式调用服务提供者
@FeignClient(value = "provider")
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
