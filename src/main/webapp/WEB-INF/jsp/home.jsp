<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="zh">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <title>首页</title>
</head>
<style>
</style>

<body>
    <table border="1px" width="50%" style="text-align: center;margin:0 auto;">
        <tr>
            <td>用户id</td>
            <td>登录时间</td>
            <td>登录ip</td>
        </tr>
        <c:forEach var="u" items="${userLog}">
            <tr>
                <td>${u.userid}</td>
                <td>${u.logintime}</td>
                <td>${u.loginip}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>