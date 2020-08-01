package com.project.movietickets.service.user;

import com.project.movietickets.entity.RoomEntity;
import com.project.movietickets.repository.CinemaRepository;
import com.project.movietickets.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChoiceChairService {

    @Autowired
    private CinemaRepository cinemaRepository;

    public List<RoomEntity> getAllRoomOfCinema(int cinemaId) {
        var cinema = cinemaRepository.findById(cinemaId).get();
        var rooms = cinema.getRooms();

        return rooms;
    }
}
