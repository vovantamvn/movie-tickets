package com.project.movietickets.repository;

import com.project.movietickets.entity.CinemaEntity;
import com.project.movietickets.entity.CityEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CinemaRepositoryTest {
    @Autowired
    private CinemaRepository repository;
    @Autowired
    private CityRepository cityRepository;

    @Test
    public void testInsertCinemaToDataBase(){
        CinemaEntity created = CinemaEntity.builder()
                .name("CGV")
                .build();

        CinemaEntity result = repository.save(created);

        assertEquals("CGV", result.getName());
    }

    @Test
    public void testInsertCityOfCinemaToDataBase(){
        CityEntity city = CityEntity.builder()
                .name("Ha Noi")
                .build();

        CinemaEntity created = CinemaEntity.builder()
                .name("CGV")
                .city(city)
                .build();

        cityRepository.save(city);
        CinemaEntity result = repository.save(created);

        assertEquals("Ha Noi", result.getCity().getName());
    }
}
