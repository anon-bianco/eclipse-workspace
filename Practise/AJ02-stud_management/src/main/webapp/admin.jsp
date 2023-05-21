<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Admin Login</title>
	</head>
	<body>
		<h1>Admin Login</h1>
		<form action="AdminLoginServlet" method="post">
			<input type="text" name="n1" placeholder="Username">
			<input type="password" name="n2" placeholder="Password">
			<input type="submit">
		</form>
	</body>
</html>