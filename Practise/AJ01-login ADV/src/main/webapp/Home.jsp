<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<title>My Modern Homepage</title>
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<link href="https://fonts.googleapis.com/css?family=Montserrat:400,700&display=swap" rel="stylesheet">
	<link rel="stylesheet" type="text/css" href="css/CSS2.css">
</head>
<body>
	<header>
		<nav>
			<ul>
				<li><a href="#">Home</a></li>
				<li><a href="#">About</a></li>
				<li><a href="#">Portfolio</a></li>
				<li><a href="#">Contact</a></li>
				<li class="logout"><a href="Login.jsp">Logout</a></li>
			</ul>
		</nav>
	</header>
	<main>
		<div class="user-photo">
			<img src="<%
		String f = session.getAttribute("sPhoto").toString();
		out.println(f);
		%>" alt="User Photo">
		</div>
		<h1>Welcome to Homepage,<%
		String e = session.getAttribute("sName").toString();
		out.println(" " + e);
		%></h1>
	</main>
	<footer>
		<p>&copy; 2023 Anon Blog</p>
	</footer>
</body>
</html>
    