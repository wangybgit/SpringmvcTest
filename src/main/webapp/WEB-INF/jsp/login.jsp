<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登陆界面</title>
</head>
<body>
<form action="/testController/loginCheck" method="post">
帐号:<input type="text" name="username"><br>
密码:<input type="password" name="password"><br>
<input type="submit" value="登录">
</form>
</body>
</html>