package com.project.movietickets.controller.web.admin;

import com.project.movietickets.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/admin")
public class UpdateMovieController {
    @Autowired
    private MovieService service;

    @RequestMapping(value = "/movies/{id}/update", method = RequestMethod.GET)
    public String index(
            @PathVariable("id") int id,
            Model model
    ){
        var movie = service.findById(id);
        model.addAttribute("movie", movie);
        return "admin/movie/update";
    }


    @RequestMapping(value = "/movies/{id}/update", method = RequestMethod.POST)
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
}
