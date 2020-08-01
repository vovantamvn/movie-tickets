<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<title>Movie Tickets</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
<link rel="stylesheet" href="css/style.css" type="text/css" media="all"/>
<link rel="stylesheet" href="css/lightbox.css" type="text/css" media="all"/>
<script src='js/jquery.color-RGBa-patch.js'></script>
<script src='js/example.js'></script>
<script type="text/javascript" src="js/jquery.min.js"></script>
<!-- (do not call twice) -->
<script src="js/lightbox.js"></script>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script>
    jQuery(document).ready(function ($) {
        $('a').smoothScroll({
            speed: 1000,
            easing: 'easeInOutCubic'
        });
        $('.showOlderChanges').on('click', function (e) {
            $('.changelog .old').slideDown('slow');
            $(this).fadeOut();
            e.preventDefault();
        })
    });
</script>