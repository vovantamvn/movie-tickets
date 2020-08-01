package com.project.movietickets.repository;

import com.project.movietickets.entity.CinemaScheduleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CinemaScheduleRepository extends JpaRepository<CinemaScheduleEntity, Integer> {
}
