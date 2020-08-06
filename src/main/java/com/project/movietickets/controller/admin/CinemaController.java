package com.project.movietickets.controller.admin;

import com.project.movietickets.service.CinemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("admin")
public class CinemaController {
    @Autowired
    private CinemaService cinemaService;

    @GetMapping("/cinemas")
    public String index() {
        return "admin/cinema/index";
    }

    /**
     * For create cinema
     *
     * @return String
     */
    @GetMapping("/cinemas/create")
    public String create() {
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
     * For update cinema
     *
     * @param id
     * @param model
     * @return
     */
    @GetMapping("/cinemas/{id}")
    public String detail(@PathVariable("id") int id, Model model) {
        var cinema = cinemaService.findById(id);
        model.addAttribute("cinema", cinema);

        return "admin/cinema/update";
    }

    @PostMapping("/cinemas/{id}")
    public String update(
            @PathVariable("id") int id,
            @RequestParam("name") String name,
            @RequestParam("cityId") int cityId
    ) {
        cinemaService.updateCinema(id, name, cityId);
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
