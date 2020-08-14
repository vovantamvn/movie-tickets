package com.project.movietickets.service;

import com.project.movietickets.entity.RoomEntity;
import com.project.movietickets.repository.CinemaRepository;
import com.project.movietickets.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomService {
    @Autowired
    private RoomRepository roomRepository;

    @Autowired
    private CinemaRepository cinemaRepository;

    public List<RoomEntity> getAllRoom(){
        return roomRepository.findAll();
    }

    public RoomEntity create(String name, int cinemaId) {
        final var cinema = cinemaRepository.findById(cinemaId).get();
        final var room = new RoomEntity();
        room.setCinema(cinema);
        room.setName(name);

        return roomRepository.save(room);
    }
}
