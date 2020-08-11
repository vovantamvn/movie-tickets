package com.project.movietickets.service;

import com.project.movietickets.entity.MovieEntity;
import com.project.movietickets.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HomeService {
    private final MovieRepository repository;

    @Autowired
    public HomeService(MovieRepository repository) {
        this.repository = repository;
    }

    public List<MovieEntity> getListMovieViewHighest(){
        return repository.getListMovieViewHighest();
    }

    public List<MovieEntity> getListMovieLastest(){
        return repository.getTopNewMovieLastest();
    }
}
