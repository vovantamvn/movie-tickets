<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<div class="header">
    <div class="header-top">
        <div class="wrap">
            <div class="banner-no">
                <br><br>
                <a href="/" STYLE="color: #fff;font-weight: bold;
                         font-size: 30px;text-decoration: none;margin-top: 100px;
                        letter-spacing: 4px;font-family: tahoma"> HAC CINEMA</a>
            </div>
            <div class="nav-wrap">
                <ul class="group" id="example-one">
                    <li><a href="/" style="color: #FFF">Trang chủ</a></li>

                    <%
                        String role = (String) session.getAttribute("role");

                        if (role == null){
                            out.print("<li><a href='/register' style='color: #FFF'>Bạn chưa đăng nhập</a></li>");
                        } else if (role.equals("ROLE_USER")){
                            out.print("<li><a href='/history' style='color: #FFF'>Lịch sử</a></li>");
                        } else if (role.equals("ROLE_EMPLOYEE")){
                            out.print("<li><a href='/manage' style='color: #FFF'>In vé</a></li>");
                        } else if (role.equals("ROLE_ADMIN")){
                            out.print("<li><a href='/admin' style='color: #FFF'>Quản lý</a></li>");
                        }


                    %>

                    <%
                        if (session.getAttribute("name") != null){
                            String name = (String) session.getAttribute("name");
                            out.print("<li><a href=\"javascript:void(0);\" style=\"color: #FFF\">Chào " + name + "</a></li>");
                            out.print("<li><a href=\"/logout\" style=\"color: #FFF\">Đăng xuất</a></li>");
                        } else {
                            out.print("<li><a href=\"/register\" style=\"color: #FFF\">Đăng kí</a></li>");
                            out.print("<li><a href=\"/login\" style=\"color: #FFF\">Đăng nhập</a></li>");
                        }
                    %>
                </ul>
            </div>
            <div class="clear"></div>
        </div>
    </div>
</div>