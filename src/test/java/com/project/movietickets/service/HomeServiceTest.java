package com.project.movietickets.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import com.project.movietickets.entity.MovieEntity;
import com.project.movietickets.repository.MovieRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.time.LocalDate;
import java.util.List;

@SpringBootTest
public class HomeServiceTest {
    @MockBean
    private MovieRepository repository;

    @Autowired
    private HomeService service;

    @Test
    public void testServiceWillCallFunctionGetTopNewMovieLastest() {
        service.getListMovieLastest();

        verify(repository).getTopNewMovieLastest();
    }

    @Test
    public void testServiceWillCallFunctionGetListMovieViewHighest() {
        service.getListMovieViewHighest();

        verify(repository).getListMovieViewHighest();
    }
}
