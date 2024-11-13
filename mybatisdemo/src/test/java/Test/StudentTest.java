package Test;

import com.coffee.pojo.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import org.junit.Test;
import java.io.IOException;
import java.io.Reader;

public class StudentTest {
    @Test
    public void test1() throws IOException {
        Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession session = sqlSessionFactory.openSession();
        Student student = session.selectOne("com.coffee.mapper.selectById",1);
        session.close();
        System.out.println(student);
    }
}
