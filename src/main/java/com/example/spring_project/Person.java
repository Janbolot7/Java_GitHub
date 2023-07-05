package com.example.spring_project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private String name;
    private int age;
    private Pet pet;
    @Autowired
    public Person(Pet pet) {
        System.out.println("Person has been is created");
        this.pet = pet;
    }

    public Person() {
    }

    public void callPet() {
        System.out.println("Hello, pet!");
        pet.say();
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Pet getPet() {
        return pet;
    }
}
