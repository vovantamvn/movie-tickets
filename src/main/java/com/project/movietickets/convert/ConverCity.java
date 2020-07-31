package com.project.movietickets.convert;

import com.project.movietickets.entity.CityEntity;
import com.project.movietickets.model.CinemaModel;
import com.project.movietickets.model.CityModel;

import java.util.List;
import java.util.stream.Collectors;

public class ConverCity {
    private ConverCity(){}

    public static CityEntity toEntity(CityModel model){
        CityEntity entity = CityEntity.builder()
                .id(model.getId())
                .name(model.getName())
                .build();

        return entity;
    }

    public static CityModel toModel(CityEntity entity){
        List<CinemaModel> cinemas = entity.getCinemas()
                .stream()
                .map(ConvertCinema::toModel)
                .collect(Collectors.toList());

        CityModel model = CityModel.builder()
                .id(entity.getId())
                .name(entity.getName())
                .cinemas(cinemas)
                .build();

        return model;
    }
}
