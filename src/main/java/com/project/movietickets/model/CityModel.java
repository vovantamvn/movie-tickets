package com.project.movietickets.model;

import com.project.movietickets.entity.CityEntity;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Setter
@Getter
public class CityModel {
    private int id;
    private String name;
    private List<CinemaModel> cinemas;

    public CityModel(int id, String name, List<CinemaModel> cinemas) {
        this.id = id;
        this.name = name;
        this.cinemas = cinemas;
    }
}
