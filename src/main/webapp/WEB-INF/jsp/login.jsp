<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="zh">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <title>注册</title>
</head>


<style>
    input{
        display: block;
        margin-top:20px;
    }
</style>

<body>
<div style="width:50%;margin: 0 auto;">
    <h1 style="text-align: center">登录</h1>
    <div style="width:50%;margin: 0 auto;">
        <form action="logins" method="post" style="position: relative">
            <input type="text" name="number" placeholder="请输入邮箱名称"/>
            <input type="text" name="pwd" placeholder="请输入密码">
            ${msg}
            <input type="submit" value="提交" style="position: absolute;left:55px;"/>
        </form>
    </div>
</div>
</body>
</html>