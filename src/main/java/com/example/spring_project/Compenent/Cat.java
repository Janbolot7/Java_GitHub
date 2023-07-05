package com.example.spring_project.Compenent;

import com.example.spring_project.Pet;
import org.springframework.stereotype.Component;

@Component("catBean") //по умолчанию scope component - singleton
public class Cat implements Pet {
    public Cat(){
        System.out.println("Cat been is created");
    }

    @Override
    public void say() {
        System.out.println("Meow");
    }
}
