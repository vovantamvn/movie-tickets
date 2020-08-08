<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <!DOCTYPE html>
    <html>

    <head>
        <jsp:include page="../template/header.jsp" />
        <script>
        </script>
    </head>

    <body class="hold-transition sidebar-mini layout-fixed">
        <div class="wrapper">
            <jsp:include page="../template/menu.jsp" />
            <div class="content-wrapper">
                <div class="content-header">
                    <div class="container-fluid">
                        <div class="row mb-2">
                            <div class="col-sm-6">

                            </div>
                            <div class="col-sm-6">
                                <ol class="breadcrumb float-sm-right">
                                    <li class="breadcrumb-item"><a href="/admin">Home</a></li>
                                    <li class="breadcrumb-item active">Thêm mới bộ phim</li>
                                </ol>
                            </div>
                        </div>
                    </div>
                </div>



                <!-- Main content -->
                <section class="content">
                    <div class="container">
                        <form action="/admin/movies" method="post">
                            <div class="row" style="margin-bottom: 15px">
                                <div class="col-sm-2" style="margin-left: 150px">
                                    <labe>Name</labe>
                                </div>
                                <div class="col-sm-4">
                                    <input type="text" class="form-control" name="name">
                                </div>
                            </div>
                            <div class="row" style="margin-bottom: 15px">
                                <div class="col-sm-2" style="margin-left: 150px">
                                    <labe>Director</labe>
                                </div>
                                <div class="col-sm-4">
                                    <input type="text" class="form-control" name="director">
                                </div>
                            </div>
                            <div class="row" style="margin-bottom: 15px">
                                <div class="col-sm-2" style="margin-left: 150px">
                                    <labe>Category</labe>
                                </div>
                                <div class="col-sm-4">
                                    <input type="text" class="form-control" name="category">
                                </div>
                            </div>
                            <div class="row" style="margin-bottom: 15px">
                                <div class="col-sm-2" style="margin-left: 150px">
                                    <labe>Premiere</labe>
                                </div>
                                <div class="col-sm-4">
                                    <input type="text" class="form-control" name="premiere">
                                </div>
                            </div>
                            <div class="row" style="margin-bottom: 15px">
                                <div class="col-sm-2" style="margin-left: 150px">
                                    <labe>Time</labe>
                                </div>
                                <div class="col-sm-4">
                                    <input type="number" class="form-control" name="time">
                                </div>
                            </div>
                            <div class="row" style="margin-bottom: 15px">
                                <div class="col-sm-2" style="margin-left: 150px">
                                    <labe>Language</labe>
                                </div>
                                <div class="col-sm-4">
                                    <input type="text" class="form-control" name="language">
                                </div>
                            </div>
                            <div class="row" style="margin-bottom: 15px">
                                <div class="col-sm-2" style="margin-left: 150px">
                                    <labe>Description</labe>
                                </div>
                                <div class="col-sm-4">
                                    <textarea name="description" cols="30" rows="5" class="form-control"> </textarea>

                                </div>
                            </div>
                            <div class="row" style="margin-bottom: 15px">
                                <div class="col-sm-2" style="margin-left: 150px">
                                    <labe></labe>
                                </div>
                                <div class="col-sm-4">
                                    <button type="submit"class="btn btn-primary">Thêm</button>
                                </div>
                            </div>



                        </form>

                    </div>
                    <!-- Content -->

                    <!-- End Content -->

                </section>
            </div>
        </div>
        <jsp:include page="../template/footer.jsp" />
    </body>

    </html>