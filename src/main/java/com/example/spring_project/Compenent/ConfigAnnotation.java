package com.example.spring_project.Compenent;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigAnnotation {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("application_context4.xml");

        Cat cat = context.getBean("catBean", Cat.class);
        cat.say();

        context.close();
    }
}


