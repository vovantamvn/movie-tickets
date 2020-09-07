<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<div class="checkout-wrapper col-sm-6">
    <div class="radio">
        <label><input value="type-offline" type="radio" name="type" checked><b>Thanh toán trực tiếp tại quầy</b></label>
    </div>

    <div class="radio">
        <label><input value="type-banking" type="radio" name="type"><b>Thanh toán qua banking</b></label>
    </div>

    <p>Bạn sẽ gửi tiền vé vào stk 123456789 của ngân hàng VPBank. Sau đó điền thông tin vào dưới đây.</p>
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