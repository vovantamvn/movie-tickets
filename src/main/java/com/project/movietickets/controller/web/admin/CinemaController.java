package com.project.movietickets.controller.web.admin;

import com.project.movietickets.service.CinemaService;
import com.project.movietickets.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/admin")
public class CinemaController {
    @Autowired
    private CinemaService cinemaService;

    @Autowired
    private CityService cityService;

    @GetMapping("/cinemas")
    public String index(Model model) {
        final var cinemas = cinemaService.getAllCinema();
        final var cities = cityService.getAllCity();

        model.addAttribute("cities", cities);
        model.addAttribute("cinemas", cinemas);

        return "admin/cinema/index";
    }

    /**
     * For create cinema
     *
     * @return String
     */
    @GetMapping("/cinemas/create")
    public String create(Model model) {
        final var cities = cityService.getAllCity();
        model.addAttribute("cities", cities);
        return "admin/cinema/create";
    }

    @PostMapping("/cinemas")
    public String createCinema(
            @RequestParam("name") String name,
            @RequestParam("cityId") int cityId
    ) {
        cinemaService.createCinema(name, cityId);
        return "redirect:/admin/cinemas";
    }

    /**
     * For delete cinema
     *
     * @param id
     * @return String
     */
    @GetMapping("/cinemas/{id}/delete")
    public String delete(@PathVariable("id") int id) {
        cinemaService.deleteCinema(id);
        return "redirect:/admin/cinemas";
    }
}
