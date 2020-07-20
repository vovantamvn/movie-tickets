package com.project.movietickets.repository;

import com.project.movietickets.entity.MovieEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class MovieRepositoryTest {
    @Autowired
    private MovieRepository repository;

    @Test
    public void testInsertMovieToDatabase() {
        MovieEntity created = MovieEntity.builder()
                .name("Name")
                .description("Description")
                .director("Director")
                .category("Category")
                .premiere(LocalDate.now())
                .time(120)
                .language("Viet Nam")
                .image("http://images").build();

        MovieEntity result = repository.save(created);

        assertEquals(created.getName(), result.getName());
        assertEquals(created.getDescription(), result.getDescription());
        assertEquals(created.getDirector(), result.getDirector());
        assertEquals(created.getCategory(), result.getCategory());
        assertEquals(created.getPremiere(), result.getPremiere());
        assertEquals(created.getTime(), result.getTime());
        assertEquals(created.getLanguage(), result.getLanguage());
        assertEquals(created.getImage(), result.getImage());

    }

    @Test
    public void testFunctionGetTopMovie() {
        MovieEntity created = MovieEntity.builder()
                .name("Name")
                .description("Description")
                .director("Director")
                .category("Category")
                .premiere(LocalDate.now())
                .time(120)
                .language("Viet Nam")
                .image("http://images").build();

        repository.save(created);
        List<MovieEntity> movies = repository.getTopMovie();

        assertThat(movies.size()).isGreaterThan(0);
    }
}
