package com.project.movietickets.service;

import com.project.movietickets.entity.UserEntity;
import com.project.movietickets.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.anyOf;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @MockBean
    private UserRepository userRepository;

    @Test
    public void testCreateUser() {
        final var user = UserEntity.builder()
                .email("email.com")
                .dateOfBirth(LocalDate.parse("2020-08-08"))
                .fullName("fullname")
                .username("username")
                .gender(true)
                .password("123456")
                .role("ROLE_USER")
                .build();

        userService.createUser(user);

        Mockito.verify(userRepository).save(Mockito.any(UserEntity.class));
    }
}
