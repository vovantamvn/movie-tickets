package com.project.movietickets.service;

import com.project.movietickets.convert.ConvertMovie;
import com.project.movietickets.model.MovieModel;
import com.project.movietickets.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class HomeService {
    @Autowired
    private MovieRepository repository;

    public List<MovieModel> getTopMovie(){
        return repository.getTopMovie()
                .stream()
                .map(ConvertMovie::toMovieModel)
                .collect(Collectors.toList());
    }

    public List<MovieModel> getNewMovie(){
        return repository.getTopMovie()
                .stream()
                .map(ConvertMovie::toMovieModel)
                .collect(Collectors.toList());
    }
}
