package com.project.movietickets.service.user;

import com.project.movietickets.entity.ChairEntity;
import com.project.movietickets.entity.RoomChairEntity;
import com.project.movietickets.repository.RoomMovieScheduleRepository;
import com.project.movietickets.repository.custom.FindListChairRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ChoiceChairService {

    private final RoomMovieScheduleRepository roomMovieScheduleRepository;

    private final FindListChairRepository findListChairRepository;

    public List<RoomChairEntity> getAllChairOfSchedule(int scheduleId) {
        var schedule = roomMovieScheduleRepository.findById(scheduleId).get();
        var room = schedule.getRoom();
        var roomChairs = room.getRoomChairs();

        List<ChairEntity> chairs = findListChairRepository.findListChair(scheduleId);
        List<String> listChairUsed = chairs.stream()
                .map(chairEntity -> chairEntity.getPosition())
                .collect(Collectors.toList());

        for (var roomChair : roomChairs) {
            String position = roomChair.getChair().getPosition();
            if (listChairUsed.contains(position)) {
                roomChair.setStatus(true);
            } else {
                roomChair.setStatus(false);
            }
        }

        return roomChairs;
    }
}
