<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!-- Modal -->
<div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">Xác nhận</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
                Bạn muốn xóa rạp này?
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-dismiss="modal">Đóng</button>
                <a id="cinema-delete-confirm" role="button" class="btn btn-primary" href="">Xóa</a>
            </div>
        </div>
    </div>
</div>

<c:forEach var="cinema" items="${cinemas}">
    <div class="info-cinema" id="info-cinema-${cinema.id}">

        <div id="detail-cinema-${cinema.id}" style="margin-left: 150px">
            <h2>${cinema.name}</h2><br>
            <label>Thuộc thành phố:</label> ${cinema.city.name}<br><br>
            <a href="/admin/cinemas/${cinema.id}/update" role="button" class="btn-update-cinema btn btn-primary">Cập nhật</a>
            <button data-toggle="modal"
                    data-target="#exampleModal"
                    class="btn btn-danger"
                    data-cinema-id="${cinema.id}"
                    type="button">Xóa</button>
        </div>
    </div>
</c:forEach>