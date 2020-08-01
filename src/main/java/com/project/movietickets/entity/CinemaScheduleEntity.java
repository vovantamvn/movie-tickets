package com.project.movietickets.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;

import javax.persistence.*;
import java.util.List;

@Entity(name = "cinema_schedules")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CinemaScheduleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(insertable = false)
    private int id;

    @ManyToOne
    @JoinColumn
    private CinemaEntity cinema;

    @ManyToOne
    @JoinColumn
    private ScheduleEntity schedule;

    @OneToMany(mappedBy = "cinemaSchedule", cascade = CascadeType.ALL)
    private List<TicketEntity> tickets;
}
