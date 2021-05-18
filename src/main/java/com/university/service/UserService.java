package com.university.service;

import com.university.model.User;

public class UserService {

    public User getLoggedInUser() {
        return new User("Popa", "Maria", "student");
    }
}
