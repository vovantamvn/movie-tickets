<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
    <jsp:include page="../template/header.jsp"></jsp:include>
    <script>
        $(function (){
            $('#item-cinema').addClass('active')


        })
    </script>
</head>

<body>


<div class="row">
    <div class="col-xs-12 col-sm-3">
        <div class="block block-themed block-rounded">
            <div class="block-content">
                <ul id="motel-list" class="nav nav-pills nav-stacked">

                    <li>
                        <a href="javascript:void(0)" data-motel-id="{{$motel->id}}">LOL</a>
                    </li>

                    <li>
                        <a href="javascript:void(0)" data-motel-id="{{$motel->id}}">LOL</a>
                    </li>

                    <li>
                        <a href="javascript:void(0)" data-motel-id="{{$motel->id}}">LOL</a>
                    </li>

                </ul>
                <br/>
                <form method="post" action="#">

                <div class="input-group input-group-sm">
                    <input type="text"
                           name="name"
                           class="form-control"
                           placeholder="Taooo"
                           required
                           minlength="2"
                    />
                    <span class="input-group-btn">
                                <button type="submit" class="btn btn-primary"><i class="fa fa-plus"></i></button>
                            </span>
                </div>
                </form>
                <br/>
            </div>
        </div>
    </div>

    <div class="col-xs-12 col-sm-9">
        <h1>LOL</h1>
        <div id="motel-settings-wrapper-" class="block collapse motel-settings-wrapper">
            <ul class="nav nav-tabs nav-tabs-alt" data-toggle="tabs">
                <li class="active">
                    <a href="#motel-info-wrapper-{{$motel->id}}">Info</a>
                </li>
                <li>
                    <a href="#motel-rooms-wrapper-{{$motel->id}}">Room</a>
                </li>
            </ul>

            <div class="block-content tab-content">
                <div>
                    <input type="text">
                </div>
            </div>
        </div>

    </div>
</div>


</body>
</html>