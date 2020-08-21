package com.project.movietickets.service;

import com.project.movietickets.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class RegisterServiceTest {

    @MockBean
    private UserRepository repository;

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
