package com.project.movietickets.controller;

import com.project.movietickets.entity.MovieEntity;
import com.project.movietickets.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class HomeController {
    @Autowired
    private HomeService service;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model){
        List<MovieEntity> hotMovies = service.getListMovieViewHighest();
        List<MovieEntity> newMovies = service.getListMovieLastest();

        model.addAttribute("hotMovies", hotMovies);
        model.addAttribute("newMovies", newMovies);

        return "index";
    }
}
