package com.project.movietickets.repository.custom;

import com.project.movietickets.entity.ChairEntity;

import java.util.List;

public interface FindListChairRepository {
    List<ChairEntity> findListChair(int scheduleId);
}
