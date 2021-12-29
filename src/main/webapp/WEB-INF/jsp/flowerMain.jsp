<%--
  Created by IntelliJ IDEA.
  User: zjjt
  Date: 2021/12/24
  Time: 10:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <!-- 引入Bootstrap的CSS -->
    <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css" />
    <!-- 引入jQuery的库 -->
    <script type="text/javascript" src="js/jquery-3.3.1.js"></script>
    <!-- 引入Bootstrap的库 -->
    <script type="text/javascript" src="js/bootstrap.min.js"></script>
    <!-- 支持手机端 -->
    <meta name="viewport" content="width=device-width,initial-scale=1.0,user-scalable=no" />
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>主页面</title>
</head>
<body>
<div class="jumbotron" style="background-color: lightblue">
    <div class="container">
        <h2 class="text-center ">主页面</h2>
    </div>
</div>
<div class="container">
    <center>
        <form action="list" method="post">
            <input type="hidden" name="methodName" value="list" />
            <input name="fname" />
            <input type="submit" class="btn btn-info" value="查询"/>
            <a href="goAddFlowewr">增加</a>
        </form>
        <br/>
        <table border="1" align="center"  class="table table-hover table-bordered" >
            <tr align="center">
                <td>编号</td>
                <td>花名</td>
                <td>价格</td>
                <td>图片</td>
                <td>操作</td>
            </tr>
            <c:forEach items="${flowers}" var="f">
            <tr align="center">
                <td>${f.fid}</td>
                <td>${f.fname}</td>
                <td>${f.fprice}</td>
                <td><img src="${f.fimg}" width="100px" height="100px"></td>
                <td>
                    <a href="goEditFlowewr?fid=${f.fid}">修改</a>
                    <a href="DelFlower?fid=${f.fid}" onclick="return confirm('确定要删除吗?')">删除</a>
                </td>
            </tr>
            </c:forEach>
            <table/>
    </center>
</div>
</body>
</html>
