<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/12/26/026
  Time: 11:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>HT电商平台用户登录</title>
    <script type="text/javascript" src="/js/jquery-3.2.1.min.js"></script>
    <link type="text/css" rel="stylesheet" href="/bootstrap/css/bootstrap.min.css">
    <script type="text/javascript" src="/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
    <div>
        <p>欢迎登录</p>
    <form action="/login" method="post" class="form-horizontal" role="form">
        <div class="form-group">
            <label class="col-sm-2 control-label">用户名：</label>
            <div class="col-sm-10 col-lg-3">
                <input type="text" name="username" placeholder="请输入用户名" class="form-control"/>
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-2 control-label">密　码：</label>
            <div class="col-sm-10 col-lg-3">
                <input type="password" name="password" placeholder="请输入密码" class="form-control"/>
            </div>
        </div>
        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <input type="submit" value="登录" class="btn btn-default"/>
                <a href="/reg.jsp">注册</a>
            </div>
        </div>

    </form>
    </div>
</div>
</body>
</html>
