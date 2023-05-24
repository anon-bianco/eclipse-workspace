<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Order Page</title>
	</head>
	<body>
		<%String a = session.getAttribute("uName").toString(); %>
		
		<h1>Order page</h1><br><br>
		<form action="OrderServlet" method="post">
			Name <input type="text" name="n1" value="<%=a%>"><br><br>
			Address <textarea name="n2" rows="4" cols="50"></textarea><br><br>
			Ph no <input type="text" name="n3"><br><br>
			Product name <input type="text" name="n4" value="Easy Polo Black Edition" readonly><br><br>
			Price <input type="text" name="n5" value="56" readonly><br><br>
			Payment mode
			<select name="n6">
				<option>COD</option>
				<option>UPI</option>
			</select><br><br>
			<input type="submit">
		</form>
		
	</body>
</html>