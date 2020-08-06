package com.project.movietickets.controller.admin;

import com.project.movietickets.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("admin")
public class MovieController {
    @Autowired
    private MovieService service;

    @GetMapping(value = {"/movies", "/"})
    public String index(Model model) {
        var movies = service.getAllMovie();
        model.addAttribute("movies", movies);
        return "admin/movie/index";
    }

    /**
     * For create movie
     *
     * @return String
     */
    @GetMapping("/movies/create")
    public String create() {
        return "admin/movie/create";
    }

    @PostMapping("/movies")
    public String createMovie(
            @RequestParam("name") String name,
            @RequestParam("description") String description,
            @RequestParam("director") String director,
            @RequestParam("category") String category,
            @RequestParam("premiere") String premiere,
            @RequestParam("time") int time,
            @RequestParam("language") String language
    ) {
        service.createMovie(
                name, description, director, category, premiere, time, language
        );

        return "redirect:/admin/movies";
    }

    /**
     * For update movie
     * @param id
     * @param model
     * @return String
     */
    @GetMapping("/movies/{id}")
    public String detail(
            @PathVariable("id") int id,
            Model model
    ) {
        var movie = service.findById(id);
        model.addAttribute("movie", movie);

        return "admin/movie/update";
    }

    @PostMapping("/movies/{id}")
    public String update(
            @PathVariable("id") int id,
            @RequestParam("name") String name,
            @RequestParam("description") String description,
            @RequestParam("director") String director,
            @RequestParam("category") String category,
            @RequestParam("premiere") String premiere,
            @RequestParam("time") int time,
            @RequestParam("language") String language
    ) {
        service.updateMovie(
                id, name, description, director, category, premiere, time, language
        );

        return "redirect:/admin/movies";
    }

    /**
     * For delete movie
     * @param id
     * @return String
     */
    @GetMapping("/movies/{id}/delete")
    public String delete(@PathVariable("id") int id){
        service.deleteMovie(id);

        return "redirect:/admin/movies";
    }
}
