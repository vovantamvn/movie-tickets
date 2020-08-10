package com.project.movietickets.service;

import com.project.movietickets.entity.CinemaEntity;
import com.project.movietickets.repository.CinemaRepository;
import com.project.movietickets.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CinemaService {
    @Autowired
    private CinemaRepository cinemaRepository;

    @Autowired
    private CityRepository cityRepository;

    public List<CinemaEntity> getAllCinema() {
        return cinemaRepository.findAll();
    }

    public void deleteCinema(int id) {
        final var cinema = cinemaRepository.findById(id).get();
        cinema.setCity(null);
        cinemaRepository.save(cinema);
        cinemaRepository.deleteById(id);
    }

    public CinemaEntity createCinema(String name, int cityId) {
        var city = cityRepository.findById(cityId).get();
        var cinema = new CinemaEntity();
        cinema.setCity(city);
        cinema.setName(name);

        return cinemaRepository.save(cinema);
    }

    public CinemaEntity updateCinema(int id, String name, int cityId) {
        var city = cityRepository.findById(cityId).get();
        var cinema = cinemaRepository.findById(id).get();
        cinema.setCity(city);
        cinema.setName(name);

        return cinemaRepository.save(cinema);
    }

    public CinemaEntity findById(int id) {
        return cinemaRepository.findById(id).get();
    }
}
