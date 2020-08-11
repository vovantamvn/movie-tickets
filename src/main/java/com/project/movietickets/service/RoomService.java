package com.project.movietickets.service;

import com.project.movietickets.entity.RoomEntity;
import com.project.movietickets.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomService {
    @Autowired
    private RoomRepository roomRepository;

    public List<RoomEntity> getAllRoom(){
        return roomRepository.findAll();
    }
}
