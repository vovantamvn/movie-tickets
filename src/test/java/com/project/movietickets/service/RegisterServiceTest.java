package com.project.movietickets.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class RegisterServiceTest {

    @Autowired
    private RegisterService service;

    @Test
    public void testRegisterServiceWillCallUserRepository(){
        boolean result = service.registerUser(
                "demo",
                "password",
                "fullname",
                "email@gmail.com",
                true,
                "2020-02-02");

        assertEquals(true, result);
    }
}
