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
    <h1 class="text-center">ĐĂNG NHẬP </h1>
    <div class="row">
        <div class="col-xs-12 col-sm-12 col-md-4 well well-sm col-md-offset-4">
            <legend><a href=""><i class="glyphicon glyphicon-globe"></i></a> Đăng nhập hệ thống !
            </legend>
            <form method="post" class="form" role="form" action="/login">
                <input class="form-control" name="username" placeholder="Tên đăng nhập" type="text" id="name" required>
                <input class="form-control" name="password" placeholder="Mật khẩu" type="password" id="password" required>
                <span class="help-block"><p>${message}</p></span>
                <button class="btn btn-lg btn-primary btn-block" type="submit"> Đăng nhập</button>
                <h6>Bạn chưa có tài khoản ?
                    <a href="/register">đăng kí</a>
                </h6>
            </form>
        </div>
    </div>
</div>

<!-- Footer -->
<jsp:include page="template/footer.jsp"/>
</body>
</html>