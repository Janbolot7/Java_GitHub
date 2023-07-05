package Scope;

import com.example.spring_project.Pet;
    public class Dog2 implements Pet {
        private String name;
        private int age;

        public Dog2() {
            System.out.println("Dog bean is created!");
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
