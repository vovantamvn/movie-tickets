package com.project.movietickets.controller.web.user;

import com.project.movietickets.model.CityModel;
import com.project.movietickets.service.user.BookingCinemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.util.List;

@Controller
public class BookingCinemaController {
    @Autowired
    private BookingCinemaService service;

    @RequestMapping(value = "/booking", method = RequestMethod.GET)
    public String index(@RequestParam(value = "movie") int movieId, Model model){
        List<CityModel> cities = service.getAllCityModelHasMovie(movieId);
        List<LocalDate> dates = service.getAllDayOfWeek();

        model.addAttribute("dates", dates);
        model.addAttribute("cities", cities);
        return "user/booking-cinema";
    }

}
