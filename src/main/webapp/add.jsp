<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="red">


<! Directive = Used for import statements!--->
<%@page import="java.util.*" %>

<%!
	//	Declaration -> Goes outside service method
		int num4=100;
%>

<% 
	//Scriplet -> Goes inside service method
	int num1 = Integer.parseInt(request.getParameter("num1"));
	int num2 = Integer.parseInt(request.getParameter("num2"));
	int num3 = num1+num2;
	out.println(num3);
%>
<! Expression tag= used to print -->
My fav number is: <%= num4 %>

</body>
</html>