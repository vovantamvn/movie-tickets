package com.project.movietickets.model;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Objects;

@Data
@Builder
public class MovieModel {
    private int id;
    private String name;
    private String description;
    private String director;
    private String category;
    private LocalDate premiere;
    private int time;
    private String language;
    private String image;
    private int view;
}
