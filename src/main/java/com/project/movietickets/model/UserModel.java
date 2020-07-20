package com.project.movietickets.model;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class UserModel {
    private int id;
    private String username;
    private String email;
    private String fullName;
    private boolean gender;
    private LocalDate dateOfBirth;
}
