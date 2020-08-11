package com.project.movietickets.service;

import com.project.movietickets.entity.RoomMovieScheduleEntity;
import com.project.movietickets.repository.MovieRepository;
import com.project.movietickets.repository.RoomMovieScheduleRepository;
import com.project.movietickets.repository.RoomRepository;
import com.project.movietickets.repository.ScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class RoomMovieScheduleService {
    @Autowired
    private RoomMovieScheduleRepository roomMovieScheduleRepository;

    @Autowired
    private RoomRepository roomRepository;

    @Autowired
    private MovieRepository movieRepository;

    @Autowired
    private ScheduleRepository scheduleRepository;

    public List<RoomMovieScheduleEntity> getAllSchedule() {
        return roomMovieScheduleRepository.findAll();
    }

    @Transactional
    public RoomMovieScheduleEntity createRoomMovieSchedule(int roomId, int movieId, int scheduleId) {
        final var room = roomRepository.findById(roomId).get();
        final var movie = movieRepository.findById(movieId).get();
        final var schedule = scheduleRepository.findById(scheduleId).get();

        final var roomMovieSchedule = RoomMovieScheduleEntity.builder()
                .room(room)
                .schedule(schedule)
                .movie(movie)
                .build();

        return roomMovieScheduleRepository.save(roomMovieSchedule);
    }
}
