package com.example.users.util;


import com.example.users.model.User;

import java.util.Scanner;

public class Reader {

    public static User readUser(Scanner scanner) {
        String email = readEmail(scanner);
        String password = readPassword(scanner);
        String name = readName(scanner);
        String surname = readSurname(scanner);
        return new User(name, surname, email, password);
    }

    public static String readEmail(Scanner scanner) {
        System.out.println("Please, enter your email");
        return scanner.next();
    }

    public static String readPassword(Scanner scanner) {
        System.out.println("Please, enter your password");
        return scanner.next();
    }

    public static String readName(Scanner scanner) {
        System.out.println("Please, enter your name");
        return scanner.next();
    }

    public static String readSurname(Scanner scanner) {
        System.out.println("Please, enter your surname");
        return scanner.next();
    }

    public static String readOption(Scanner scanner) {
        System.out.println("Please enter [1] if you want to register");
        System.out.println("Please enter [2] if you want to login");
        System.out.println("Please enter [0] if you want exit");

        return scanner.next();
    }
}