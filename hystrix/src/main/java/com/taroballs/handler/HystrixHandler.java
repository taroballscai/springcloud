package com.taroballs.handler;

import com.taroballs.entity.Student;
import com.taroballs.feign.FeignProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/hystrix")
public class HystrixHandler {
    @Autowired
    private FeignProviderClient feignProviderClient;

    @GetMapping("/port")
    public String getCurrentPort(){
        return feignProviderClient.getCurrentPort();
    }

    @GetMapping("/getAll")
    public Collection<Student> getAll(){
        return feignProviderClient.getAllStu();
    }

    @GetMapping("/getId/{id}")
    public Student getId(@PathVariable("id") Integer id){
        return feignProviderClient.getStuById(id);
    }

    @PostMapping("/insert")
    public String insertStu(@RequestBody Student student){
        return feignProviderClient.insertStu(student);
    }

    @PostMapping("/update")
    public String updateStu(@RequestBody Student student){
        return feignProviderClient.updateStu(student);
    }

    @GetMapping("/delete/{id}")
    public String deleteStu(@PathVariable("id") Integer id){
        return feignProviderClient.deleteStu(id);
    }

}
