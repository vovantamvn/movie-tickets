<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE HTML>

<!-- ticket model -->

<div class="card row block" >
    <div class="card-body">
        <div class="col-sm-6">
            <img class="card-img-top" src="/images/poster.jpg" alt="Card image cap">
        </div>

        <div class="col-sm-6">
            <h4 class="card-title">${ticket.roomMovieSchedule.movie.name}</h4>
            <label>Mã code: ${ticket.code}</label><br>
            <label>Ngày: ${ticket.date}</label><br>
            <label>Giờ: ${ticket.roomMovieSchedule.schedule.time}</label><br>
            <label>Phòng: ${ticket.roomChair.room.name}</label><br>
            <label>Ghế: ${ticket.roomChair.chair.position}</label><br>
        </div>
    </div>
</div>