package com.project.movietickets.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity(name = "rooms")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RoomEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(insertable = false)
    private int id;

    @Column(nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn
    private CinemaEntity cinema;

    @OneToMany(mappedBy = "room", cascade = CascadeType.ALL)
    private List<RoomChairEntity> roomChair;
}
