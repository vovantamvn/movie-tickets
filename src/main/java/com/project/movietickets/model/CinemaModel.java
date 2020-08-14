package com.project.movietickets.model;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class CinemaModel {
    private int id;
    private String name;
    // List schedule of room
    private List<RoomMovieScheduleModel> schedules;

    public CinemaModel(int id, String name, List<RoomMovieScheduleModel> schedules) {
        this.id = id;
        this.name = name;
        this.schedules = schedules;
    }
}
