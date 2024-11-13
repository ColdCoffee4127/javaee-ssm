package com.coffee.mapper;

import com.coffee.pojo.Students;

public interface StudentMapper {
    Students selectStudentById(Integer studentId);
}
