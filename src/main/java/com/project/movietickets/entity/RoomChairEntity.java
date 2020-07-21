package com.project.movietickets.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity(name = "room_chair")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RoomChairEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(insertable = false)
    private int id;

    @ManyToOne
    @JoinColumn
    private ChairEntity chair;

    @ManyToOne
    @JoinColumn
    private RoomEntity room;

    private boolean status = false;
}
