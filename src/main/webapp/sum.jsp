<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>sum.jsp</title>
</head>
<body>
<%! //선언부 - 멤버변수, 멤버메소드를 구현
	public int sum(int x,int y) {
	return x+y;
}
%>
<h1>두 수 합</h1>
<%
	int num1=Integer.parseInt(request.getParameter("num1"));
	int num2=Integer.parseInt(request.getParameter("num2"));
	//int num3=num1+num2;
	int num3=sum(num1,num2);
	Date d=new Date();
%> 
<%=num1 %>+<%=num2 %>=<%=num3 %>
</body>
</html>