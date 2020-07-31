package com.project.movietickets.service;

import com.project.movietickets.convert.ConverCity;
import com.project.movietickets.entity.CityEntity;
import com.project.movietickets.model.CityModel;
import com.project.movietickets.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TicketsBookingService {
    @Autowired
    private CityRepository cityRepository;

    public List<CityModel> getAllCity(){
        return cityRepository.findAll()
                .stream()
                .map(ConverCity::toModel)
                .collect(Collectors.toList());
    }
}
