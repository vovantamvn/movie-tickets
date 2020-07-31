package com.project.movietickets;

import com.project.movietickets.entity.UserEntity;
import com.project.movietickets.repository.MovieRepository;
import com.project.movietickets.repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.time.LocalDate;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        var app = SpringApplication.run(Application.class, args);
    }

}
