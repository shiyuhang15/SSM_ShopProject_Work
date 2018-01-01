<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/12/27/027
  Time: 17:19
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
        <p>添加商品明细：</p>
    <form action="/addGoodInfo" method="post" enctype="multipart/form-data" class="form-horizontal" role="form">
        <div class="form-group">
            <label class="col-sm-2 control-label">商品编码：</label>
            <div class="col-sm-10 col-lg-3">
                <input type="text" name="good_id" value="${good_id}" class="form-control" disabled="disabled"/>
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-2 control-label">商品描述：</label>
            <div class="col-sm-10 col-lg-3">
                <input type="text" name="good_info" class="form-control"/>
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-2 control-label">商品图片：</label>
            <div class="col-sm-10 col-lg-3">
                <input type="file" name="imageFile" class="form-control"/>
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-2 control-label">商品价格：</label>
            <div class="col-sm-10 col-lg-2">
                <input type="text" name="good_price" class="form-control"/>
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-2 control-label">商品库存：</label>
            <div class="col-sm-10 col-lg-1">
                <input type="number" name="good_count" class="form-control"/>
            </div>
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
