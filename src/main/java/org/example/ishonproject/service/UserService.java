package org.example.ishonproject.service;

import org.example.ishonproject.domain.Users;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    List<Users> getAllUsers();

}
