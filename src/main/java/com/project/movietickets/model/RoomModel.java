package com.project.movietickets.model;

import com.project.movietickets.entity.CinemaEntity;
import com.project.movietickets.entity.RoomChairEntity;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class RoomModel {
    private int id;
    private String name;
    //private CinemaEntity cinema;
    //private List<RoomChairModel> roomChairs;
}
