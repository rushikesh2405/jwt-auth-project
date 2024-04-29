package com.jwtExample.jwt.service;

import com.jwtExample.jwt.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    private List<User> user = new ArrayList<>();

    public UserService(){
        user.add(new User(1,"Rushikesh Tapre","rushikesh@gmail.com"));
        user.add(new User(1,"Khushboo Tapre","khushboo@gmail.com"));
        user.add(new User(1,"Shrutika Tapre","shrutika@gmail.com"));
    }

    public List<User> getUser(){
            return this.user;
    }
}
