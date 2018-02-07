package com.example.users.model;

public class User {

    private String name;
    private String surname;
    private Credentials credentials;

    public User(String name, String surname, String email, String password) {
        this.name = name;
        this.surname = surname;
        this.credentials = new Credentials(email, password);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return credentials.getEmail();
    }


    public String getPassword() {
        return credentials.getPassword();
    }

    @Override
    public String toString() {
        return String.format("User: [name: %s, surname: %s, email: %s]", name, surname, credentials.getEmail());
    }

    public String getStringLine() {
        return String.format("%s %s %s %n", name, surname, credentials.getEmail());
    }
}
