package com.project.movietickets.service;

import com.project.movietickets.entity.UserEntity;
import com.project.movietickets.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LoginService {
    @Autowired
    private UserRepository repository;

    public boolean login(String username, String password){
        Optional<UserEntity> opt = repository.findUserEntityByUsername(username);

        if (opt.isPresent()) {
            UserEntity user = opt.get();
            return user.getPassword().equals(password);
        }

        return false;
    }
}
