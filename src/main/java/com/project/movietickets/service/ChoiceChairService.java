package com.project.movietickets.service;

import com.project.movietickets.convert.ConvertRoom;
import com.project.movietickets.entity.RoomEntity;
import com.project.movietickets.model.RoomModel;
import com.project.movietickets.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ChoiceChairService {
    @Autowired
    private RoomRepository roomRepository;

    public List<RoomModel> getAllRoomOfCinema(int cinemaId) {
        return roomRepository
                .getRoomEntitiesByCinema_IdOrderByName(cinemaId)
                .stream()
                .map(ConvertRoom::toModel)
                .collect(Collectors.toList());
    }
}
