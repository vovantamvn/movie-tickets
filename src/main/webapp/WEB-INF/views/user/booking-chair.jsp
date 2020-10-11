<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE HTML>
<html>
<head>
    <!-- Head -->
    <jsp:include page="../template/header.jsp"/>
    <script>
        $(function (){
            // $('.room-list a').click(function (){
            //     const sender = $(this)
            //     const id = sender.data('room-id')
            //
            //     $('.room-list li').removeClass('active')
            //     sender.parent().addClass('active')
            //
            //     $('.info-chair-room').hide()
            //     $('#info-chair-room-' + id).show()
            // })
            //
            // $('.room-list a').first().click()

            $('.info-room-chair').each(function (){
                const sender = $(this)
                const isSelected = sender.data('is-selected')
                if (isSelected === true){
                    sender.removeClass('btn-primary')
                    sender.addClass('btn-warning')
                    sender.prop('disabled', true)
                }
            })

            // $('.info-room-chair').click(function (){
            //     const sender = $(this)
            //     const id = sender.data('room-chair-id')
            //
            //     $('#room-chair-id').val(id)
            //     $('#booking-chair').submit()
            // })
        })
    </script>
</head>

<style>
    .info-room-chair {
        width: 50px;
        height: 50px;
        margin-left: 15px;
        margin-right: 15px;
        margin-top: 10px;
        margin-bottom: 10px;
    }

    .container {
        margin-top: 55px
    }

    .chair-container {
        width: 100%;
        height: 450px;
        text-align: center;
    }

    .note {
        width: 30px;
        height: 30px;
    }

</style>

<body>
<!-- Nav -->
<jsp:include page="../template/nav.jsp"/>

<div class="container">
    <ul class="nav nav-tabs room-list">
        <c:forEach varStatus="loop" var="room" items="${rooms}">
            <li>
                <a href="javascript:void(0);" class="info-room" data-room-id="${room.id}" id="info-room-${room.id}">${room.name}</a>
            </li>
        </c:forEach>
    </ul>

    <div class="chair-container" id="chair">
            <div class="info-chair-room"> <h1 style="letter-spacing: 3px">CHỌN GHẾ</h1>
                <c:forEach var="roomChair" items="${roomChairs}" varStatus="loop">
                    <a  data-is-selected="${roomChair.status}"
                        data-room-chair-id="${roomChair.id}"
                             role="button"
                             href="/booking/ticket?scheduleId=${scheduleId}&roomChairId=${roomChair.id}"
                        class="btn btn-primary info-room-chair">${roomChair.chair.position}</a>

                    <c:if test="${(loop.index+1)%8==0}">
                        <br>
                    </c:if>
                </c:forEach>
            </div>
        <br>
        <div class="col-sm-12">
            <label>Chú thích: </label><br>
            <button disabled class="btn btn-primary note"></button> Ghế trống
            <button disabled class="btn btn-warning note"></button> Ghế đã đặt

        </div>

    </div>

<%--    <form id="booking-chair" class="hide" action="/booking/ticket" method="post">--%>
<%--        <input name="date" value="${date}">--%>
<%--        <input name="scheduleId" value="${scheduleId}">--%>
<%--        <input name="roomChairId" id="room-chair-id">--%>
<%--    </form>--%>

</div>

<!-- Footer -->
<jsp:include page="../template/footer.jsp"/>
</body>
</html>