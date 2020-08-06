package com.project.movietickets.controller.user;

import com.project.movietickets.entity.CityEntity;
import com.project.movietickets.service.user.TicketsBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class BookingCinemaController {
    @Autowired
    private TicketsBookingService service;

    @RequestMapping(value = "/booking", method = RequestMethod.GET)
    public String index(@RequestParam(value = "movie") int movieId, Model model){
        List<CityEntity> cities = service.getAllCity();

        model.addAttribute("movie", movieId);
        model.addAttribute("cities", cities);
        return "user/booking-cinema";
    }

}
