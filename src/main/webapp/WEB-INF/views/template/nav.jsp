<%@ page import="org.springframework.security.core.Authentication" %>
<%@ page import="java.security.Principal" %>
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
                    <li><a href="/amount" style="color: #FFF">Trang giá</a></li>
                    <%
                        if (request.isUserInRole("ROLE_USER")){
                            out.print("<li><a href='/history' style='color: #FFF'>Lịch sử</a></li>");
                        } else if (request.isUserInRole("ROLE_EMPLOYEE")){
                            out.print("<li><a href='/manage' style='color: #FFF'>In vé</a></li>");
                        } else if (request.isUserInRole("ROLE_ADMIN")) {
                            out.print("<li><a href='/admin' style='color: #FFF'>Quản lý</a></li>");
                        }
                    %>

                    <%
                        if (request.getRemoteUser() != null){
                            out.print("<li><a href='/information' style='color: #FFF'>Cá nhân</a></li>");
                            out.print("<li><a href='/logout' style='color: #FFF'>Đăng xuất</a></li>");
                        } else {
                            out.print("<li><a href='/register' style='color: #FFF'>Đăng kí</a></li>");
                            out.print("<li><a href='/login' style='color: #FFF'>Đăng nhập</a></li>");
                        }
                    %>
                </ul>
            </div>
            <div class="clear"></div>
        </div>
    </div>
</div>