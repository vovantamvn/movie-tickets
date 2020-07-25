package com.project.movietickets.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RegisterController {

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String index(){
        return "register";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(@RequestParam("user") String username,
                           @RequestParam("password") String password,
                           @RequestParam("dateOfBirth")String dateOfBirth,
                           @RequestParam("sex") boolean gender){

        System.out.println("DOB: " + dateOfBirth);
        System.out.println("User name:" + username);
        System.out.println("Password:" + password);
        System.out.println("Gender: " + gender);

        return "login";
    }
}

