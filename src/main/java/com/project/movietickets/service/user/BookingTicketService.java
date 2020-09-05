package com.project.movietickets.service.user;

import com.project.movietickets.entity.TicketEntity;
import com.project.movietickets.repository.*;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BookingTicketService {

    private final UserRepository userRepository;

    private final RoomChairRepository roomChairRepository;

    private final RoomMovieScheduleRepository roomMovieScheduleRepository;

    private final TicketRepository ticketRepository;

    public TicketEntity buyTicket(int scheduleId, String date, int roomChairId, String username) {
        var bookDate = LocalDate.parse(date);
        if ( !isTicketValid(scheduleId, bookDate, roomChairId)) {
            return null;
        }

        var roomChair = roomChairRepository.getOne(roomChairId);
        var roomChairSchedule = roomMovieScheduleRepository.getOne(scheduleId);
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

        return ticket; //ticketRepository.save(ticket);
    }

    private boolean isTicketValid(int scheduleId, LocalDate date, int roomChairId){
        List<TicketEntity> tickets = ticketRepository.findTicketEntitiesByDate(date).stream()
                .filter(ticket -> ticket.getRoomChair().getId() == roomChairId)
                .filter(ticket -> ticket.getRoomMovieSchedule().getSchedule().getId() == scheduleId)
                .collect(Collectors.toList());

        return tickets.size() == 0;
    }
}
