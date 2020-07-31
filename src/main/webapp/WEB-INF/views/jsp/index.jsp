<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
    <jsp:include page="template/header.jsp"/>
</head>

<body>
<jsp:include page="template/nav.jsp"/>

<div class="content">
    <div class="wrap">
        <div class="content-top">
            <h3>New Movies</h3>
            <c:forEach var="movie" items="${newMovies}">
                <div class="col_1_of_4 span_1_of_4">
                    <div class="imageRow">
                        <div class="single">
                            <a href="${movie.image}" rel="lightbox"><img height="300" width="200" src="${movie.image}" alt="" /></a>
                        </div>
                        <div class="movie-text">
                            <h5><a href="/movies?id=${movie.id}">${movie.name}</a></h5>
                        </div>
                        <div>
                            <button type="submit" class="btn btn-info">Chi tiết</button>
                            <button type="button" class="btn btn-primary">Đặt vé</button>
                        </div>
                    </div>
                </div>
            </c:forEach>
            <div class="clear"></div>
        </div>

        <div class="movie-top">
            <h3 style="color: #357ecd;font-size: 4em;padding: 1.5%;">Hot Movies</h3>
            <c:forEach var="movie" items="${hotMovies}">
                <div class="col_1_of_4 span_1_of_4">
                    <div class="imageRow">
                        <div class="single">
                            <a href="${movie.image}" rel="lightbox"><img height="300" width="200" src="${movie.image}" alt="" /></a>
                        </div>
                        <div class="movie-text">
                            <h5><a href="/movies?id=${movie.id}">${movie.name}</a></h5>
                            <div>
                                <button type="submit" class="btn btn-info">Chi tiết</button>
                                <button type="button" class="btn btn-primary">Đặt vé</button>
                            </div>
                        </div>
                    </div>
                </div>
            </c:forEach>
            <div class="clear"></div>
        </div>
    </div>
    <div class="clear"></div>
</div>

<jsp:include page="template/footer.jsp"/>
</body>
</html>