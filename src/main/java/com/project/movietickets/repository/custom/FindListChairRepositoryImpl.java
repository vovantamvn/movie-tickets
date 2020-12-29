package com.project.movietickets.repository.custom;

import com.project.movietickets.entity.ChairEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class FindListChairRepositoryImpl implements FindListChairRepository {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<ChairEntity> findListChair(int scheduleId) {

        String sql = String.format("select chairs.* from chairs\n" +
                "inner join room_chairs\n" +
                "on room_chairs.chair_id = chairs.id\n" +
                "where room_chairs.id in\n" +
                "(\n" +
                "\tselect tickets.room_chair_id from tickets\n" +
                "\tinner join room_movie_schedules\n" +
                "\ton room_movie_schedules.id = tickets.room_movie_schedule_id\n" +
                "\twhere room_movie_schedules.id = %d\n" +
                ");", scheduleId);

        Query query = entityManager.createNativeQuery(sql, ChairEntity.class);

        return query.getResultList();
    }
}
