package com.project.movietickets.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity(name = "tickets")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TicketEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(insertable = false)
    private int id;

    private LocalDate date;

    @ManyToOne
    @JoinColumn
    private MovieEntity movie;

    @ManyToOne
    @JoinColumn
    private CinemaScheduleEntity cinemaSchedule;

    @ManyToOne
    @JoinColumn
    private RoomChairEntity roomChair;
}
