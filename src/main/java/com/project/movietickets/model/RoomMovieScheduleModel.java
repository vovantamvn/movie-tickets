package com.project.movietickets.model;

import com.project.movietickets.entity.RoomMovieScheduleEntity;
import com.project.movietickets.entity.ScheduleEntity;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalTime;

@Getter
@Setter
/**
 * For name and time and movie
 */
public class RoomMovieScheduleModel {

    private int id;
    private LocalTime time;
    private String name;

    public RoomMovieScheduleModel(){
    }

    public RoomMovieScheduleModel(RoomMovieScheduleEntity entity){
        this.id = entity.getId();
        this.time = entity.getSchedule().getTime();
        this.name = entity.getRoom().getName();
    }
}
