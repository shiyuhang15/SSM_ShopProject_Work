<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/12/29/029
  Time: 10:35
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
    <script type="text/javascript">
        $(function () {
            var rows=${rows};
            if(rows==1){
                alert("添加商品明细成功！");
            }
        })
    </script>
</head>
<body>
<div class="container">
    <div>
        <p>商品信息管理：</p>
    </div>
    <table class="table table-hover">
        <thead>
        <tr>
            <td>商品ID</td>
            <td>商品编码</td>
            <td>商品名称</td>
            <td>商品类型</td>
            <td>供货商</td>
            <td>上架时间</td>
            <td>上传地址</td>
            <td>是否赠品</td>
            <td>是否支持退换</td>
            <td>添加</td>
            <td>删除</td>
            <td>修改</td>
        </tr>
        </thead>
        <tbody>
            <c:forEach items="${listGood}" var="good">
        <tr>
                <td>${good.id}</td>
                <td>${good.good_id}</td>
                <td>${good.good_name}</td>
                <td>${good.good_type}</td>
                <td>${good.buss_name}</td>
                <td>${good.good_createtime}</td>
                <td>${good.good_imageurl}</td>
                <td>${good.good_isfree}</td>
                <td>${good.good_ischange}</td>
                <td><a href="/takeGoodId?good_id=${good.good_id}">添加商品明细</a></td>
                <td><a href="/delGood?id=${good.id}">删除商品</a></td>
                <td><a href="#?id=${good.id}">修改商品</a></td>
        </tr>
            </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>
