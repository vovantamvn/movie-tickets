<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE HTML>
<html>
<head>
    <!-- Head -->
    <jsp:include page="template/header.jsp"/>
</head>
<style>
    body #button button{
        margin-left: 15px;
        margin-right: 15px;
        margin-top: 10px;
        margin-bottom: 10px;
        background: #357ecd;
    }
</style>

<body>
<!-- Nav -->
<jsp:include page="template/nav.jsp"/>

<div style="width: 100%;height: 330px;text-align: center ; margin-top: 55px" >

    <ul class="nav nav-tabs">
        <c:forEach varStatus="loop" var="room" items="${rooms}">
            <li>
                <a href="#" <c:if test="${room.id==roomId}">class="active"</c:if>>${room.name}</a>
            </li>
        </c:forEach>
    </ul>

    <div style="width: auto" id="button">
        <c:forEach var="room" items="${rooms}" varStatus="loop">
            <button class="btn btn-outline-info">${room}</button>

            <c:if test="${loop.index%7!=0 && loop.index==0}">
                <br>
            </c:if>
        </c:forEach>
    </div>
</div>

<!-- Footer -->
<jsp:include page="template/footer.jsp"/>
</body>
</html>