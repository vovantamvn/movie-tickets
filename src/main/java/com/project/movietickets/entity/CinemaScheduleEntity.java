package com.project.movietickets.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity(name = "cinema_schedules")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
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
