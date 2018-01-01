<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/1/001
  Time: 21:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <table>
        <thead>
        <tr>
        <td>商品名称</td>
        <td>商品明细</td>
        <td>购买数量</td>
        <td>价格</td>
        <td>操作</td>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${listShopCar}" var="shopCar">
            <tr>
                <td>${shopCar.good_name}</td>
                <td>${shopCar.good_info}</td>
                <td>${shopCar.info_count}</td>
                <td>${shopCar.good_price}</td>
                <td><a href="#?id=${shopCar.id}">删除</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</body>
</html>
