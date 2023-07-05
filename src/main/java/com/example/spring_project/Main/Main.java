package com.example.spring_project.Main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private Map<String, User> users;
    private User user;

    public Main() {
        users = new HashMap<>();
        user = null;
    }

    public void createUser(String name, String email, String password) {
        User user = new User(name, email, password);
        users.put(email, user);
        System.out.println("User has been created");
    }

    private void loginUsers(String email, String password) {
        User user1 = users.get(email);
        if (user1 != null & user1.checkPassword(password)) {
            user = user1;
            System.out.println("Enter is successful");
        } else {
            System.out.println("Incorrect password or email");
        }
    }

    public void logOut() {
        user = null;
        System.out.println("Exit from account");
    }

    public void viewUser() {
        if (user != null) {
            System.out.println("\n name" + user.getName());
            System.out.println("\n email" + user.getEmail());
        } else {
            System.out.println("NOT FOUND!!!");
        }

    }
    public static void main(String[] args){
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int choice = scanner.nextInt();
            System.out.println("==Menu==");
            System.out.println("1. Create account");
            System.out.println("2. Enter to System");
            System.out.println("3. Exit from System");
            System.out.println("4. View info about of user");
            System.out.println("5. Change password");
            System.out.println("6. Exit from Menu");

            System.out.println("Choose action from menu");

            switch (choice) {
                case 1:
                    System.out.println("Enter name");
                    String userName = scanner.nextLine();
                    System.out.println("Enter email");
                    String userEmail = scanner.nextLine();
                    System.out.println("Enter password");
                    String userPassword = scanner.nextLine();
                    main.createUser(userName,userEmail,userPassword);
                    break;
                case 2:

            }
        }
    }

    class User {
        private String name;
        private String email;
        private String password;

        User(String name, String email, String password) {
            this.name = name;
            this.email = email;
            this.password = password;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public boolean checkPassword(String password) {
            return this.password.equals(password);
        }

        public void changePassword(String password) {
            this.password = password;
            System.out.println("Password has been changed");
        }
    }
}


