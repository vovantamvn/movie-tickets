package com.project.movietickets.convert;

import com.project.movietickets.entity.MovieEntity;
import com.project.movietickets.model.MovieModel;

public class ConvertMovie {
    private ConvertMovie(){}

    public static MovieModel toMovieModel(MovieEntity entity){
        MovieModel model = MovieModel.builder()
                .id(entity.getId())
                .name(entity.getName())
                .description(entity.getDescription())
                .category(entity.getCategory())
                .premiere(entity.getPremiere())
                .time(entity.getTime())
                .language(entity.getLanguage())
                .image(entity.getImage())
                .view(entity.getView())
                .build();

        return model;
    }

    public static MovieEntity toMovieEntity(MovieModel model){
        MovieEntity entity = MovieEntity.builder()
                .id(model.getId())
                .name(model.getName())
                .description(model.getDescription())
                .category(model.getCategory())
                .premiere(model.getPremiere())
                .time(model.getTime())
                .language(model.getLanguage())
                .image(model.getImage())
                .view(model.getView())
                .build();

        return entity;
    }
}
