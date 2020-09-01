package com.project.movietickets.controller.user;

import com.project.movietickets.repository.TicketRepository;
import com.project.movietickets.service.user.BookingTicketService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class BookingTicketController {

    private final BookingTicketService bookingTicketService;
    private final TicketRepository ticketRepository;

    @RequestMapping(value = "/booking/ticket", method = RequestMethod.GET)
    public String index(
//            @RequestParam("scheduleId") int scheduleId,
//            @RequestParam("date") String date,
//            @RequestParam("roomChairId") int roomChairId,
            Authentication authentication,
            Model model
    ) {
//        var username = authentication.getName();
//        var ticket = bookingTicketService.buyTicket(scheduleId, date, roomChairId, username);

        var ticket = ticketRepository.findAll().get(0);

        model.addAttribute("ticket", ticket);
        return "user/booking-ticket";
    }
}
