package Test;

import com.coffee.mapper.StudentMapper;
import com.coffee.pojo.Student;
import com.coffee.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.io.IOException;
import java.util.Date;
import java.util.List;

public class StudentTest {
    @Test
    public void test() throws IOException {
        SqlSession session = MyBatisUtils.getSqlSession();
        try{
            List<Student> student = session.getMapper(StudentMapper.class).select();
            System.out.println(student);
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
        Student stu = new Student();
        stu.setId(4);
        stu.setStuName("王五");
        stu.setStuPhone("123");
        stu.setStuBirthDate(date);
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
        try {
            int num = session.getMapper(StudentMapper.class).delete(1);
            System.out.println(num>0?"success":"fail");
            session.commit();
        }finally {
            session.close();
        }
    }
}
