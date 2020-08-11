package com.project.movietickets.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalTime;
import java.util.List;

@Entity(name = "schedules")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ScheduleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(insertable = false)
    private int id;
    private LocalTime time;

    @OneToMany(mappedBy = "schedule", cascade = CascadeType.ALL)
    private List<RoomMovieScheduleEntity> roomSchedules;
}
