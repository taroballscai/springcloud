package com.taroballs.service;

import com.taroballs.entity.Student;
import com.taroballs.repository.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class StudentService {
    @Autowired
    private StudentMapper studentMapper;

    public Student getStuById(Integer id){
        return studentMapper.getStuById(id);
    }

    public Collection<Student> getAllStu(){
        return studentMapper.getAllStu();
    }

    public boolean insertStu(Student student){
        int cnt = -1;
        cnt = studentMapper.insertStu(student);
        if(cnt>0){
            return true;
        }else {
            return false;
        }
    }

    public boolean updateStuById(Student student){
        int cnt = -1;
        cnt = studentMapper.updateStuById(student);
        if(cnt>0){
            return true;
        }else {
            return false;
        }
    }

    public boolean deleteStuById(Integer id){
        int cnt = -1;
        cnt = studentMapper.deleteStuById(id);
        if(cnt>0){
            return true;
        }else {
            return false;
        }
    }

}

