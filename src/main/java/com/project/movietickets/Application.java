package com.project.movietickets;

import com.project.movietickets.entity.*;
import com.project.movietickets.repository.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Random;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        var app = SpringApplication.run(Application.class, args);
    }
}
