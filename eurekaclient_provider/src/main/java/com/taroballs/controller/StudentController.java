package com.taroballs.controller;

import com.taroballs.entity.Student;
import com.taroballs.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    /**
     * 测试负载均衡
     */
    @Value("${server.port}")
    private String port;

    @GetMapping("/port")
    public String getCurrentPort(){
        return "当前使用端口"+this.port;
    }

    @GetMapping("/getId/{id}")
    public Student getStuById(@PathVariable("id") Integer id){
        return studentService.getStuById(id);
    }
    @GetMapping("/getAll")
    public Collection<Student> getAllStu(){
        return studentService.getAllStu();
    }
    @PostMapping("/insert")
    public String insertStu(@RequestBody Student student){
        boolean flag = studentService.insertStu(student);
        if(flag){
            return "insert success!";
        }else{
            return "error happened!";
        }
    }
    @PostMapping("/update")
    public String updateStu(@RequestBody Student student){
        boolean flag = studentService.updateStuById(student);
        if(flag){
            return "update success!";
        }else{
            return "error happened!";
        }
    }
    @GetMapping("/delete/{id}")
    public String deleteStu(@PathVariable("id") Integer id){
        boolean flag = studentService.deleteStuById(id);
        if(flag){
            return "delete success!";
        }else{
            return "error happened!";
        }
    }


}
