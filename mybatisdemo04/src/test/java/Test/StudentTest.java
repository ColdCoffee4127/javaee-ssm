package Test;

import com.coffee.mapper.StudentMapper;
import com.coffee.pojo.Student;
import com.coffee.pojo.Students;
import com.coffee.utils.MyBatisUtils;
import org.junit.Test;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class StudentTest {
    @Test
    public void test01(){
        SqlSession session = MyBatisUtils.getSqlSession();
        Students lis = session.getMapper(StudentMapper.class).selectStudentById(1);
        System.out.println(lis.getStudentId()+":"+lis.getStudentName());
        System.out.println(lis.getMedicalrecords());
        session.close();
    }
}
