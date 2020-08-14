package com.project.movietickets.controller.admin;

import com.project.movietickets.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/admin")
public class RoomConrtroller {
    @Autowired
    private RoomService roomService;

    @RequestMapping(value = "/rooms", method = RequestMethod.POST)
    public String create(
            @RequestParam("name") String name,
            @RequestParam("cinemaId") int cinemaId
    ){
        roomService.create(name, cinemaId);

        return "redirect:/admin/cinemas";
    }
}
