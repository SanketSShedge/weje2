<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Registration</title>
</head>
<body>
	<form action="./StudentDetails.jsp" method="get">
		<table>
			<tr>
				<td><label>ID:</label></td>
				<td><input type="text" name="id"></td>
			</tr>
			<tr>
				<td><label>Name:</label></td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td><label>Email:</label></td>
				<td><input type="text" name="email"></td>
			</tr>
			<tr>
				<td><label>Contact:</label></td>
				<td><input type="text" name="contact"></td>
			</tr>
			<tr>
				<td><label>Course:</label></td>
				<td><input type="text" name="course"></td>
			</tr>
			<tr>
				<td><label>Place:</label></td>
				<td><input type="text" name="place"></td>
			</tr>
			<tr>
			<td><input type="submit"value="Submit"></td>
			</tr>
		</table>
	</form>
</body>
</html>