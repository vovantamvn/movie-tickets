<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE HTML>
<html>
<head>
    <!-- Head -->
    <jsp:include page="template/header.jsp"/>
</head>
<style>
    body #chair button {
        width: 50px;
        height: 50px;
        margin-left: 15px;
        margin-right: 15px;
        margin-top: 10px;
        margin-bottom: 10px;
    }
    /*background: #357ecd;*/
</style>

<body>
<!-- Nav -->
<jsp:include page="template/nav.jsp"/>

<%--<div style="width: 100%;height: 330px;text-align: center ; margin-top: 55px" >--%>
<div class="container" style="margin-top: 55px">
    <ul class="nav nav-tabs">
        <c:forEach varStatus="loop" var="room" items="${rooms}">
            <li>
                <a href="#" <c:if test="${room.id==roomId}">class="active"</c:if>>${room.name}</a>
            </li>
        </c:forEach>
    </ul>
    <br>

    <div style="width: 100%;height: 330px;text-align: center" id="chair">

        <c:forEach var="roomChair" items="${rooms[0].roomChairs}" varStatus="loop">
            <a href="/buy"><button class="btn btn-primary">${roomChair.chair.position}</button></a>

            <c:if test="${(loop.index+1)%8==0}">
                <br>
            </c:if>
        </c:forEach>
    </div>

</div>

<!-- Footer -->
<jsp:include page="template/footer.jsp"/>
</body>
</html>