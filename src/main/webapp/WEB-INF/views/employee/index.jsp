<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE HTML>
<html>
<head>
    <!-- Head -->
    <jsp:include page="../template/header.jsp"/>
</head>

<style>
    #code {
        width: auto;
        height: 30px;
    }

    .container {
        margin-top: 50px;
        padding: 20px;
    }

    .btn-wrapper {
        margin-top: 20px;
        text-align: center;
    }

</style>

<body>
<!-- Nav -->
<jsp:include page="../template/nav.jsp"/>

<!-- Content-->
<div class="container" style="min-height: 400px">

    <div class="col-xs-12 col-sm-10 col-md-5 well well-sm col-md-offset-4">
        <!-- Search form -->
        <form>
            <input class="my-0 py-1" placeholder="Search" name="code" type="text" id="code">
            <button type="submit" class="btn-primary btn">Tìm</button>
        </form>

        <div>
            <c:choose>
                <c:when test="${isHasValue == true}">
                    <div>
                        <jsp:include page="../template/info-ticket.jsp"/>

                        <div class="btn-wrapper">
                            <a role="button" class="btn-primary btn" href="/manage">In vé</a>
                        </div>
                    </div>
                </c:when>
                <c:when test="${isSearched == true}">
                    <h5>không tìm thấy kết quả!</h5>
                </c:when>
                <c:otherwise>
                    <h5>Nhập code để tìm kiếm!</h5>
                </c:otherwise>
            </c:choose>
        </div>
    </div>
</div>

<!-- Footer -->
<jsp:include page="../template/footer.jsp"/>
</body>
</html>