<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
String id = request.getParameter("id");
%>
<%
String name = request.getParameter("name");
%>
<%
String email = request.getParameter("email");
%>
<%
String contact = request.getParameter("contact");
%>
<%
String course = request.getParameter("course");
%>
<%
String place = request.getParameter("place");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Registration</title>
</head>
<body>
	<table>
	<tr>
		<td><label>ID:</label></td>
		<td><%=id %></td>
	</tr>
	<tr>
		<td><label>Name:</label></td>
		<td><%=name%></td>
	</tr>
	<tr>
		<td><label>Email:</label></td>
		<td><%=email %></td>
	</tr>
	<tr>
		<td><label>Contact:</label></td>
		<td><%=contact %></td>
	</tr>
	<tr>
		<td><label>Course:</label></td>
		<td><%=course %></td>
	</tr>
	<tr>
		<td><label>Place:</label></td>
		<td><%=place %></td>
	</tr>
	</table>
</body>
</html>