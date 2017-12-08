package com.example.users;

import com.example.users.model.User;
import com.example.users.repository.FileLocation;
import com.example.users.repository.UserRepository;
import com.example.users.repository.UsersLocation;
import com.example.users.util.Reader;

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

    private static void showMenu(Scanner scanner, UserRepository repository, UsersLocation location) {
        String option = Reader.readOption(scanner);
        if ("1".equals(option)) {
            registerUser(scanner, repository);
        } else if ("2".equals(option)){
            System.out.println("Marina!! You need to write logic to login user");
            //ask user's email
            //check if user exists in repository
            // if exists:
            // print user information to console
            // if doesn't exist
            // print message that user doesn't exist
            // and show menu
        } else if ("0".equals(option)) {
            location.write(repository.getUsers());
            scanner.close();
            System.exit(0);
        }else{
            System.out.println("Invalid option");
            showMenu(scanner, repository, location);
        }
    }

    private static void registerUser(Scanner scanner, UserRepository repository) {
        User user = readUser(scanner);
        System.out.println(user);
        repository.add(user);
        System.out.println("User successfully registered");
    }
}
