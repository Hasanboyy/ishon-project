package org.example.ishonproject.controller;

import lombok.RequiredArgsConstructor;
import org.example.ishonproject.domain.Users;
import org.example.ishonproject.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/users")
public class UserController {

    private final UserService userService;


    @GetMapping(value = "/get-all")
    public List<Users> getAllUsers() {
        return this.userService.getAllUsers();
    }


}
