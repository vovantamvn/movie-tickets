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
<%--    <h3 style="text-shadow: 2px 2px 2px blue;text-align: center;font-size:70px;text-justify: inter-cluster ; margin-bottom: 20px"  >Chọn ghế</h3>--%>
    <ul class="nav nav-tabs">
        <c:forEach varStatus="loop" var="room" items="${rooms}">
            <li>
                <a href="#">${room.name}</a>
            </li>
        </c:forEach>
    </ul>

    <div style="width: auto" id="button">
        <button class="btn btn-outline-info">A1</button>
        <button class="btn btn-outline-info">B1</button>
        <button class="btn btn-outline-info">C1</button>
        <button class="btn btn-outline-info">D1</button>

        <button class="btn btn-outline-info">E1</button>
        <button class="btn btn-outline-info">F1</button>
        <button class="btn btn-outline-info">G1</button>
        <button class="btn btn-outline-info">H1</button>
        <br>


        <button class="btn btn-outline-info">A2</button>
        <button class="btn btn-outline-info">B2</button>
        <button class="btn btn-outline-info">C2</button>
        <button class="btn btn-outline-info">D2</button>

        <button class="btn btn-outline-info">E2</button>
        <button class="btn btn-outline-info">F2</button>
        <button class="btn btn-outline-info">G2</button>
        <button class="btn btn-outline-info">H2</button>
        <br>


        <button class="btn btn-outline-info">A3</button>
        <button class="btn btn-outline-info">B3</button>
        <button class="btn btn-outline-info">C3</button>
        <button class="btn btn-outline-info">D3</button>

        <button class="btn btn-outline-info">E3</button>
        <button class="btn btn-outline-info">F3</button>
        <button class="btn btn-outline-info">G3</button>
        <button class="btn btn-outline-info">H3</button>
        <br>


        <button class="btn btn-outline-info">A4</button>
        <button class="btn btn-outline-info">B4</button>
        <button class="btn btn-outline-info">C4</button>
        <button class="btn btn-outline-info">D4</button>

        <button class="btn btn-outline-info">E4</button>
        <button class="btn btn-outline-info">F4</button>
        <button class="btn btn-outline-info">G4</button>
        <button class="btn btn-outline-info">H4</button>

    </div>
</div>


<!-- Footer -->
<jsp:include page="template/footer.jsp"/>
</body>
</html>