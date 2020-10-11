package com.project.movietickets.controller.web.user;

import com.project.movietickets.service.user.ChoiceChairService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequiredArgsConstructor
public class BookingChairController {

    private final ChoiceChairService service;

//    will be delete
//    @PostMapping(value = "booking/chair")
//    public String index(
//            @RequestParam("date") String date,
//            @RequestParam("scheduleId") int scheduleId,
//            Model model
//    ){
//
//        var roomChairs = service.getAllChairOfSchedule(scheduleId);
//        model.addAttribute("date", date);
//        model.addAttribute("scheduleId", scheduleId);
//        model.addAttribute("roomChairs", roomChairs);
//
//        return "user/booking-chair";
//    }

    @GetMapping("/booking/chair/{scheduleId}")
    public ModelAndView selectTicket(@PathVariable int scheduleId){
        var modelAndView = new ModelAndView("user/booking-chair");
        var roomChairs = service.getAllChairOfSchedule(scheduleId);

        modelAndView.addObject("roomChairs", roomChairs);
        modelAndView.addObject("scheduleId", scheduleId);

        return modelAndView;
    }
}
