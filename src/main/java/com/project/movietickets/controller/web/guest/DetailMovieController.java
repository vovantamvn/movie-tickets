package com.project.movietickets.controller.web.guest;

import com.project.movietickets.entity.MovieEntity;
import com.project.movietickets.service.DetailMovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class DetailMovieController {

    private final DetailMovieService detailMovieService;

    @RequestMapping(value = "movies", method = RequestMethod.GET)
    public String index(@RequestParam("id") int id, Model model){
        var movie = detailMovieService.getDetailMovie(id);
        model.addAttribute("movie", movie);
        return "detail";
    }
}
