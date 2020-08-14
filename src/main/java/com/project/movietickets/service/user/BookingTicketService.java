package com.project.movietickets.service.user;

import com.project.movietickets.entity.TicketEntity;
import com.project.movietickets.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.UUID;

@Service
public class BookingTicketService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoomChairRepository roomChairRepository;

    @Autowired
    private RoomMovieScheduleRepository roomMovieScheduleRepository;

    @Autowired
    private TicketRepository ticketRepository;

    public TicketEntity buyTicket(int scheduleId, String date, int roomChairId, String username) {
        var bookDate = LocalDate.parse(date);
        var roomChair = roomChairRepository.findById(roomChairId).get();
        var roomChairSchedule = roomMovieScheduleRepository.findById(scheduleId).get();
        var code = UUID.randomUUID().toString().substring(0, 13).toUpperCase();
        var user = userRepository.findUserEntityByUsername(username).get();

        roomChair.setStatus(true);
        roomChairRepository.save(roomChair);

        var ticket = TicketEntity.builder()
                .date(bookDate)
                .code(code)
                .roomChair(roomChair)
                .roomMovieSchedule(roomChairSchedule)
                .user(user)
                .build();

        return ticketRepository.save(ticket);
    }
}
