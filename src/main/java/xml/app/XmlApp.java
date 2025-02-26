package xml.app;

import com.golu.beans.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import xml.beans.Student;

import java.util.Map;

public class XmlApp {

    public static void main(String[] args) {

        System.out.println("XML config project created");

        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        Student student = (Student) context.getBean("student1");
        student.createStudent();
        student.getAddress().createAddress();
        System.out.println(student.getAddress());
        System.out.println(student);

        Map map = student.getMap();
        System.out.println(map);

        UserService userBean = context.getBean(UserService.class);
        userBean.createUser();
    }
}
