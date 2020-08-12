package com.project.movietickets.controller.admin;

import com.project.movietickets.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/admin")
public class ReportController {
    @Autowired
    private ReportService reportService;

    @RequestMapping(value = "/reports", method = RequestMethod.GET)
    public String index(Model model){
        final var reports = reportService.getReportLastMonth();
        model.addAttribute("reports", reports);

        return "admin/report/index";
    }
}
