package com.project.movietickets.controller.user;

import com.project.movietickets.service.user.BookingTicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
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
            @RequestParam("scheduleId") int scheduleId,
            @RequestParam("date") String date,
            @RequestParam("roomChairId") int roomChairId,
            Authentication authentication,
            Model model
    ) {
        var username = authentication.getName();
        var result = service.buyTicket(scheduleId, date, roomChairId, username);

        model.addAttribute("code", result.getCode());
        return "user/booking-ticket";
    }
}
