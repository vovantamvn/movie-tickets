package com.project.movietickets.controller;

import com.project.movietickets.entity.RoomEntity;
import com.project.movietickets.model.RoomModel;
import com.project.movietickets.service.ChoiceChairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ChoiceChairController {
    @Autowired
    private ChoiceChairService service;

    @RequestMapping(value = "room-map", method = RequestMethod.GET)
    public String index(@RequestParam(value = "id", defaultValue = "1") int id, Model model){
        List<RoomModel> rooms = service.getAllRoomOfCinema(id);
        model.addAttribute("rooms", rooms);

        return "room-map";
    }
}
