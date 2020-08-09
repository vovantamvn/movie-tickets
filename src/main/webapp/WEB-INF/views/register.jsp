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
<div class="content" >
    <div class="container-fluid" style="min-height: 550px;;">
        <h1 class="text-center" style="margin-top: 50px;margin-left: 70px;color: #fff">ĐĂNG KÍ</h1><br>
        <div class="row">
            <div class="col-xs-12 col-sm-10 col-md-5 well well-sm col-md-offset-4">
                <legend><a href=""></a> Đăng ký thành viên!
                </legend>
                <form action="/register" method="post" class="form" role="form" id="form-register">
                    <div class="row">
                        <div class="col-xs-6 col-md-6">
                            <input class="form-control" name="username" placeholder="User Name" required="" autofocus="" type="text" id="user"><br>
                        </div>

                        <div class="col-xs-6 col-md-6">
                            <input class="form-control" name="fullname" placeholder="Full Name" required="" type="text">
                        </div>

                    </div> <input class="form-control" name="email" placeholder="Email" type="email" required><br>
                    <input class="form-control" id="password" name="password" placeholder="Mật khẩu" type="password" required><br>
                    <input class="form-control" id="re-password" name="re-password" placeholder="Nhập lại mật khẩu" type="password" required><br>
                    <label for="date-of-birth" style="color: #0f1315"> Ngày sinh</label>
                    <div class="row">
                        <div class="col-xs-6 col-md-12"> <input type="date" id="date-of-birth" name="dateOfBirth" class="form-control" required><br>
                        </div>
                    </div>
                    <label for="" style="color: #0f1315">Giới tính</label><br>
                    <label class="radio-inline" style="color: #0f1315">
                        <input name="gender" id="inlineCheckbox1" value="true" type="radio" required> Nam </label>
                    <label class="radio-inline" style="color: #0f1315"> <input name="gender" id="inlineCheckbox2" value="false" type="radio"> Nữ </label><br>


                    <p>${message}</p>
                    <button id="btn-register" class="btn btn-lg btn-primary btn-block" type="submit" style="letter-spacing: 7px"> ĐĂNG KÍ</button>
                    <br>
                </form>
            </div>
        </div>
    </div>

</div>
<!-- Footer -->
<jsp:include page="template/footer.jsp"/>
</body>
</html>