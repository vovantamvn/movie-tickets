package com.project.movietickets.controller.web.guest;

import com.project.movietickets.entity.UserEntity;
import com.project.movietickets.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequiredArgsConstructor
public class DetailsInformation {

    private final UserService userService;

    @GetMapping("/information")
    public ModelAndView getInformation(Authentication authentication) {
        var modelAndView = new ModelAndView("common/index");

        String username = authentication.getName();
        var userEntityOpt = userService.findUserByUsername(username);
        var userEntity = userEntityOpt.orElseThrow();

        modelAndView.addObject("user", userEntity);
        return modelAndView;
    }

    @GetMapping("/information/update")
    public ModelAndView getViewUpdateInformation() {
        return null;
    }

    @PostMapping("/information/update")
    public String updateInformation(){


        return "redirect:/information";
    }
}
