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
    <h2>Nội dung phim</h2>
    <br>
    <div class="row">
        <div class="col-sm-3">
            <img src="${movie.image}">
        </div>
        <div class="col-sm-9">
            <span>${movie.name}</span><br>
            <b>Đạo diễn: </b>${movie.director}<br>
            <b>Thể loại: </b>${movie.category}<br>
            <b>Khỏi chiếu: </b>${movie.premiere}<br>
            <b>Thời lượng: </b>${movie.time} phút<br>
            <b>Ngôn ngữ: </b>${movie.language}<br>
            <form method="post" action="#">
                <button type="submit" class="btn btn-primary" id="btn-submit">Mua vé</button>
            </form>
        </div>
    </div>
    <h2>Chi tiết</h2>
    <br>
    ${movie.description}
</div>

<!-- Footer -->
<jsp:include page="template/footer.jsp"/>
</body>
</html>