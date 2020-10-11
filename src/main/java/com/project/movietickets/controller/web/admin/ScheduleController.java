package com.project.movietickets.controller.web.admin;

import com.project.movietickets.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/admin")
public class ScheduleController {
    @Autowired
    private RoomMovieScheduleService roomMovieScheduleService;

    @Autowired
    private CinemaService cinemaService;

    @Autowired
    private MovieService movieService;

    @Autowired
    private ScheduleService scheduleService;

    @RequestMapping(value = "/schedules", method = RequestMethod.GET)
    public String index(Model model) {
        final var roomMovieSchedules = roomMovieScheduleService.getAllSchedule();
        model.addAttribute("roomMovieSchedules", roomMovieSchedules);

        return "admin/schedule/index";
    }

    @RequestMapping(value = "/schedules/create", method = RequestMethod.GET)
    public String create(Model model) {
        final var cinemas = cinemaService.getAllCinema();
        final var movies = movieService.getAllMovie();
        final var schedules = scheduleService.getAllSchedule();

        model.addAttribute("cinemas", cinemas);
        model.addAttribute("movies", movies);
        model.addAttribute("schedules", schedules);

        return "admin/schedule/create";
    }

    @RequestMapping(value = "/schedules", method = RequestMethod.POST)
    public String createSchedule(
            @RequestParam("roomId") int roomId,
            @RequestParam("movieId") int movieId,
            @RequestParam("scheduleId") int scheduleId
    ) {
        roomMovieScheduleService.createRoomMovieSchedule(roomId, movieId, scheduleId);

        return "redirect:/admin/schedules";
    }

    @RequestMapping(value = "/schedules/{id}/delete", method = RequestMethod.GET)
    public String delete(@PathVariable("id") int id) {
        roomMovieScheduleService.delete(id);

        return "redirect:/admin/schedules";
    }
}
