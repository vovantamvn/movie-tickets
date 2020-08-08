<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<c:forEach var="movie" items="${movies}">
    <div class="info-movie" id="info-movie-${movie.id}">
        <div id="detail-movie-${movie.id}" style="margin-left: 150px">
            <h2>${movie.name}</h2><br>
            <label>Tác giả :</label> ${movie.director}<br><br>
            <label>Miêu tả :</label> ${movie.description}<br><br>
            <label>Thể loại :</label> ${movie.category}<br><br>
            <label>Ra mắt :</label> ${movie.premiere}<br><br>
            <label>Thời gian :</label> ${movie.time}<br><br>
            <label>Ngôn ngữ :</label> ${movie.language}<br><br>

            <button class="btn-update-movie"  style="border: #357ecd solid 1px; background: #007bff;
                                    height: 30px;color: #fff" data-movie-id="${movie.id}">Edit Movie</button>
            <button  style="border: #357ecd solid 1px; background: #007bff;
                     height: 30px;color: #fff;margin-left: 20px" type="">Delete</button>
        </div>

        <div class="hidden" id="update-movie-${movie.id}" style="margin-left: 150px">
            <form>
                <div class="container">
                    <div class="row">


                        <div class="col-sm-2">

                            <h5>Tên phim :</h5><br>
                            <h5 style="margin-top: 10px">Tác giả :</h5><br>
                            <h5 style="margin-top: 10px">Thể loại:</h5><br>
                            <h5 style="margin-top: 5px">Ra mắt :</h5><br>
                            <h5 style="margin-top: 5px">Thời gian :</h5><br>
                            <h5 style="margin-top: 5px">Ngôn ngữ :</h5><br>
                            <h5 style="margin-top: 10px">Miêu tả :</h5><br>

                        </div>

                        <div class="col-sm-6">
                            <form method="post" action="/admin/movies/update">
                                <input name="name" type="text" value="${movie.name}" class="form-control"><br>
                                <input name="director" type="text" value="${movie.director}" class="form-control"><br>
                                <input name="category" type="text" value="${movie.category}" class="form-control"><br>
                                <input name="premiere" type="date" value="${movie.premiere}" class="form-control"><br>
                                <input name="time" type="number" value="${movie.time}" class="form-control"><br>
                                <input name="language" type="text" value="${movie.language}" class="form-control"><br>
                                <textarea class="form-control" rows="5" name="description">${movie.description}</textarea><br>
                                <input name="id" value="${movie.id}" hidden>

                                <button type="submit"class="btn-primary" >Edit</button>
                                <button data-movie-id="${movie.id}" class="btn-cancel-movie"
                                        style="border: #357ecd solid 1px; background: #007bff;
                                    height: 30px;color: #fff;margin-left: 20px"
                                        type="reset">Cancel</button>
                            </form>
                        </div>
                    </div>
                </div>

            </form>
        </div>
    </div>
</c:forEach>