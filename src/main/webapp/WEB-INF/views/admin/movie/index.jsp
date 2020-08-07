<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <jsp:include page="../template/header.jsp"/>
    <script>

    </script>
</head>
<body class="hold-transition sidebar-mini layout-fixed">
<div class="wrapper">
    <jsp:include page="../template/menu.jsp"/>
    <div class="content-wrapper">
        <div class="content-header">
            <div class="container-fluid">
                <div class="row mb-2">
                    <div class="col-sm-6">
                        <h1 class="m-0 text-dark">Quản lý phim</h1>
                    </div>
                    <div class="col-sm-6">
                        <ol class="breadcrumb float-sm-right">
                            <li class="breadcrumb-item"><a href="/admin">Home</a></li>
                            <li class="breadcrumb-item active">Danh sách các bộ phim</li>
                        </ol>
                    </div>
                </div>
            </div>
        </div>

        <!-- Main content -->
        <section class="content">
            <div class="container-fluid">
                <!-- Content -->

                <ul>
                    <li>
                        Ten phim
                        <button>Sua</button>
                        <button>Xoa</button>
                    </li>
                    <li>
                        Ten phim
                        <button>Sua</button>
                        <button>Xoa</button>
                    </li>
                </ul>

                <!-- End Content -->
            </div>
        </section>
    </div>
</div>
<jsp:include page="../template/footer.jsp"/>
</body>
</html>