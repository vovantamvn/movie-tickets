package com.project.movietickets.service;

import com.project.movietickets.convert.ConvertMovie;
import com.project.movietickets.entity.MovieEntity;
import com.project.movietickets.model.MovieModel;
import com.project.movietickets.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DetailMovieService {
    @Autowired
    private MovieRepository repository;

    public MovieModel getDetailMovie(int id){
        Optional<MovieEntity> opt = repository.findById(id);

        if (opt.isEmpty()){
            throw new RuntimeException("ID not found!");
        }

        return ConvertMovie.toMovieModel(opt.get());
    }
}
