<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>This is TagDemo1 jsp</h1>
	<%
	List<Integer> list = new ArrayList();
	%>
	<%
	list.add(1);
	%>
	<%
	list.add(2);
	%>
	<%
	list.add(3);
	%>
	<%
	list.add(4);
	%>
	<%
	list.add(5);
	%>

	<%
	for (int num : list) {
	%>
	<%=num%>
	<%
	}
	%>
</body>
</html>