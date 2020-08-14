package com.project.movietickets.controller.admin;

import com.project.movietickets.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.util.UUID;

@Controller
public class MovieController {
    @Autowired
    private MovieService service;

    @RequestMapping(value = {"/admin", "admin/movies"}, method = RequestMethod.GET)
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
    @RequestMapping(value = "admin/movies/create", method = RequestMethod.GET)
    public String create() {
        return "admin/movie/create";
    }

    @RequestMapping(value = "admin/movies", method = RequestMethod.POST)
    public String createMovie(
            @RequestParam("name") String name,
            @RequestParam("description") String description,
            @RequestParam("director") String director,
            @RequestParam("category") String category,
            @RequestParam("premiere") String premiere,
            @RequestParam("time") int time,
            @RequestParam("language") String language,
            @RequestParam("image") MultipartFile image
    ) {
        service.createMovie(
                name, description, director, category, premiere, time, language, image
        );

        return "redirect:/admin/movies";
    }

    /**
     * For delete movie
     *
     * @param id
     * @return String
     */
    @GetMapping("admin/movies/{id}/delete")
    public String delete(@PathVariable("id") int id) {
        service.deleteMovie(id);

        return "redirect:/admin/movies";
    }

}