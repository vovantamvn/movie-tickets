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
<div class="container" style="height: 400px">
    <h2>Đã mua thành công!</h2>
    <p>Code: ${code}</p>
</div>

<!-- Footer -->
<jsp:include page="../template/footer.jsp"/>
</body>
</html>