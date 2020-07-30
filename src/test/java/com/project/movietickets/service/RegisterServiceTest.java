package com.project.movietickets.service;

import com.project.movietickets.entity.UserEntity;
import com.project.movietickets.model.UserModel;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class RegisterServiceTest {
    @Autowired
    private RegisterService service;

    @Test
    public void testRegisterIfUserValid(){
        boolean result = service.registerUser(
                "demo",
                "password",
                "fullname",
                "email@gmail",
                true,
                "2020-02-02");

        assertEquals(true, result);
    }

    @Test
    public void testRegisterShouldReturnFalseIfUsernameNotValid(){
        service.registerUser(
                "username",
                "password",
                "fullname",
                "email@gmail",
                true,
                "2020-02-02");

        boolean result = service.registerUser(
                "username",
                "password",
                "fullname",
                "email@gmail",
                true,
                "2020-02-02");

        assertEquals(false, result);
    }
}
