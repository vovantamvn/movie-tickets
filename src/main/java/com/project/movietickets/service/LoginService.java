package com.project.movietickets.service;

import com.project.movietickets.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    @Autowired
    private UserRepository repository;

    public boolean login(String username, String password){
        return true;
    }
}
