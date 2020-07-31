<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE HTML>
<html>
<head>
    <!-- Head -->
    <jsp:include page="template/header.jsp"/>
</head>

<body>
<!-- Nav -->
<jsp:include page="template/nav.jsp"/>

<!-- Content-->
<div class="container">
    <br>
    <h2>Đặt vé</h2>
    <br>

    <ul class="nav nav-tabs">
        <c:forEach varStatus="loop" var="city" items="${citys}">
            <li <c:if test="${loop.index==index}">class="active"</c:if>>
                <a href="/booking?index=${loop.index}">${city.name}</a>
            </li>
        </c:forEach>
    </ul>

    <ul class="list-group">
        <c:forEach var="cinema" items="${citys[index].cinemas}">
            <li class="list-group-item">${cinema.name}:<br>
                <ul>
                    <li>12h</li>
                    <li>12h</li>
                    <li>12h</li>
                    <li>12h</li>
                </ul>
            </li>

        </c:forEach>
    </ul>
</div>

<!-- Footer -->
<jsp:include page="template/footer.jsp"/>
</body>
</html>