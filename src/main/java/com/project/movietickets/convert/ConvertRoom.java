package com.project.movietickets.convert;

import com.project.movietickets.entity.RoomEntity;
import com.project.movietickets.model.RoomModel;

public class ConvertRoom {
    private ConvertRoom(){}

    public static RoomEntity toEntity(RoomModel model){
        RoomEntity entity = RoomEntity.builder()
                .id(model.getId())
                .name(model.getName())
                .build();

        return entity;
    }

    public static RoomModel toModel(RoomEntity entity){
        //var r

        RoomModel model = RoomModel.builder()
                .id(entity.getId())
                .name(entity.getName())
                .build();

        return model;
    }
}
