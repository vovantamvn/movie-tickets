<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE HTML>
<html>
<head>
    <!-- Head -->
    <jsp:include page="../template/header.jsp"/>
</head>

<body>
<!-- Nav -->
<jsp:include page="../template/nav.jsp"/>

<!-- Content-->
<div class="container" style="min-height: 400px">
    <div class="row">
        <div class="col-xs-12 col-sm-10 col-md-5 well well-sm col-md-offset-4" style="text-align: center;height: 200px;margin-top: 100px">

                    <h2>Bạn đã mua vé thành công!</h2><br>
                    <p>Mã code của bạn: ${code}</p><br>
                    <h5>Mời bạn đến gặp nhân viên để nhận vé!</h5>
                    <a href="/">Trang chủ</a>
        </div>

    </div>
</div>



<!-- Footer -->
<jsp:include page="../template/footer.jsp"/>
</body>
</html>