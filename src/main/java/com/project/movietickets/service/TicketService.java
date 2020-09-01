package com.project.movietickets.service;

import com.project.movietickets.entity.TicketEntity;
import com.project.movietickets.repository.RoomChairRepository;
import com.project.movietickets.repository.TicketRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TicketService {

    private final TicketRepository ticketRepository;

    private final RoomChairRepository roomChairRepository;

    public List<TicketEntity> getAllTicketLastMonth(){
        final var lastMonth = LocalDate.now().minusMonths(1);
        return ticketRepository.getAllByDateGreaterThanOrderByDateAsc(lastMonth);
    }

    public List<TicketEntity> getAllByUser(String username) {
        return ticketRepository.findAllByUserUsernameOrderByDateDesc(username);
    }

    @Transactional
    public void deleteTicket(int id) {
        final var ticket = ticketRepository.findById(id).get();
        final var roomChair = ticket.getRoomChair();

        roomChair.setStatus(false);
        roomChairRepository.save(roomChair);
        ticketRepository.deleteById(id);

        assert ticketRepository.findById(id).isEmpty() : new RuntimeException("Can not delete ticket");
    }

    public Optional<TicketEntity> findTicketByCode(String code) {
        return ticketRepository.findTicketEntityByCode(code);
    }
}
