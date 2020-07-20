package com.project.movietickets.model;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Objects;

@Data
@Builder
public class MovieModel {
    private int id;
    private String name;
    private String description;
    private String director;
    private String category;
    private LocalDate premiere;
    private int time;
    private String language;
    private String image;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MovieModel model = (MovieModel) o;
        return getTime() == model.getTime() &&
                Objects.equals(getName(), model.getName()) &&
                Objects.equals(getDescription(), model.getDescription()) &&
                Objects.equals(getDirector(), model.getDirector()) &&
                Objects.equals(getCategory(), model.getCategory()) &&
                Objects.equals(getPremiere(), model.getPremiere()) &&
                Objects.equals(getLanguage(), model.getLanguage()) &&
                Objects.equals(getImage(), model.getImage());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getDescription(), getDirector(), getCategory(), getPremiere(), getTime(), getLanguage(), getImage());
    }
}
