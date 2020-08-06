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

    public List<CinemaEntity> getAllCinema(){
        return cinemaRepository.findAll();
    }

    public void deleteCinema(int id){
        cinemaRepository.deleteById(id);
    }

    public CinemaEntity createCinema(String name, int cityId){
        var cinema = new CinemaEntity();
        cinema.setName(name);

        var optionalCityEntity = cityRepository.findById(cityId);
        optionalCityEntity.ifPresent( city -> {
            cinema.setCity(city);
        });

        return cinemaRepository.save(cinema);
    }

    public CinemaEntity updateCinema(int cinemaId, String name, int cityId){
        var cinema = cinemaRepository.findById(cinemaId).get();
        cinema.setName(name);

        var optionalCityEntity = cityRepository.findById(cityId);
        optionalCityEntity.ifPresent( city -> {
            cinema.setCity(city);
        });

        return cinemaRepository.save(cinema);
    }
}
