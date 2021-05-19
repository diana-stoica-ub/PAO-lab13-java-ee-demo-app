package com.university.service;

import com.university.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserService {

    public User getLoggedInUser() {
        return new User("Popa", "Maria", "student");
    }

    public List<User> getUsers() {
        List<User> users = new ArrayList<>();
        users.add(new User("Popa1", "Maria", "student"));
        users.add(new User("Popa2", "Maria", "student"));
        users.add(new User("Popa3", "Maria", "student"));
        users.add(new User("Popa4", "Maria", "student"));
        users.add(new User("Popa5", "Maria", "student"));

        return users;
    }
}
