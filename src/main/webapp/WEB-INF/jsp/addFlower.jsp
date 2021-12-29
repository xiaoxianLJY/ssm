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
    <title>增加界面</title>
</head>
<body>
<div class="jumbotron" style="background-color: #FFAA48">
    <div class="container">
        <h2 class="text-center ">新添花</h2>
    </div>
</div>
<center>
    <form action="AddFlower" method="post">
        <div>
            <label>花名：</label>
            <input type="text" name="fname" value="${param.userName}" />
        </div>
        <br/>
        <div>
            <label>价格：</label>
            <input type="text" name="fprice" />
        </div>
        <br/>
        <div>
            <label>图片：</label>
            <input type="text" name="fimg" />
        </div>
        <br/>
        <input type="submit"  class="btn btn-warning" value="新添" />
    </form>
</center>
</body>
</html>
