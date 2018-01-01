<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/12/27/027
  Time: 15:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="/js/jquery-3.2.1.min.js"></script>
    <link rel="stylesheet" type="text/css" href="/bootstrap/css/bootstrap.min.css">
    <script src="/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
<div>
    <ul class="nav nav-tabs" role="tablist">
        <li><a href="/good.jsp">添加供货商</a></li>
        <li class="active"><a href="/selAllType">添加商品</a></li>
        <li><a href="/manage">商品管理</a></li>
    </ul>
</div>
<div>
    <p>商品信息：</p>
    <form action="/addGood" method="post" enctype="multipart/form-data" class="form-horizontal" role="form">
        <div class="form-group">
            <label class="col-sm-2 control-label">商品名称：</label>
            <div class="col-sm-10 col-lg-3">
                <input type="text" name="good_name" class="form-control"/>
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-2 control-label">商品类型：</label>
            <div class="col-sm-10 col-lg-2">
                <select name="good_type" class="form-control">
                    <c:forEach items="${listType}" var="goodType">
                        <option>${goodType.good_type}</option>
                    </c:forEach>
                </select>
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-2 control-label">供应商名称：</label>
                <div class="col-sm-10 col-lg-2">
                <select name="buss_name" class="form-control">
                    <c:forEach items="${listBuss}" var="buss">
                        <option>${buss.buss_name}</option>
                    </c:forEach>
                </select>
                </div>
        </div>
        <div class="form-group">
            <label class="col-sm-2 control-label">商品图片：</label>
            <div class="col-sm-10 col-lg-3">
                <input type="file" name="good_imageurl" class="form-control"/>
            </div>
        </div>
        <label class="col-sm-2 control-label">是否赠品：</label>
        <div class="col-sm-10">
            <label class="radio-inline">
                <input type="radio" name="good_isfree" value="是"/>非赠品
            </label>
            <label class="radio-inline">
                <input type="radio" name="good_isfree" value="否"/>赠品
            </label>
        </div>
        <label class="col-sm-2 control-label">是否支持退换：</label>
        <div class="col-sm-10">
            <label class="radio-inline">
                <input type="radio" name="good_ischange" value="是"/>支持7天无理由退换
            </label>
            <label class="radio-inline">
                <input type="radio" name="good_ischange" value="否"/>商品不支持退换
            </label>
        </div>
        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <input type="submit" value="提交" class="btn btn-default"/>
            </div>
        </div>
    </form>
</div>
</div>
</body>
</html>
