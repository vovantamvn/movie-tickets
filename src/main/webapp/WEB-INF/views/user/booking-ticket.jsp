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
    <div class="row">
        <div class="checkout-wrapper col-sm-6">
            <div class="form-group">
                <label for="phone">Số điện thoại:</label>
                <input name="phone" type="number" class="form-control" id="phone" required>
            </div>
            <div class="form-group">
                <label for="code">Mã giao dịch ngân hàng:</label>
                <input name="code" type="text" class="form-control" id="code" required>
            </div>
            <p>Chúng tôi sẽ kiểm tra tài khoản và gọi lại cho bạn ngay khi nhận được tiền.</p>
            <button class="btn btn-primary btn-submit" type="submit">Gửi</button>
        </div>

        <div class="ticket-wrapper hidden">
            <div class="col-xs-12 col-sm-10 col-md-5 well well-sm col-md-offset-4">
                <jsp:include page="../template/info-ticket.jsp"/>
            </div>
        </div>
    </div>
</div>

<script>
    $(function (){
        $('.btn-submit').click(function (event) {
            event.preventDefault(aof );

            const result = checkDataInput()
            if (!result){
                alert('Các trường không được để trống!')
                return;
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