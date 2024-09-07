import com.coffee.pojo.Student;
import com.coffee.service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext( "applicationContext.xml");
        StudentService service = (StudentService) applicationContext.getBean("studentService");
        service.saveStu() ;
    }
}