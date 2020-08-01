package com.taroballs.repository;

import com.taroballs.entity.Student;

import java.util.Collection;

public interface StudentMapper {
    Student getStuById(Integer id);
    int insertStu(Student student);
    int updateStuById(Student student);
    Collection<Student> getAllStu();
    int deleteStuById(Integer id);
}
