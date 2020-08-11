package com.project.movietickets.controller.admin;

import com.project.movietickets.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/admin")
public class ReportController {
    @Autowired
    private TicketService ticketService;

    @RequestMapping(value = "/reports", method = RequestMethod.GET)
    public String index(Model model){
        final var tickets = ticketService.getAllTicketLastMonth();
        model.addAttribute("tickets", tickets);
        System.out.println(tickets.size());
        return "admin/report/index";
    }
}
