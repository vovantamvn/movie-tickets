package com.project.movietickets.controller;

import com.project.movietickets.model.MovieModel;
import com.project.movietickets.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class HomeController {
    @Autowired
    private HomeService service;

    @RequestMapping("/")
    public String index(Model model){
        List<MovieModel> hotMovies = service.getTopMovie();
        List<MovieModel> newMovies = service.getTopMovie();
        model.addAttribute("hotMovies", hotMovies);
        model.addAttribute("newMovies", newMovies);
        return "index";
    }
}
