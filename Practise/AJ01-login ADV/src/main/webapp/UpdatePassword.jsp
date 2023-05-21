<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Create Account</title>

    <!-- Font Icon -->
    <link rel="stylesheet" href="fonts/material-icon/css/material-design-iconic-font.min.css">

    <!-- Main css -->
    <link rel="stylesheet" href="css/style.css">
</head>
<body>

    <div class="main">

        <section class="signup">
            <!-- <img src="images/signup-bg.jpg" alt=""> -->
            <div class="container">
                <div class="signup-content">
                    <form method="POST" action="UpdatePasswordServlet" id="signup-form" class="signup-form">
                        <h2 class="form-title">Change Password</h2>
                        
                        <div class="form-group">
                            <input type="password" class="form-input" name="n1" id="email" placeholder="Old Password"/>
                        </div>
                        
                        <div class="form-group">
                            <input type="password" class="form-input" name="n2" placeholder="New Password"/>
                        </div>
                        
                        <div class="form-group">
                        	<button type="submit" name="submit" id="submit" class="form-submit">Update Password</button>
                        </div>
                    </form>
                    
                </div>
            </div>
        </section>

    </div>

    <!-- JS -->
    <script src="vendor/jquery/jquery.min.js"></script>
    <script src="js/main.js"></script>
</body>
</html>