package com.project.movietickets.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;

import javax.persistence.*;
import java.time.LocalTime;
import java.util.List;

@Entity(name = "schedules")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ScheduleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(insertable = false)
    private int id;
    private LocalTime time;

    @OneToMany(mappedBy = "schedule", cascade = CascadeType.ALL)
    private List<CinemaScheduleEntity> roomSchedules;
}
