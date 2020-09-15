package com.project.movietickets.controller.user;

import com.project.movietickets.repository.TicketRepository;
import com.project.movietickets.service.user.BookingTicketService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequiredArgsConstructor
public class BookingTicketController {

    private final BookingTicketService bookingTicketService;

    private final TicketRepository ticketRepository;

    @PostMapping(value = "/booking/ticket")
    public ModelAndView index(
            @RequestParam("scheduleId") int scheduleId,
            @RequestParam("date") String date,
            @RequestParam("roomChairId") int roomChairId,
            Authentication authentication,
            ModelAndView modelAndView
    ) {
        var username = authentication.getName();
        //var ticket = bookingTicketService.buyTicket(scheduleId, date, roomChairId, username);
        var ticket = ticketRepository.findAll().get(0);

        modelAndView.setViewName("user/booking-ticket");
        modelAndView.addObject("ticket", ticket);
        return modelAndView;
    }
}
