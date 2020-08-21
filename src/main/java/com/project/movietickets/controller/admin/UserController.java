package com.project.movietickets.controller.admin;

import com.project.movietickets.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;


    public String index(){
        return null;
    }
}
