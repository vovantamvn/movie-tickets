package com.project.movietickets.controller;

import com.project.movietickets.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @Autowired
    private HomeService service;

    @RequestMapping("/")
    public String index(){
        return "index";
    }
}
