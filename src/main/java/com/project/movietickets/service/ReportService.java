package com.project.movietickets.service;

import com.project.movietickets.entity.MovieEntity;
import com.project.movietickets.model.Report;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ReportService {
    @Autowired
    private TicketService ticketService;

    public List<Report> getReportLastMonth(){
        final var tickets = ticketService.getAllTicketLastMonth();
        final var map = new HashMap<MovieEntity, Integer>();
        tickets.forEach( ticket -> {
            final var key = ticket.getRoomMovieSchedule().getMovie();
            final var value = map.getOrDefault(key, 0) + 1;
            map.put(key, value);
        });

        final var reports = new ArrayList<Report>();

        map.forEach((key, count) -> {
            final var report = new Report();
            report.setCount(count);
            report.setName(key.getName());

            reports.add(report);
        });

        return reports.stream()
                .sorted((report, t1) -> t1.getCount() - report.getCount())
                .collect(Collectors.toList());
    }
}
