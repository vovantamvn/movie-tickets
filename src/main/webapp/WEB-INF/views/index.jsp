<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE HTML>
<html>
<head>
    <jsp:include page="template/header.jsp"/>
</head>
<style>
    .movie-container {
        margin-left: 100px;
    }
</style>
<body>
<jsp:include page="template/nav.jsp"/>
<!-- Main content -->
<section class="container">
    <div class="col-sm-12">
        <h2 class="page-heading">Movies</h2>

        <c:forEach var="movie" items="${allMovies}">
            <!-- Movie preview item -->
            <div class="movie movie--preview movie--full release">
                <div class="col-sm-3 col-md-2 col-lg-2">
                    <div class="movie__images">
                        <img alt='image' src="${movie.image}">
                    </div>
                </div>

                <div class="col-sm-9 col-md-10 col-lg-10 movie__about">
                    <a href='/movies?id=${movie.id}' class="movie__title link--huge">${movie.name}</a>
                    <p class="movie__time">${movie.time} phút</p>
                    <div class="movie__btns">
                        <a href="/movies?id=${movie.id}" class="btn btn-md btn--warning">Xem chi tiết <span
                                class="hidden-sm">phim</span></a>
                        <a href="/purchase/${movie.id}/${cityId}/${date}" class="watchlist">Mua vé</a>
                    </div>

                    <div class="preview-footer">
                    </div>
                </div>

                <div class="clearfix"></div>
            </div>
            <!-- end movie preview item -->
        </c:forEach>
    </div>
</section>

<div class="clearfix"></div>

<jsp:include page="template/footer.jsp"/>
</body>
</html>
