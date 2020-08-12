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
<div class="content">
    <div class="container-fluid" style="min-height: 450px;">
        <h2 class="text-center" style="color:#000000;">ĐĂNG NHẬP </h2><br>
        <div class="row">
            <div class="col-xs-12 col-sm-12 col-md-4 well well-sm col-md-offset-4">
                <legend><a href=""></a> Đăng nhập hệ thống !
                </legend>
                <form method="post" class="form" role="form" action="/login">
                    <input class="form-control" name="username" placeholder="Tên đăng nhập" type="text" id="name" required><br>
                    <input class="form-control" name="password" placeholder="Mật khẩu" type="password" id="password" required>
                    <span class="help-block"><p>${message}</p></span><br>
                    <button class="btn btn-lg btn-primary btn-block" type="submit" style="letter-spacing: 7px"> ĐĂNG NHẬP </button>
                    <br>
                    <h5 style="color: #0f1315">Bạn chưa có tài khoản ?
                        <a href="/register">Đăng kí</a>
                    </h5>
                </form>
            </div>
        </div>
    </div>
</div>


<!-- Footer -->
<jsp:include page="template/footer.jsp"/>
</body>
</html>