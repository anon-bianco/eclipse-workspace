<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import = "java.sql.*" %>
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Login Page</title>
	</head>
	<body>
		<form action="#" method="post">
			<label>Username</label>
			<input type = "text" name = "n1"><br><br>
			<label>Password</label>
			<input type = "password" name = "n2"><br><br>
			<input type = "submit">
		</form>
	</body>	
</html>

<%
	String a = request.getParameter("n1");
	String b = request.getParameter("n2");
	
	if(a!=null && b!=null){
		if(a.equals("anonh7@gmail.com") && b.equals("bianco@123")){
			try{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection
						("jdbc:mysql://localhost:3306/sb", "root", "Bianco@Anon1");
				
				Statement st = con.createStatement();
				st.executeUpdate("INSERT INTO login VALUES ('"+a+"', '"+b+"')");
				response.sendRedirect("home.jsp");
			}
			catch(SQLException e){
				out.println(e);
			}
			
		}
		else{
			out.println("Invalid username or password. Try again.");
		}
	}
%>