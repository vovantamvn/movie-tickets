package com.project.movietickets.repository;

import com.project.movietickets.controller.UserRepository;
import com.project.movietickets.entity.UserEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class UserRepositoryTest {
    @Autowired
    private UserRepository repository;

    @Test
    public void testInsertUserToDataBase(){
        UserEntity created = UserEntity.builder()
                .username("abcd123")
                .password("abcd123")
                .email("abc@gmail.com")
                .fullName("Name")
                .gender(true)
                .dateOfBirth(LocalDate.now())
                .build();

        UserEntity result = repository.save(created);

        assertEquals(created.getUsername(), result.getUsername());
        assertEquals(created.getPassword(), result.getPassword());
        assertEquals(created.getEmail(), result.getEmail());
        assertEquals(created.getFullName(), result.getFullName());
        assertEquals(created.isGender(), result.isGender());
        assertEquals(created.getDateOfBirth(), result.getDateOfBirth());
    }
}
