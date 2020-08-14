package com.project.movietickets.repository;

import com.project.movietickets.entity.RoomMovieScheduleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoomMovieScheduleRepository extends JpaRepository<RoomMovieScheduleEntity, Integer> {
    List<RoomMovieScheduleEntity> findRoomMovieScheduleEntitiesByMovie_Id(int movieId);
}
