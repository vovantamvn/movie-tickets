package com.project.movietickets.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BuyTicketController {

    @RequestMapping(value = "/buy", method = RequestMethod.GET)
    public String index(){
        return "buy-success";
    }
}
