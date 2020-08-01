package com.project.movietickets.controller.user;

import com.project.movietickets.service.user.ChoiceChairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ChoiceChairController {
    @Autowired
    private ChoiceChairService service;

    @RequestMapping(value = "room-map", method = RequestMethod.GET)
    public String index(
            @RequestParam(value = "cinemaSchedule") int cinemaScheduleId,
            @RequestParam(value = "movie") int movieId,
            Model model){

        var rooms = service.getAllRoomOfCinema(1);

        model.addAttribute("rooms", rooms);

        return "room-map";
    }
}
