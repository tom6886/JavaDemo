<%--
  Created by IntelliJ IDEA.
  User: tangbo
  Date: 2018-04-11
  Time: 10:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="/static/css/login.css">
    <title>登录</title>
</head>
<body>
<div class="htmleaf-container">
    <div class="wrapper">
        <div class="container">
            <div style="display: block">
                <img src="/static/images/logo.png" style="height: 86px;"/>
            </div>
            <h1 style="letter-spacing:0.2em;">环网柜智能云在线监测</h1>
            <form class="form" id="form_login" action="/loginAction/signIn" method="post">
                <input type="text" name="account" placeholder="用户名">
                <input type="password" name="pwd" placeholder="密码">
                <button type="submit" id="login-button">登录</button>
            </form>
        </div>
        <ul class="bg-bubbles">
            <li></li>
            <li></li>
            <li></li>
            <li></li>
            <li></li>
            <li></li>
            <li></li>
            <li></li>
            <li></li>
            <li></li>
        </ul>
    </div>
</div>

<script type="text/javascript" src="/static/js/min/buddle.jquery.min.js"></script>
<script type="text/javascript" src="/static/js/page/login.js"></script>
</body>
</html>
