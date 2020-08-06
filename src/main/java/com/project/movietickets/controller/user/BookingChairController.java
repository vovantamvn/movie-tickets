package com.project.movietickets.controller.user;

import com.project.movietickets.service.user.ChoiceChairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BookingChairController {
    @Autowired
    private ChoiceChairService service;

    @RequestMapping(value = "booking/chair", method = RequestMethod.POST)
    public String index(
            @RequestParam("date") String date,
            @RequestParam("schedule_cinema") int cinemaScheduleId,
            @RequestParam("movie") int movieId,
            Model model){

        var rooms = service.getAllRoomOfCinema(1);

        model.addAttribute("date", date);
        model.addAttribute("cinemaScheduleId", cinemaScheduleId);
        model.addAttribute("movieId", movieId);
        model.addAttribute("rooms", rooms);

        return "user/booking-chair";
    }
}
