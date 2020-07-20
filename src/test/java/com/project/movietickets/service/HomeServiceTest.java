package com.project.movietickets.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import com.project.movietickets.entity.MovieEntity;
import com.project.movietickets.model.MovieModel;
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
    public void testHomeServiceWillReturnValue() throws Exception {
        List<MovieEntity> models = List.of(
                MovieEntity.builder()
                        .name("Name")
                        .description("Description")
                        .director("Director")
                        .category("Category")
                        .premiere(LocalDate.now())
                        .time(120)
                        .language("Viet Nam")
                        .image("http://images")
                        .build());

        when(repository.getTopMovie()).thenReturn(models);

        List<MovieModel> result = service.getTopMovie();
        assertEquals(1, result.size());
    }
}
