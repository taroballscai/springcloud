package com.taroballs.handler;

import com.taroballs.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

@RestController
@RequestMapping("/ribbon")
public class RibbonHandler {
    @Autowired
    private RestTemplate restTemplate;

    private String BaseUri = "http://provider/student"; //直接通过provider命名访问

    @GetMapping("/getAll")
    public Collection<Student> getAllStu(){
        return restTemplate.getForObject(BaseUri+"/getAll", Collection.class);
    }
    @GetMapping("/getAll2")
    public Collection<Student> getAllStu2(){
        return restTemplate.getForEntity(BaseUri+"/getAll",Collection.class).getBody();
    }
    @GetMapping("/getId/{id}")
    public Student getStuById(@PathVariable("id") Integer id){
        return restTemplate.getForObject(BaseUri+"/getId/{id}",Student.class,id);
    }

    @PostMapping("/insert")
    public String insertStu(@RequestBody Student student){
        return restTemplate.postForObject(BaseUri+"/insert",student,String.class);
    }

    @PostMapping("/update")
    public String updateStu(@RequestBody Student student){
        return restTemplate.postForObject(BaseUri+"/update",student,String.class);
    }

    @GetMapping("/delete/{id}")
    public String deleteStu(@PathVariable("id") Integer id){
        return restTemplate.getForObject(BaseUri+"/delete/{id}",String.class,id);
    }

    @GetMapping("/port")
    public String getPort(){
        return restTemplate.getForObject(BaseUri+"/port",String.class);
    }
}
