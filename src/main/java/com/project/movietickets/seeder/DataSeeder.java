package com.project.movietickets.seeder;

import com.project.movietickets.entity.RoomMovieScheduleEntity;
import com.project.movietickets.repository.MovieRepository;
import com.project.movietickets.repository.RoomMovieScheduleRepository;
import com.project.movietickets.repository.RoomRepository;
import com.project.movietickets.repository.ScheduleRepository;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Random;

public class DataSeeder {
    private final ConfigurableApplicationContext app;

    public DataSeeder(ConfigurableApplicationContext app) {
        this.app = app;
    }

    public void seedRoomMovieSchedule(){
        var roomRepo = app.getBean(RoomRepository.class);
        var movieRepo = app.getBean(MovieRepository.class);
        var scheduleRepo = app.getBean(ScheduleRepository.class);
        var repository = app.getBean(RoomMovieScheduleRepository.class);

        var rooms = roomRepo.findAll();
        var movies = movieRepo.findAll();
        var schedules = scheduleRepo.findAll();

        var random = new Random(System.currentTimeMillis());

        for (var room: rooms){
            var movieIndex = Math.abs(random.nextInt() % movies.size());
            var scheduleIndex = Math.abs(random.nextInt() % schedules.size());

            var roomMovieSchedule = RoomMovieScheduleEntity.builder()
                    .room(room)
                    .movie(movies.get(movieIndex))
                    .schedule(schedules.get(scheduleIndex))
                    .build();

            repository.save(roomMovieSchedule);
        }
    }
}
