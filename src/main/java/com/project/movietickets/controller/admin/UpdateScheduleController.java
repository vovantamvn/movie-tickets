package com.project.movietickets.controller.admin;

import com.project.movietickets.service.CinemaService;
import com.project.movietickets.service.MovieService;
import com.project.movietickets.service.RoomMovieScheduleService;
import com.project.movietickets.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/admin")
public class UpdateScheduleController {
    @Autowired
    private RoomMovieScheduleService roomMovieScheduleService;

    @Autowired
    private CinemaService cinemaService;

    @Autowired
    private MovieService movieService;

    @Autowired
    private ScheduleService scheduleService;

    @RequestMapping(value = "/schedules/{id}/update", method = RequestMethod.GET)
    public String update(
            @PathVariable("id") int id,
            Model model
    ) {
        final var cinemas = cinemaService.getAllCinema();
        final var movies = movieService.getAllMovie();
        final var schedules = scheduleService.getAllSchedule();
        final var roomMovieSchedule = roomMovieScheduleService.findById(id);

        model.addAttribute("roomMovieSchedule", roomMovieSchedule);
        model.addAttribute("cinemas", cinemas);
        model.addAttribute("movies", movies);
        model.addAttribute("schedules", schedules);
        return "admin/schedule/update";
    }

    @RequestMapping(value = "/schedules/{id}/update", method = RequestMethod.POST)
    public String updateRoomMovieSchedule(
            @PathVariable("id") int id,
            @RequestParam("roomId") int roomId,
            @RequestParam("movieId") int movieId,
            @RequestParam("scheduleId") int scheduleId
    ) {
        System.out.println("Update" + id);
        System.out.println(roomId);
        roomMovieScheduleService.updateRoomMovieSchedule(id, roomId, movieId, scheduleId);
        return "redirect:/admin/schedules";
    }
}
