package com.coffee.mapper;

import com.coffee.pojo.Student;
import org.apache.ibatis.annotations.Param;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

public interface StudentMapper {
    List<Student> select(@Param("stuName") String stuName,@Param("stuBirthDate") Date stuBirthDate);
    int insert(Student student);
    int update(Student student);
    int delete(Integer[] ids);
}
