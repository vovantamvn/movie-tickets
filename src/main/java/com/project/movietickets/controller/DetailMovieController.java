package com.project.movietickets.controller;

import com.project.movietickets.entity.MovieEntity;
import com.project.movietickets.service.DetailMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DetailMovieController {
    @Autowired
    private DetailMovieService service;

    @RequestMapping(value = "movies", method = RequestMethod.GET)
    public String index(@RequestParam("id") int id, Model model){
        MovieEntity movie = service.getDetailMovie(id);
        model.addAttribute("movie", movie);
        return "detail";
    }
}
