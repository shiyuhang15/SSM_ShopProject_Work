<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>HT电商平台</title>
    <%--<link rel="stylesheet" href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
    <script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>--%>

    <link rel="stylesheet" type="text/css" href="/bootstrap/css/bootstrap.min.css">
    <script src="/js/jquery-3.2.1.min.js"></script>
    <script src="/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript">
        $(function () {
            $("#myCarousel").carousel({
                interval :2000
            });
        })
    </script>
</head>
<body>
<div class="container">
    <div>
    <ul class="nav nav-tabs" role="tablist">
        <li><a href="/reg.jsp">注册</a></li>
        <li><a href="/login.jsp">登录</a></li>
        <li><a href="/good.jsp">商品管理</a></li>
    </ul>
    </div>
    <div id="myCarousel" class="carousel slide">
        <!-- 轮播指标 -->
        <ol class="carousel-indicators">
            <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
            <li data-target="#myCarousel" data-slide-to="1"></li>
            <li data-target="#myCarousel" data-slide-to="2"></li>
        </ol>
        <!-- 轮播项目 -->
        <div class="carousel-inner">
            <div class="item active">
                <img src="/image/indexshop1.jpg" alt="First slide">
            </div>
            <div class="item">
                <img src="/image/indexshop3.jpg" alt="Second slide">
            </div>
            <div class="item">
                <img src="/image/indexshop4.jpg" alt="Third slide">
            </div>
        </div>
        <!-- 轮播导航 -->
        <a class="carousel-control left" href="#myCarousel"
           data-slide="prev">&lsaquo;</a>
        <a class="carousel-control right" href="#myCarousel"
           data-slide="next">&rsaquo;</a>
    </div>
    <div class="jumbotron">
    <c:forEach items="${listType}" var="goodType">
        <a href="/selGoodByType?good_type=${goodType.good_type}">${goodType.good_type}</a>
    </c:forEach>
</div>
<div class="row">
    <c:forEach items="${listGood}" var="good">
        <div class="col-sm-4">
            <img class="img-rounded" src="${good.good_imageurl}"/></p>
            <a href="/selGoodInfoByGoodid?good_id=${good.good_id}">${good.good_name}</a>
        </div>
    </c:forEach>
</div>
</div>


</body>
</html>
