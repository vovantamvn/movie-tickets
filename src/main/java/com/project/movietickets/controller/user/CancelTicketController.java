package com.project.movietickets.controller.user;

import com.project.movietickets.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CancelTicketController {
    @Autowired
    private TicketService ticketService;

    @RequestMapping(value = "/history", method = RequestMethod.GET)
    public String index(Model model, Authentication authentication){
        final var username = authentication.getName();
        final var tickets = ticketService.getAllByUser(username);
        model.addAttribute("tickets", tickets);
        return "user/history";
    }

    @RequestMapping(value = "/history/{id}/delete")
    public String delete(@PathVariable("id") int id){
        ticketService.deleteTicket(id);
        return "redirect:/history";
    }
}
