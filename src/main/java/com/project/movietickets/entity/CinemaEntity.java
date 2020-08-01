package com.project.movietickets.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity(name = "cinemas")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CinemaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(insertable = false)
    private int id;
    @Column(nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn
    private CityEntity city;

    @OneToMany(mappedBy = "cinema", cascade = CascadeType.ALL)
    private List<RoomEntity> rooms;

    @OneToMany(mappedBy = "cinema", cascade = CascadeType.ALL)
    private List<CinemaScheduleEntity> cinemaSchedules;
}
