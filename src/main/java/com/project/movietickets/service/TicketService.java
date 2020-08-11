package com.project.movietickets.service;

import com.project.movietickets.entity.TicketEntity;
import com.project.movietickets.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class TicketService {
    @Autowired
    private TicketRepository ticketRepository;

    public List<TicketEntity> getAllTicketLastMonth(){
        final var lastMonth = LocalDate.now().minusMonths(1);
        return ticketRepository.getAllByDateGreaterThanOrderByDateAsc(lastMonth);
    }
}
