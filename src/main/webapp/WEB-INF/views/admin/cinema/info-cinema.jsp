<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<c:forEach var="cinema" items="${cinemas}">
    <div class="info-cinema" id="info-cinema-${cinema.id}">

        <div id="detail-cinema-${cinema.id}" style="margin-left: 150px">

            <h2>${cinema.name}</h2><br>
            <label>Tên thành phố :</label> ${cinema.city.name}<br><br>
            <button class="btn-update-cinema"  style="border: #357ecd solid 1px; background: #007bff;
                                    height: 30px;color: #fff" data-cinema-id="${cinema.id}">Edit Cinema</button>
            <button  style="border: #357ecd solid 1px; background: #007bff;
                     height: 30px;color: #fff;margin-left: 20px" type="">Delete</button>

        </div>

        <div class="hidden" id="update-cinema-${cinema.id}" style="margin-left: 150px">
            <form>
                <div class="container">
                    <div class="row">


                        <div class="col-sm-4">
                            <h5 style="margin-top: 10px">Tên rạp :</h5><br>
                            <h5 style="margin-top: 10px">Tên thành phố :</h5><br>
                        </div>

                        <div class="col-sm-6">
                            <input name="name" type="text" class="form-control"><br>
                            <select name="cityId">
                                <c:forEach var="city" items="${cities}">
                                    <option value="${city.id}">${city.name}</option>
                                </c:forEach>
                            </select>

                            <button data-cinema-id="${cinema.id}" class="btn btn-secondary btn-cinema-cancel"
                                    type="reset">Cancel</button>
                        </div>
                    </div>
                </div>

            </form>
        </div>
    </div>
</c:forEach>