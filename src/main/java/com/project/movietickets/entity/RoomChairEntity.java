package com.project.movietickets.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity(name = "room_chairs")
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

    @OneToMany(mappedBy = "roomChair", cascade = CascadeType.ALL)
    private List<TicketEntity> tickets;
}
