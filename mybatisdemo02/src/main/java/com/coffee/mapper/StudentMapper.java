package com.coffee.mapper;

import com.coffee.pojo.Student;

import java.util.List;

public interface StudentMapper {
    List<Student> select();
    int insert(Student student);
    int update(Student student);
    int delete(Integer id);
}
