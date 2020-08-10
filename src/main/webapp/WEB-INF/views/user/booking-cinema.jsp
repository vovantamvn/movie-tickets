<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE HTML>
<html>

<head>
    <!-- Head -->
    <jsp:include page="../template/header.jsp"/>
    <style>
        .list-group input {
            margin-right: 10px;
            margin-left: 10px;
        }

        .list-group {
            min-height: 400px;
        }

        .list-group button {
            margin-right: 70px;
            margin-top: 15px;
        }
    </style>
    <script>
        $(document).ready(function () {
            $('.city-list a').click(function () {
                const sender = $(this)
                const id = sender.data('city-id')

                $('.city-list li').removeClass('active')
                sender.parent().addClass('active')

                $('.schedule-list').hide()
                $('#schedule-list-' + id).show()
            })

            $('.city-list a').first().click();

            $('.day').click(function () {
                const value = $(this).val()

                $('#date').val(value)
            })

            $('.schedule-list button').click(function () {
                const id = $(this).data('schedule-id')

                $('#schedule').val(id)
                $('#booking-cinema-submit').click()
            })

            $('input:radio[name="day"]').change(function () {
                if ($(this).is(':checked')) {
                    const value = $(this).val()
                    $('#date').val(value)
                }
            })
        })
    </script>
</head>

<body>
<!-- Nav -->
<jsp:include page="../template/nav.jsp"/>

<!-- Content-->
<div class="container">
    <br>
    <h2 style="text-shadow: 2px 2px 2px blue;text-align : center;font-size:70px ; color: #db9603">ĐẶT VÉ </h2>
    <br>

    <ul class="nav nav-tabs city-list">
        <c:forEach varStatus="loop" var="city" items="${cities}">
            <li>
                <a class="date-info" data-city-id="${city.id}" id="date-info-${city.id}"
                   href="javascript:void(0);">${city.name}</a>
            </li>
        </c:forEach>
    </ul>

    <br>
    <label class="radio-inline"><input value="${dates[0]}" type="radio" name="day" class="day" checked>Thứ Hai</label>
    <label class="radio-inline"><input value="${dates[1]}" type="radio" name="day" class="day">Thứ Ba</label>
    <label class="radio-inline"><input value="${dates[2]}" type="radio" name="day" class="day">Thứ Tư</label>
    <label class="radio-inline"><input value="${dates[3]}" type="radio" name="day" class="day">Thứ Năm</label>
    <label class="radio-inline"><input value="${dates[4]}" type="radio" name="day" class="day">Thứ Sáu</label>
    <label class="radio-inline"><input value="${dates[5]}" type="radio" name="day" class="day">Thứ Bảy</label>
    <label class="radio-inline"><input value="${dates[6]}" type="radio" name="day" class="day">Chủ Nhật</label>
    <br>

    <div class="list-group">
        <c:forEach var="city" items="${cities}">
            <ul class="list-group schedule-list" id="schedule-list-${city.id}">
                <c:forEach var="cinema" items="${city.cinemas}">
                    <li>
                        <h3>${cinema.name}</h3>
                        <br>
                        <c:forEach var="schedule" items="${cinema.schedules}">
                            <button class="btn btn-primary"
                                    data-schedule-id="${schedule.id}">
                                    ${schedule.name} - ${schedule.time}</button>
                        </c:forEach>
                        <hr>
                    </li>
                </c:forEach>
            </ul>
        </c:forEach>
    </div>

    <form class="hide block" method="post" action="/booking/chair">
        <input name="date" value="${dates[0]}" id="date">
        <input name="scheduleId" id="schedule">
        <button id="booking-cinema-submit" type="submit"/>
    </form>

</div>

<!-- Footer -->
<jsp:include page="../template/footer.jsp"/>
</body>

</html>