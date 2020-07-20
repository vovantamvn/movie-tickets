package com.project.movietickets.convert;

import com.project.movietickets.entity.UserEntity;
import com.project.movietickets.model.UserModel;

public class ConvertUser {
    private ConvertUser(){}

    public static UserEntity toEntity(UserModel model){
        UserEntity entity = UserEntity.builder()
                .id(model.getId())
                .username(model.getUsername())
                .email(model.getEmail())
                .fullName(model.getFullName())
                .gender(model.isGender())
                .dateOfBirth(model.getDateOfBirth())
                .build();

        return entity;
    }

    public static UserModel toModel(UserEntity entity){
        UserModel model = UserModel.builder()
                .id(entity.getId())
                .username(entity.getUsername())
                .email(entity.getEmail())
                .fullName(entity.getFullName())
                .gender(entity.isGender())
                .dateOfBirth(entity.getDateOfBirth())
                .build();

        return model;
    }
}
