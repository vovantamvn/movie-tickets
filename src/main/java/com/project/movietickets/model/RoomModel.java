package com.project.movietickets.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RoomModel {
    private int id;
    private String name;
}
