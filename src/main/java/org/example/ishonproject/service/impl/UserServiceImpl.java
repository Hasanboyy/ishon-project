package org.example.ishonproject.service.impl;

import jakarta.annotation.PostConstruct;
import org.example.ishonproject.domain.Users;
import org.example.ishonproject.service.UserService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserServiceImpl implements UserService {

    private Integer userId;
    private List<Users> usersList;

    public UserServiceImpl() {
        this.userId = 0;
        this.usersList = new ArrayList<>();
    }

    @PostConstruct
    public void initUser() {
        this.usersList.add(new Users(++userId, "John Doe", "john@doe.com"));
        this.usersList.add(new Users(++userId, "Jane Doe", "jane@doe.com"));
    }

    @Override
    public List<Users> getAllUsers() {
        return this.usersList;
    }
}
