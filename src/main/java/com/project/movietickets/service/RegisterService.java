package com.project.movietickets.service;

import com.project.movietickets.entity.UserEntity;
import com.project.movietickets.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class RegisterService {
    @Autowired
    private UserRepository repository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public boolean registerUser(
            String username,
            String password,
            String fullname,
            String email,
            boolean gender,
            String dateOfBirth) {

        UserEntity user = UserEntity.builder()
                .username(username)
                .password(passwordEncoder.encode(password))
                .fullName(fullname)
                .email(email)
                .gender(gender)
                .role("ROLE_USER")
                .dateOfBirth(LocalDate.parse(dateOfBirth))
                .build();

        try {
            repository.save(user);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }
}
