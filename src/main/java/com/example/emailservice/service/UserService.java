package com.example.emailservice.service;

import com.example.emailservice.model.User;

public interface UserService {
    User saveUser(User user);
    Boolean verifyToken(String token);

}
