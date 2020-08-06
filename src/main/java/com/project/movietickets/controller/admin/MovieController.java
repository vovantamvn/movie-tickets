package com.project.movietickets.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("admin/admin")
public class MovieController {

    @GetMapping
    public String createMovie(){
        return "admin/index";
    }
}
