<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/12/27/027
  Time: 11:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="/js/jquery-3.2.1.min.js"></script>
    <link rel="stylesheet" type="text/css" href="/bootstrap/css/bootstrap.min.css">
    <script src="/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript">
        $(function(){
            var res=${res};
            if(res==1){
                alert("操作成功");
            }
        });
    </script>
</head>
<body>
<div class="container">
<div>
    <ul class="nav nav-tabs" role="tablist">
        <li class="active"><a href="/good.jsp">添加供货商</a></li>
        <li><a href="/selAllType">添加商品</a></li>
        <li><a href="/manage">商品管理</a></li>
    </ul>
</div>
    <div>
        <p>供货商信息：</p>
        <form action="/addBuss" method="post" class="form-horizontal" role="form">
            <div class="form-group">
                <label class="col-sm-2 control-label">供货商名称：</label>
                <div class="col-sm-10 col-lg-3">
                    <input type="text" name="buss_name" class="form-control"/>
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-2 control-label">注册公司：</label>
                <div class="col-sm-10 col-lg-3">
                    <input type="text" name="buss_company" class="form-control"/>
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-2 control-label">所在地：</label>
                <div class="col-sm-10 col-lg-3">
                    <input type="text" name="buss_address" class="form-control"/>
                </div>
            </div>
            <div class="form-group">
                <div class="col-sm-offset-2 col-sm-10">
                    <input type="submit" value="保存" class="btn btn-default"/>
                </div>
            </div>
        </form>
    </div>
</div>
</body>
</html>
