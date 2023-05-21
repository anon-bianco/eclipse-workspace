<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
  <head>
    <title>Wrong Password</title>
    <style>
      body {
        background-color: #FFFD86;
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
      }
      body.a{
      margin-top:"25px"
      }
      .emoji {
        font-size: 10em;
      }
    </style>
  </head>
  <body>
  	<div><h1>Please check your username and password.<br>
		 It doesn't match with our database.</h1></div>
    <div class="emoji">&#128577;</div>
   
  </body>
   <a 

    href="Login.jsp">
      <button>Retry</button>
    </a>
</html>
