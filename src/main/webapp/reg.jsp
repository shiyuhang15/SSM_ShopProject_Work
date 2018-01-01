<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/12/26/026
  Time: 11:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <%
        String path = request.getContextPath();
        String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
    %>
    <title>HT电商平台用户注册</title>
    <script type="text/javascript" src="<%=basePath%>js/jquery-3.2.1.min.js"></script>
    <link rel="stylesheet" type="text/css" href="/bootstrap/css/bootstrap.min.css">
    <script src="/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript">
        $(function() {
            $("#username").blur(function () {
                $.ajax({
                    type: "post",
                    data: {"username": $("#username").val()},
                    url: "/selUserByname",
                    success: function (res) {
                        alert(res);
                        if (res == 1) {
                            $("#s_name").html("*用户名已存在");
                            $("#sub").prop("disabled",true);
                        } else {
                            $("#s_name").html("*用户名可以使用");
                            $("#sub").prop("disabled",false);
                        }
                    },
                    error: function (res) {
                        alert("error");
                    }
                });
            });
        })
    </script>
</head>
<body>
<div class="container">
<div>
    <p>欢迎注册</p>
    <form action="/reg" method="post" class="form-horizontal" role="form">
        <div class="form-group">
            <label class="col-sm-2 control-label">用户名：</label>
            <div class="col-sm-10 col-lg-3">
                <input type="text" name="username" id="username" class="form-control"/><span id="s_name"></span>
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-2 control-label">密　码：</label>
            <div class="col-sm-10 col-lg-3">
                <input type="password" name="password" class="form-control"/>
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-2 control-label">身份证：</label>
            <div class="col-sm-10 col-lg-3">
                <input type="text" name="vip_card" class="form-control"/>
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-2 control-label">真实姓名：</label>
            <div class="col-sm-10 col-lg-3">
                <input type="text" name="vip_realname" class="form-control"/>
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-2 control-label">邮　箱：</label>
            <div class="col-sm-10 col-lg-3">
                <input type="email" name="vip_email" class="form-control"/>
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-2 control-label">手机号：</label>
            <div class="col-sm-10 col-lg-3">
                <input type="text" name="vip_phone" class="form-control"/>
            </div>
        </div>
        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <div class="checkbox">
                    <label>
                        <input type="checkbox"/>同意本站条款
                    </label>
                </div>
            </div>
        </div>
        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <input id="sub" type="submit" value="提交" class="btn btn-default"/>
            </div>
        </div>
    </form>
</div>
</div>
</body>
</html>
