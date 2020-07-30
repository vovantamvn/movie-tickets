package com.project.movietickets.controller;

import com.project.movietickets.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    @Autowired
    private LoginService service;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String index(){
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Model model){

        boolean result = service.login(username, password);
        System.out.println(username);
        System.out.println(password);
        if (result){
            System.out.println("Success");
            return "redirect:/";
        }

        model.addAttribute("messenge", "Mật khẩu hoặc tên đăng nhập sai!");
        return "login";
    }
}
