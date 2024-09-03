package pojo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.StudentService;
import com.coffee.dao.impl.StuDaoImpl;


public class Student {

    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
    StudentService service = (StudentService) applicationContext.getBean("stuService");
    service.saveStu();
}
