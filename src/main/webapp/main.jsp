<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>main.jsp</title>
</head>
<body>
<ul>
	<li><a href="login.jsp">회원로그인</a></li>
</ul>
<%
	String id="test";
	out.print(id+"<br>");
%>
<form method="post" action="sum.jsp">
	정수1<input type="text" name="num1"><br>
	정수2<input type="text" name="num2"><br>
	<input type="submit" value="합구하기">
</form>
</body>
</html>