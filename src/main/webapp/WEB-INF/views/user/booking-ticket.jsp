<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE HTML>
<html>
<head>
    <!-- Head -->
    <jsp:include page="../template/header.jsp"/>
</head>
<style>
    .container {
        margin-top: 100px;
        min-height: 400px;
    }

    .hidden {
        display: none;
    }
</style>
<body>
<!-- Nav -->
<jsp:include page="../template/nav.jsp"/>

<!-- Content-->
<div class="container">

    <c:choose>
        <c:when test="${ticket == null}">
            <div class="alert alert-warning" role="alert">
                <h4 class="alert-heading">Bạn đã mua vé không thành công!</h4>
                <p>Ghế này đã được mua trước, vui lòng chọn ghế khác!</p>
                <hr>
                <p class="mb-0">Chúc bạn một ngày đẹp.</p>
            </div>
        </c:when>
        <c:otherwise>
            <div class="menu-wrapper">
                <jsp:include page="menu-option.jsp"/>
            </div>

            <div class="ticket-wrapper hidden">
                <div class="alert alert-success" role="alert">
                    <h4 class="alert-heading">Bạn đã mua vé thành công!</h4>
                    <p>Mời bạn lấy mã code ${ticket.code} để nhận vé tại quầy thanh toán!</p>
                    <hr>
                    <p class="mb-0">Chúc bạn một ngày đẹp.</p>
                </div>
            </div>
        </c:otherwise>
    </c:choose>

</div>

<script>
    $(function (){
        $('.btn-submit').click(function (event) {
            event.preventDefault();

            const type = $("input[type='radio']:checked").val();

            if (type === 'type-banking'){
                const result = checkDataInput()

                if (!result){
                    alert('Các trường không được để trống!')
                    return;
                }
            }

            $(this).closest('.checkout-wrapper').addClass('hidden');
            $('.ticket-wrapper').removeClass('hidden');
        });
    });

    function checkDataInput(){
        const phone = $("input[name='phone']").val()
        const code = $("input[name='phone']").val()

        if (phone == '' || code == ''){
            return false;
        }

        return true;
    }
</script>

<!-- Footer -->
<jsp:include page="../template/footer.jsp"/>
</body>
</html>