package com.project.movietickets.service;

import com.project.movietickets.entity.CityEntity;
import com.project.movietickets.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketsBookingService {
    @Autowired
    private CityRepository cityRepository;

    public List<CityEntity> getAllCity(){
        return cityRepository.findAll();
    }
}
