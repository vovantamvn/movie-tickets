package com.project.movietickets.controller;

import com.project.movietickets.entity.CinemaEntity;
import com.project.movietickets.entity.CityEntity;
import com.project.movietickets.model.CityModel;
import com.project.movietickets.service.TicketsBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class TicketBookingController {
    @Autowired
    private TicketsBookingService service;

    @RequestMapping(value = "/booking", method = RequestMethod.GET)
    public String index(@RequestParam(value = "index", required = false, defaultValue = "0") int index, Model model){

        List<CityModel> citys = service.getAllCity();
        model.addAttribute("index", index);
        model.addAttribute("citys", citys);
        return "booking";
    }

    @RequestMapping(value = "/booking/{id}", method = RequestMethod.GET)
    public String booking(@PathVariable("id") int cinemaId) {
        return "map-cinema";
    }
}
