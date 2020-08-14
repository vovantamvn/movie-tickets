package com.project.movietickets.service;

import com.project.movietickets.entity.ScheduleEntity;
import com.project.movietickets.repository.ScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScheduleService {
    @Autowired
    private ScheduleRepository scheduleRepository;

    public List<ScheduleEntity> getAllSchedule() {
        return scheduleRepository.findAll();
    }
}
