package com.project.movietickets.service.user;

import com.project.movietickets.entity.TicketEntity;
import com.project.movietickets.repository.CinemaScheduleRepository;
import com.project.movietickets.repository.MovieRepository;
import com.project.movietickets.repository.RoomChairRepository;
import com.project.movietickets.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.UUID;

@Service
public class BookingTicketService {
    @Autowired
    private TicketRepository ticketRepository;

    @Autowired
    private RoomChairRepository roomChairRepository;

    @Autowired
    private MovieRepository movieRepository;

    @Autowired
    private CinemaScheduleRepository cinemaScheduleRepository;

    public TicketEntity buyTicket(int cinemaScheduleId, String date, int movieId, int roomChairId){
        var roomChair = roomChairRepository.findById(roomChairId).get();
        var movie = movieRepository.findById(movieId).get();
        var cinemaSchedule = cinemaScheduleRepository.findById(cinemaScheduleId).get();

        if (roomChair.isStatus()){
            throw new RuntimeException("The position not valid");
        }

        System.out.println(roomChair.getId());
        //roomChair.setStatus(true);
        //roomChairRepository.save(roomChair);

        var ticket = new TicketEntity();
        ticket.setMovie(movie);
        ticket.setCinemaSchedule(cinemaSchedule);
        ticket.setRoomChair(roomChair);
        //ticket.setDate(LocalDate.parse(date));
        ticket.setCode(UUID.randomUUID().toString());


        //ticketRepository.save(ticket);

        System.out.println(ticket.getId());

        return ticket;
    }
}
