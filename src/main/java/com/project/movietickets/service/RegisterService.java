package com.project.movietickets.service;

import com.project.movietickets.convert.ConvertUser;
import com.project.movietickets.entity.UserEntity;
import com.project.movietickets.model.UserModel;
import com.project.movietickets.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class RegisterService {
    @Autowired
    private UserRepository repository;

    /**
     *
     * @param username
     * @param password
     * @param fullname
     * @param email
     * @param gender
     * @param dateOfBirth
     * @return
     */
    public boolean registerUser(String username,
                                String password,
                                String fullname,
                                String email,
                                boolean gender,
                                String dateOfBirth){

        UserEntity user = UserEntity.builder()
                .username(username)
                .password(password)
                .fullName(fullname)
                .email(email)
                .gender(gender)
                .dateOfBirth(LocalDate.parse(dateOfBirth))
                .build();

        try {
            repository.save(user);
        }catch (Exception e){
            return false;
        }

        return true;
    }
}
