package com.example.users.repository;

import com.example.users.model.User;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FileLocation implements UsersLocation {

    public static final String FILE_PATH = "src/users.txt";

    /**
     * This method reads users from file users.txt
     */

    @Override
    public List<User> read() throws IOException {
        System.out.println("Loading users from users.txt");
        List<User> users = new ArrayList<User>();

        Stream<String> stream = Files.lines(Paths.get(FILE_PATH)); // create file stream by file name

        stream.forEach(line -> users.add(parseUser(line))); //go line by line, parse each line and add user object to array

        System.out.println("Loading finished");
        return users;
    }

    private User parseUser(String line) {
        String[] userParameters = line.split(" ");
        User user = new User(userParameters[0], userParameters[1], userParameters[2], userParameters[3]);
        System.out.println(String.format("%s loaded", user));
        return user;
    }

    @Override
    public void write(List<User> users) throws IOException {
        BufferedWriter writer = Files.newBufferedWriter(Paths.get(FILE_PATH));
        for (User user : users){
            writer.write(user.getStringLine());
        }
        writer.close();
    }
}
