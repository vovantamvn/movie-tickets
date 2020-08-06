package com.project.movietickets.controller.user;

import com.project.movietickets.service.user.BookingTicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BookingTicketController {
    @Autowired
    private BookingTicketService service;

    @RequestMapping(value = "/booking/ticket", method = RequestMethod.POST)
    public String index(
            @RequestParam("cinemaScheduleId") int cinemaScheduleId,
            @RequestParam("date") String date,
            @RequestParam("movieId") int movieId,
            @RequestParam("roomChairId") int roomChairId,
            Model model
    ) {
        var result = service.buyTicket(cinemaScheduleId, date, movieId, roomChairId);
        model.addAttribute("code", result.getCode());
        return "user/booking-ticket";
    }
}
