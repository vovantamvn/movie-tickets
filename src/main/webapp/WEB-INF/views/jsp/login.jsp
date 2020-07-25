<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>

<head>
    <title>Movie Tickest</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <link rel="stylesheet" href="css/style.css" type="text/css" media="all" />
    <link rel="stylesheet" href="css/lightbox.css" type="text/css" media="all" />
    <script src='js/jquery.color-RGBa-patch.js'></script>
    <script src='js/example.js'></script>
    <script type="text/javascript" src="js/jquery.min.js"></script>
    <!-- (do not call twice) -->
    <script src="js/lightbox.js"></script>
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <!-- <script src="js/jquery-1.11.1.min.js"></script> -->
    <style>
        body {
            padding-top: 0px;
        }

        .form-control {
            margin-bottom: 10px;
        }

        .login-screen-bg {
            background-color: #EFEFEF;
        }
    </style>
    <script>
        jQuery(document).ready(function($) {
            $('a').smoothScroll({
                speed: 1000,
                easing: 'easeInOutCubic'
            });

            $('.showOlderChanges').on('click', function(e) {
                $('.changelog .old').slideDown('slow');
                $(this).fadeOut();
                e.preventDefault();
            })
        });
    </script>
</head>

<body>
<div class="header">
    <div class="header-top">
        <div class="wrap">
            <div class="banner-no">
                <img src="images/banner-no.png" alt="" />
            </div>
            <div class="nav-wrap">
                <ul class="group" id="example-one">
                    <li><a href="/">Home</a></li>
                    <li><a href="/about">About</a></li>
                    <li class="current_page_item"><a href="/events">Movies & Events</a></li>
                    <li><a href="/contact">Contact</a></li>
                </ul>
            </div>
            <div class="clear"></div>
        </div>
    </div>
</div>
<script>
    function check() {
        var name = document.getElementById("name").Value;
        var password = document.getElementById("password").Value;

    }
</script>

<div class="container">
    <h1 class="text-center">ĐĂNG NHẬP </h1>
    <div class="row">
        <div class="col-xs-12 col-sm-12 col-md-4 well well-sm col-md-offset-4">
            <legend><a href=""><i class="glyphicon glyphicon-globe"></i></a> Đăng nhập hệ thống !
            </legend>
            <form method="post" class="form" role="form">
                <div class="row">

                </div> <input class="form-control" name="user" placeholder="Tên đăng nhập" type="text" id="name">
                <input class="form-control" name="retypepassword" placeholder="Mật khẩu" type="password" id="password">
                <br>
                <button class="btn btn-lg btn-primary btn-block" type="submit"> Đăng nhập</button>
                <h6>Bạn chưa có tài khoản ?
                    <a href=" ">đăng kí</a>
                </h6>
            </form>
        </div>
    </div>
</div>

<!-- Footer -->
<div class="footer ">
    <div class="wrap ">
        <div class="footer-top ">
            <div class="col_1_of_4 span_1_of_4 ">
                <div class="footer-nav ">
                    <ul>
                        <li><a href="# ">Giới thiệu</a></li>
                        <li><a href="# ">Tiện ích</a></li>
                        <li><a href="# ">Ưu đãi</a></li>
                        <li><a href="# ">Tuyển dụng</a></li>
                    </ul>
                </div>
            </div>
            <div class="col_1_of_4 span_1_of_4 ">
                <div class="textcontact ">
                    <p>Chăm sóc khách hàng<br> Liên hệ theo<br> Phone: 1800 234 529<br> Email : <a href="# ">movie.support@movie.com.vn</a><br>
                    </p>
                </div>
            </div>
            <div class="col_1_of_4 span_1_of_4 ">
                <div class="call_info ">
                    <p class="txt_3 ">Hỗ trợ miễn phí qua:</p>
                    <p class="txt_4 ">1 800 234 529</p>
                </div>
            </div>
            <div class="col_1_of_4 span_1_of_4 ">
                <div class=social>
                    <a href="# "><img src="images/fb.png " alt=" " /></a>
                    <a href="# "><img src="images/tw.png " alt=" " /></a>
                    <a href="# "><img src="images/dribble.png " alt=" " /></a>
                    <a href="# "><img src="images/pinterest.png " alt=" " /></a>
                </div>
            </div>
            <div class="clear "></div>
        </div>
    </div>
</div>
<div class="footer-bottom ">
    <div class="wrap ">
        <div class="copy ">
            <p>© 2020 Theater. All Rights Reserved | Design by <a href="http://w3layouts.com ">W3Layouts</a></p>
        </div>
    </div>
</div>
</body>

</html>