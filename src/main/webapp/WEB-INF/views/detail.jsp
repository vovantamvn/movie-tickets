<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE HTML>
<html>
<head>
    <!-- Head -->
    <jsp:include page="template/header.jsp"/>
    <style>

        .col-sm-9{
            font-size: 20px;


        }

        .col-sm-9 h2,form{
            color: #357ecd;
            margin-left: 40px;
            padding-top: 12px;
        }

        .col-sm-9 label,form{
            /*color: #357ecd;*/
            margin-left: 40px;
            padding-top: 12px;
        }

        .col-sm-9 container{
            margin-left: 90px;
        }
    </style>
</head>

<body>
<!-- Nav -->
<jsp:include page="template/nav.jsp"/>

<!-- Content-->
<div class="content">
    <div class="container">
        <h1>NỘI DUNG PHIM </h1>
        <br>
        <div class="row">
            <div class="col-sm-3">
                <img src="${movie.image}">

            </div>

            <div class="col-sm-9">

                <h2>${movie.name}</h2>
                <hr>
                <label>Đạo diễn:</label> ${movie.director}<br>
                <label>Thể loại:</label> ${movie.category}<br>
                <label>Khỏi chiếu:</label> ${movie.premiere}<br>
                <label>Thời lượng:</label> ${movie.time} phút<br>
                <label>Ngôn ngữ:</label> ${movie.language}<br>
                <form method="get" action="/booking">
                    <input type="hidden" name="movie" value="${movie.id}">
                    <button type="submit" class="btn btn-primary" id="btn-submit">Mua vé</button>
                </form>

            </div>
        </div>
        <h3>Chi tiết</h3>
        <br>
        ${movie.description}<br><br>
    </div>

</div>

<!-- Footer -->
<jsp:include page="template/footer.jsp"/>
</body>
</html>