package com.project.movietickets.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity(name = "tickets")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TicketEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(insertable = false)
    private int id;

//    private MovieEntity movie;
//    private RoomEntity room;
//    private ChairEntity chair;

}
