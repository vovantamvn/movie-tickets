package com.project.movietickets.controller;

import com.project.movietickets.model.MovieModel;
import com.project.movietickets.service.DetailMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DetailMovieController {
    @Autowired
    private DetailMovieService service;

    @RequestMapping(value = "movies/{id}", method = RequestMethod.GET)
    public String index(@PathVariable("id") int id, Model model){
        MovieModel movie = service.getDetailMovie(id);
        model.addAttribute("movie", movie);
        return "detail";
    }
}