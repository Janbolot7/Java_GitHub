package Scope.init.destr;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test5 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context3 =
                new ClassPathXmlApplicationContext("application_context3.xml");

        Dog3 pet = context3.getBean("myPet", Dog3.class);
        pet.say();
        context3.close();
    }
}
