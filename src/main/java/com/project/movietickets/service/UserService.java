package com.project.movietickets.service;

import com.project.movietickets.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public boolean isAdmin(String name) {
        final var user = userRepository.findUserEntityByUsername(name).get();

        return user.getRole().equals("ROLE_ADMIN");
    }
}
