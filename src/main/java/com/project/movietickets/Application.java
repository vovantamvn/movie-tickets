package com.project.movietickets;

import com.project.movietickets.entity.*;
import com.project.movietickets.repository.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Random;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        var app = SpringApplication.run(Application.class, args);
        //seedSchedule(app);
    }

    private static void seedSchedule(ConfigurableApplicationContext app){

    }

    private static void seedDB(ConfigurableApplicationContext app){
        final var roomChairRepo = app.getBean(RoomChairRepository.class);
        final var chairRepo = app.getBean(ChairRepository.class);
        final var roomRepo = app.getBean(RoomRepository.class);

        roomRepo.findAll().forEach( item ->{
            var chairs = chairRepo.findAll();
            for (var chair: chairs){
                var roomChair = RoomChairEntity.builder()
                        .chair(chair)
                        .room(item)
                        .build();

                roomChairRepo.save(roomChair);
            }
        });
    }

}
