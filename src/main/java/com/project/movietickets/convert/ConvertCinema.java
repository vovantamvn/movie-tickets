package com.project.movietickets.convert;

import com.project.movietickets.entity.CinemaEntity;
import com.project.movietickets.model.CinemaModel;

public class ConvertCinema {
    private ConvertCinema(){}

    public static CinemaEntity toEntity(CinemaModel model){
        CinemaEntity entity = CinemaEntity.builder()
                .id(model.getId())
                .name(model.getName())
                .build();

        return entity;
    }

    public static CinemaModel toModel(CinemaEntity entity){
        CinemaModel model = CinemaModel.builder()
                .id(entity.getId())
                .name(entity.getName())
                .build();

        return model;
    }
}
