package com.project.movietickets.service.user;

import com.project.movietickets.entity.ChairEntity;
import com.project.movietickets.entity.RoomChairEntity;
import com.project.movietickets.entity.RoomEntity;
import com.project.movietickets.repository.ChairRepository;
import com.project.movietickets.repository.CinemaRepository;
import com.project.movietickets.repository.RoomMovieScheduleRepository;
import com.project.movietickets.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChoiceChairService {
    @Autowired
    private RoomMovieScheduleRepository roomMovieScheduleRepository;

    public List<RoomChairEntity> getAllChairOfSchedule(int scheduleId) {
        var schedule = roomMovieScheduleRepository.findById(scheduleId).get();
        var room = schedule.getRoom();
        var roomChairs = room.getRoomChairs();

        return roomChairs;
    }
}
