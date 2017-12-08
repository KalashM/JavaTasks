package com.example.users.repository;


import com.example.users.model.User;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import static java.util.Collections.unmodifiableList;

/**
 * This class is responsible for in-memory storing users
 */
public class UserRepository {

    private List<User> users;

    /**
     * Constructor
     * Read users from location when the class is initializing
     */
    public UserRepository(UsersLocation location) throws IOException {
        users = location.read();
    }


    public void add(User user){
        users.add(user);
    }

    /**
     * This method gets user by given email
     */
    public User get(String email){
         Optional<User> user = users.stream().filter(u -> email.equals(u.getEmail())).findFirst();
         return user.orElse(null);
    }

    public List<User> getUsers(){
        return unmodifiableList(users);
    }
}
