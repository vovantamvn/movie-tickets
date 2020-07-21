package com.project.movietickets.convert;

import com.project.movietickets.entity.CityEntity;
import com.project.movietickets.model.CityModel;

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
        CityModel model = CityModel.builder()
                .id(entity.getId())
                .name(entity.getName())
                .build();

        return model;
    }
}
