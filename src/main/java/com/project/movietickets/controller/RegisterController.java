package com.project.movietickets.controller;

import com.project.movietickets.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;

@Controller
public class RegisterController {
    @Autowired
    private RegisterService service;

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String index(){
        return "register";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(@RequestParam("username") String username,
                           @RequestParam("password") String password,
                           @RequestParam("fullname") String fullname,
                           @RequestParam("email") String email,
                           @RequestParam("dateOfBirth") String dateOfBirth,
                           @RequestParam("gender") boolean gender,
                           Model model){

        boolean result = service.registerUser(username, password, fullname, email, gender, dateOfBirth);

        if (result) {
            return "redirect:/login";
        }

        model.addAttribute("message", "Đăng kí thất bại!");
        return "register";
    }
}

