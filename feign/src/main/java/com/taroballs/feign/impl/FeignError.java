package com.taroballs.feign.impl;

import com.taroballs.entity.Student;
import com.taroballs.feign.FeignProviderClient;
import org.springframework.stereotype.Component;

import java.util.Collection;
@Component //通过@Component将FeignError注入到ioc中
public class FeignError implements FeignProviderClient {
    @Override
    public String getCurrentPort() {
        return "当前服务端口正在维护中...";
    }

    @Override
    public Student getStuById(Integer id) {
        return null;
    }

    @Override
    public Collection<Student> getAllStu() {
        return null;
    }

    @Override
    public String insertStu(Student student) {
        return "当前服务端口正在维护中...";
    }

    @Override
    public String updateStu(Student student) {
        return "当前服务端口正在维护中...";
    }

    @Override
    public String deleteStu(Integer id) {
        return "当前服务端口正在维护中...";
    }
}
