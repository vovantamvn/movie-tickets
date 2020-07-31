package com.project.movietickets.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TicketBookingController {

    @RequestMapping(value = "/booking", method = RequestMethod.GET)
    public String index(){
        return "booking";
    }
}
