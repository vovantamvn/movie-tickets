package com.project.movietickets.service;

import com.project.movietickets.entity.MovieEntity;
import com.project.movietickets.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;

    public List<MovieEntity> getAllMovie() {
        return movieRepository.findAll();
    }

    public void deleteMovie(int id) {
        movieRepository.deleteById(id);
    }

    public MovieEntity createMovie(
            String name,
            String description,
            String director,
            String category,
            String premiere,
            int time,
            String language
    ) {

        var movie = MovieEntity.builder()
                .name(name)
                .description(description)
                .director(director)
                .category(category)
                .premiere(LocalDate.parse(premiere))
                .time(time)
                .language(language)
                .build();

        return movieRepository.save(movie);
    }

    public MovieEntity updateMovie(
            int id,
            String name,
            String description,
            String director,
            String category,
            String premiere,
            int time,
            String language
    ) {

        var movie = movieRepository.findById(id).get();

        movie = MovieEntity.builder()
                .name(name)
                .description(description)
                .director(director)
                .category(category)
                .premiere(LocalDate.parse(premiere))
                .time(time)
                .language(language)
                .build();

        return movieRepository.save(movie);
    }

    public MovieEntity findById(int id) {
        return movieRepository.findById(id).get();
    }
}
