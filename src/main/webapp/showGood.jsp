<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/12/29/029
  Time: 16:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="/bootstrap/css/bootstrap.min.css">
    <script src="/js/jquery-3.2.1.min.js"></script>
    <script src="/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
    <nav class="navbar navbar-default" role="navigation">
        <div class="container-fluid">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse"
                        data-target="#example-navbar-collapse">
                    <span class="sr-only">切换导航</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="#">商品分类</a>
            </div>
            <div class="collapse navbar-collapse" id="example-navbar-collapse">
                <ul class="nav navbar-nav">
                    <c:forEach items="${listType}" var="goodType">
                        <li class="dropdown">
                            <a href="/selGoodByType?good_type=${goodType.good_type}" class="dropdown-toggle" data-toggle="dropdown">${goodType.good_type} <b class="caret"></b></a>
                            <ul class="dropdown-menu">
                            <c:if test="${goodType.good_type=='手机'}">
                                <li><a href="#?key='华为'">华为</a></li>
                                <li class="divider"></li>
                                <li><a href="#?key='oppo'">oppo</a></li>
                                <li class="divider"></li>
                                <li><a href="#?key='vivo'">vivo</a></li>
                                <li class="divider"></li>
                                <li><a href="#?key='IPhone'">IPhone</a></li>
                                <li class="divider"></li>
                                <li><a href="#?key='小米'">小米</a></li>
                            </c:if>
                                <c:if test="${goodType.good_type=='笔记本'}">
                                    <li><a href="#?key='联想'">联想</a></li>
                                    <li class="divider"></li>
                                    <li><a href="#?key='华硕'">华硕</a></li>
                                    <li class="divider"></li>
                                    <li><a href="#?key='苹果'">苹果</a></li>
                                    <li class="divider"></li>
                                    <li><a href="#?key='戴尔'">戴尔</a></li>
                                    <li class="divider"></li>
                                    <li><a href="#?key='神州'">神州</a></li>
                                </c:if>
                                <c:if test="${goodType.good_type=='手机配件'}">
                                    <li><a href="#?key='充电'">充电设备</a></li>
                                    <li class="divider"></li>
                                    <li><a href="#?key='膜'">手机膜</a></li>
                                    <li class="divider"></li>
                                    <li><a href="#?key='套'">手机套</a></li>
                                    <li class="divider"></li>
                                    <li><a href="#?key='耳机'">耳机</a></li>
                                </c:if>
                                <c:if test="${goodType.good_type=='笔记本配件'}">
                                    <li><a href="#?key='充电'">适配器</a></li>
                                    <li class="divider"></li>
                                    <li><a href="#?key='键盘'">键盘</a></li>
                                    <li class="divider"></li>
                                    <li><a href="#?key='鼠标'">鼠标</a></li>
                                    <li class="divider"></li>
                                    <li><a href="#?key='U盘'">U盘</a></li>
                                </c:if>
                                <c:if test="${goodType.good_type=='家具'}">
                                    <li><a href="#?key='床'">床/床品</a></li>
                                    <li class="divider"></li>
                                    <li><a href="#?key='柜'">衣柜/组合柜</a></li>
                                    <li class="divider"></li>
                                    <li><a href="#?key='桌'">圆桌/餐桌/茶几</a></li>
                                    <li class="divider"></li>
                                    <li><a href="#?key='座'">凳/座椅/沙发</a></li>
                                </c:if>
                                <c:if test="${goodType.good_type=='家电'}">
                                    <li><a href="#?key='电视'">电视机</a></li>
                                    <li class="divider"></li>
                                    <li><a href="#?key='空调'">空调</a></li>
                                    <li class="divider"></li>
                                    <li><a href="#?key='洗衣机'">洗衣机</a></li>
                                    <li class="divider"></li>
                                    <li><a href="#?key='冰箱'">冰箱</a></li>
                                    <li class="divider"></li>
                                    <li><a href="#?key='热水器'">热水器</a></li>
                                    <li class="divider"></li>
                                    <li><a href="#?key='空气'">空气净化器</a></li>
                                </c:if>
                            </ul>

                        </li>
                    </c:forEach>
                </ul>
            </div>
        </div>
    </nav>

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
