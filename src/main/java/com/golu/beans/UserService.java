package com.golu.beans;

import org.springframework.stereotype.Component;

@Component
public class UserService {

    public void createUser() {
        System.out.println("User created");
    }
}
