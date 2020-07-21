package com.project.movietickets.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

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
}
