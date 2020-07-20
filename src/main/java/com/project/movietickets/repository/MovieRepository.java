package com.project.movietickets.repository;

import com.project.movietickets.entity.MovieEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository<MovieEntity, Integer> {
    @Query("select m from movies m")
    List<MovieEntity> getTopMovie();
}
