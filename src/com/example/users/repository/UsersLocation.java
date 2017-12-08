package com.example.users.repository;

import com.example.users.model.User;

import java.io.IOException;
import java.util.List;

/**
 * The interface that provides methods to read and write user records from/to external location
 * This interface has one implementation that is responsible for working with a file @see com.example.users.repository.FileLocation,
 * but in future we add the second implementation that will work with MySQL Database
 */

public interface UsersLocation {

    List<User> read() throws IOException;

    void write(List<User> users);
}
