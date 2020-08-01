package com.project.movietickets;

import com.project.movietickets.entity.RoomChairEntity;
import com.project.movietickets.entity.UserEntity;
import com.project.movietickets.repository.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        var app = SpringApplication.run(Application.class, args);
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
