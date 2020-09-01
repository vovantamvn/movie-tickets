package com.project.movietickets.controller.employee;

import com.project.movietickets.entity.TicketEntity;
import com.project.movietickets.service.TicketService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
@RequiredArgsConstructor
public class EmployeeController {

    private final TicketService ticketService;

    @GetMapping("/manage")
    public String index(@RequestParam(value = "code", required = false) String code, Model model) {
        boolean isHasValue = false;
        boolean isSearched = false;

        if (code != null && !code.isBlank()){
            Optional<TicketEntity> optTicket = ticketService.findTicketByCode(code);

            if (optTicket.isPresent()){
                isHasValue = true;
                model.addAttribute("ticket", optTicket.get());
            }

            isSearched = true;
        }

        model.addAttribute("isHasValue", isHasValue);
        model.addAttribute("isSearched", isSearched);

        return "employee/index";
    }
}
