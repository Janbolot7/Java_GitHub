package Scope;

import com.example.spring_project.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context2 =
            new ClassPathXmlApplicationContext("application_context2.xml");
        Dog2 pet = context2.getBean("myPet", Dog2.class);

        context2.close();

    }
}
