package com.project.movietickets.service.user;

import com.project.movietickets.entity.*;
import com.project.movietickets.repository.TicketRepository;
import com.project.movietickets.service.ScheduleService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.jdbc.Sql;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BookingTicketServiceTest {

    @Autowired
    private BookingTicketService bookingTicketService;

    @MockBean
    private TicketRepository ticketRepository;

    @Test
    void testIsTicketValid() {
        var room = RoomEntity.builder()
                .id(1).build();

        var movie = MovieEntity.builder()
                .id(12).build();

        var schedule = ScheduleEntity.builder()
                .id(15).build();

        var roomChairSchedule = RoomMovieScheduleEntity.builder()
                .schedule(schedule)
                .room(room)
                .movie(movie)
                .build();

        var chair = ChairEntity.builder()
                .id(14).build();

        var roomChair = RoomChairEntity.builder()
                .room(room)
                .chair(chair)
                .build();

        final var ticket = TicketEntity.builder()
                .roomMovieSchedule(roomChairSchedule)
                .code("123456")
                .date(LocalDate.now())
                .roomChair(roomChair)
                .build();

        var roomMovieSchedule = ticket.getRoomMovieSchedule();
        var scheduleId = roomMovieSchedule.getSchedule().getId();
        var date = ticket.getDate();
        var roomChairId = ticket.getRoomChair().getId();

        Mockito.when(ticketRepository.findTicketEntitiesByDate(LocalDate.now()))
                .thenReturn(List.of(ticket));

        boolean result = bookingTicketService.isTicketValid(scheduleId, date, roomChairId);

        assertEquals(false, result);
    }
}