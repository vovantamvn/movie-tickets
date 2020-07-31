package com.project.movietickets.model;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class CityModel {
    private int id;
    private String name;
    private List<CinemaModel> cinemas;
}