package com.project.movietickets.controller.admin;

import com.project.movietickets.model.Report;
import com.project.movietickets.service.ReportService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/admin")
@RequiredArgsConstructor
public class ReportController {

    private final ReportService reportService;

    @RequestMapping(value = "/reports", method = RequestMethod.GET)
    public ModelAndView index(
            @RequestParam(value = "startDate", required = false) String startDate,
            @RequestParam(value = "startDate", required = false) String endDate,
            @RequestParam(value = "category", required = false) String category,
            ModelAndView modelAndView
    ) {

        List<Report> reports = reportService.searchReport(startDate, endDate, category);

        modelAndView.setViewName("admin/report/index");
        modelAndView.addObject("reports", reports);

        return modelAndView;
    }
}
