package Test;

import com.coffee.mapper.StudentMapper;
import com.coffee.pojo.Student;
import com.coffee.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;

public class StudentTest {
    @Test
    public void test() throws IOException, ParseException {
        SqlSession session = MyBatisUtils.getSqlSession();
        SimpleDateFormat sdf =new SimpleDateFormat("yyyy/MM/dd HH:mm:ss" );
        String str = "2000/9/1 00:00:00";
        Date birthday = sdf.parse(str);
        try{
            List<Student> student = session.getMapper(StudentMapper.class).select("张",birthday);
            for (Student s : student) {
                System.out.println(s);
            }
        }finally {
            session.close();
        }
    }
    @Test
    public void test1() throws IOException {
        Date date = new Date();
        Student stu = new Student();
        stu.setId(null);
        stu.setStuName("李四");
        stu.setStuPhone("123");
        stu.setStuBirthDate(date);
        SqlSession session = MyBatisUtils.getSqlSession();
        try {
            int num = session.getMapper(StudentMapper.class).insert(stu);
            session.commit();
            System.out.println(num>0?"success":"fail");
        }finally {
            session.close();
        }
    }
    @Test
    public void test2() throws IOException {
        Date date = new Date();
        Student stu = new Student(6,"更改","123",null);
        SqlSession session = MyBatisUtils.getSqlSession();
        try {
            int num = session.getMapper(StudentMapper.class).update(stu);
            System.out.println(num>0?"success":"fail");
            session.commit();
        }finally {
            session.close();
        }
    }
    @Test
    public void test3() throws IOException {
        SqlSession session = MyBatisUtils.getSqlSession();
        Integer[] ids = {1,3,4};
        try {
            int num = session.getMapper(StudentMapper.class).delete(ids);
            System.out.println(num>0?"success":"fail");
            session.commit();
        }finally {
            session.close();
        }
    }
}
