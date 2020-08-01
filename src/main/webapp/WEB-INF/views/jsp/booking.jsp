<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE HTML>
<html>

<head>
    <!-- Head -->
    <jsp:include page="template/header.jsp"/>
    <style>
        .list-group input {
            margin-right: 10px;
            margin-left: 10px;
        }

        .list-group button {
            width: 80px;
            margin-right: 70px;
            margin-top: 15px;
        }
    </style>
</head>

<body>
<!-- Nav -->
<jsp:include page="template/nav.jsp"/>

<!-- Content-->
<div class="container">
    <br>
    <h2 style="text-shadow: 2px 2px 2px blue;text-align : center;font-size:70px ; color: #db9603">ĐẶT VÉ </h2>
    <%--    <h3 style="text-shadow: 2px 2px 2px blue;padding-left:340px;font-size:70px;text-justify: inter-cluster" >New Movies</h3>--%>
    <br>

    <ul class="nav nav-tabs">
        <c:forEach varStatus="loop" var="city" items="${cities}">
            <li <c:if test="${loop.index==index}">class="active"</c:if>>
                <a href="/booking?movie=${movie}&index=${loop.index}">${city.name}</a>
            </li>
        </c:forEach>
    </ul>

    <ul class="list-group"><br>
        <input type="radio" name="day" class="day" checked="true">Thứ Hai
        <input type="radio" name="day" class="day">Thứ Ba
        <input type="radio" name="day" class="day">Thứ Tư
        <input type="radio" name="day" class="day">Thứ Năm
        <input type="radio" name="day" class="day">Thứ Sáu
        <input type="radio" name="day" class="day">Thứ Bảy
        <input type="radio" name="day" class="day">Chủ Nhật <br>
        <c:forEach var="cinema" items="${cities[index].cinemas}">
            <li>
                <h3>${cinema.name}</h3>
                <br>
                <button class="btn btn-primary">12h</button>
                <button class="btn btn-primary">12h</button>
                <button class="btn btn-primary">12h</button>
                <button class="btn btn-primary">12h</button>
                <hr>
            </li>

        </c:forEach>
    </ul>
</div>

<!-- Footer -->
<jsp:include page="template/footer.jsp"/>
</body>

</html>