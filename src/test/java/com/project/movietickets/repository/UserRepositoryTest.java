package com.project.movietickets.repository;

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
                .role("ROLE_USER")
                .gender(true)
                .dateOfBirth(LocalDate.parse("2020-08-08"))
                .build();

        UserEntity result = repository.save(created);

        assertEquals("abcd123", result.getUsername());
        assertEquals("abcd123", result.getPassword());
        assertEquals("abc@gmail.com", result.getEmail());
        assertEquals("Name", result.getFullName());
        assertEquals(true, result.isGender());
        assertEquals(LocalDate.parse("2020-08-08"), result.getDateOfBirth());
        assertEquals("ROLE_USER", result.getRole());
    }
}
