package com.project.movietickets.repository;

import com.project.movietickets.entity.TicketEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface TicketRepository extends JpaRepository<TicketEntity, Integer> {
    List<TicketEntity> getAllByDateGreaterThanOrderByDateAsc(LocalDate date);
    List<TicketEntity> findAllByUserUsernameOrderByDateDesc(String username);
}
