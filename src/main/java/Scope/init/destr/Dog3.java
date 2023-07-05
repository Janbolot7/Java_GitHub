package Scope.init.destr;

import com.example.spring_project.Pet;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Dog3 implements Pet {
    private String name;
    private int age;

    public Dog3() {
        System.out.println("Dog bean is created!");
    }


    public void init() {
        System.out.println("Class Dog: init method");
    }

    public void destroy() {
        System.out.println("Class Dog: destroy method");
    }

    @Override
    public void say()
    {
        System.out.println("Gav");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
