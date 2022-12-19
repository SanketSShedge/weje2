<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<th>ID:</th>
			<td><input type="number" name="id"></td>
		</tr>
		<tr>
			<th>Name:</th>
			<td><input type="text" name="name"></td>
		</tr>
		<tr>
			<th>Location:</th>
			<td><input type="text" name="location"></td>
		</tr>
		<tr>
			<td><input type="submit" value="Submit"></td>
		</tr>
	</table>
	<%
	String id = request.getParameter("id");
	String driverName = "com.mysql.jdbc.Driver";
	String connectionUrl = "jdbc:mysql://localhost:3306/";
	String dbName = "product";
	String user = "root";
	String password = "root";

	try {
		Class.forName(driverName);
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}

	Connection connection = null;
	Statement statement = null;
	ResultSet result = null;
	%>

	<h2 align="center">Retrieve data from database</h2>

	<%
	try {
		connection = DriverManager.getConnection(connectionUrl + dbName, user, password);
		statement = connection.createStatement();
		String query = "select * from customer";

		result = statement.executeQuery(query);
		while (result.next()) {
	%>
	<tr>
		<td><%=result.getInt("id")%></td>
		<td><%=result.getString("name")%></td>
		<td><%=result.getString("location")%></td>
	</tr>
	<%
	}
	} catch (Exception e) {
	e.printStackTrace();
	}
	%>

</body>
</html>