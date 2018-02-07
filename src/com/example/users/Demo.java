package com.example.users;

import com.example.users.model.Credentials;
import com.example.users.model.User;
import com.example.users.repository.FileLocation;
import com.example.users.repository.UserRepository;
import com.example.users.repository.UsersLocation;

import java.io.IOException;
import java.util.Scanner;

import static com.example.users.util.Reader.*;

public class Demo {

    public static void main(String[] args) throws IOException {
        UsersLocation location = new FileLocation();

        UserRepository repository = new UserRepository(location);
        Scanner scanner = new Scanner(System.in);// Scanner is a special class that can read data from the given source. In our case - its console

        showMenu(scanner, repository, location);
    }

    private static void showMenu(Scanner scanner, UserRepository repository, UsersLocation location) throws IOException {
        String option = readOption(scanner);
        if ("1".equals(option)) {
            registerUser(scanner, repository);
            showMenu(scanner, repository, location);
        } else if ("2".equals(option)){
            loginUser(scanner, repository);
        } else if ("0".equals(option)) {
            exit(scanner, repository, location);
        }else{
            handleInvalidOption(scanner, repository, location);
        }
    }

    private static void registerUser(Scanner scanner, UserRepository repository) {
        User user = readUser(scanner);
        System.out.println(user);
        repository.add(user);
        System.out.println("User successfully registered");
    }

    private static void loginUser (Scanner scanner, UserRepository repository) {
        Credentials userCredentials = readCredentials(scanner);
        User user = repository.get(userCredentials.getEmail());
        if (user != null && userCredentials.getPassword().equals(user.getPassword())) {
            System.out.println(user);
        } else {
            System.out.println("Incorrect login or password");
        }
    }
    private static void handleInvalidOption(Scanner scanner, UserRepository repository, UsersLocation location) throws IOException {
        System.out.println("Invalid option");
        showMenu(scanner, repository, location);
    }

    private static void exit(Scanner scanner, UserRepository repository, UsersLocation location) throws IOException {
        location.write(repository.getUsers());
        scanner.close();
        System.exit(0);
    }
}
