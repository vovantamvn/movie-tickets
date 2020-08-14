package com.project.movietickets.controller;

import com.project.movietickets.entity.MovieEntity;
import com.project.movietickets.service.HomeService;
import com.project.movietickets.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class HomeController {
    @Autowired
    private HomeService service;

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model, HttpSession session, Authentication authentication){
        List<MovieEntity> hotMovies = service.getListMovieViewHighest();
        List<MovieEntity> newMovies = service.getListMovieLastest();

        if (authentication != null && authentication.isAuthenticated()){
            String name = authentication.getName();
            session.setAttribute("name", name);

            if (userService.isAdmin(name)){
                session.setAttribute("isAdmin", true);
            }
        }

        model.addAttribute("hotMovies", hotMovies);
        model.addAttribute("newMovies", newMovies);

        return "index";
    }
}
