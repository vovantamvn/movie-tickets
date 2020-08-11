package com.project.movietickets.controller.admin;

import com.project.movietickets.service.MovieService;
import com.project.movietickets.service.RoomMovieScheduleService;
import com.project.movietickets.service.RoomService;
import com.project.movietickets.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/admin")
public class ScheduleController {
    @Autowired
    private RoomMovieScheduleService roomMovieScheduleService;

    @Autowired
    private RoomService roomService;

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
        final var rooms = roomService.getAllRoom();
        final var movies = movieService.getAllMovie();
        final var schedules = scheduleService.getAllSchedule();

        model.addAttribute("rooms", rooms);
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
}
