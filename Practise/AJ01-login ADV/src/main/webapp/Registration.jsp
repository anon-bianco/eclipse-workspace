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
                    <form method="POST" action="RegistrationServlet" id="signup-form" class="signup-form">
                        <h2 class="form-title">Create account</h2>
                        <div class="form-group">
                            <input type="text" class="form-input" name="n1" id="name" placeholder="Your Name"/>
                        </div>
                        <div class="form-group">
                            <input type="email" class="form-input" name="n2" id="email" placeholder="Your Email"/>
                        </div>
                        <div class="form-group">
							<input type="radio" name="n3" class="form-check-input" value="male">
							<label class="form-check-label">
    						Male
  							</label>
							<input type="radio" name="n3" class="form-check-input" value="female">
							<label class="form-check-label">
    						Female
  							</label>
                        </div>
                        <div class="form-group">
							<select name="n4" class="form-select">
								<option value="">Choose Country</option>
								<option value="India">India</option>
								<option value="US">US</option>
								<option value="UK">UK</option>
								<option value="Germany">Germany</option>
								<option value="Italy">Italy</option>
							</select>
                        </div>
                        <div class="form-group">
                            <input type="password" class="form-input" name="n5" placeholder="Password"/>
                        </div>
                        <div class="form-group">
                            <input type="text" class="form-input" name="n6" placeholder="Image URL"/>
                        </div>
                        <div class="form-group">
                            <input type="checkbox" name="agree-term" id="agree-term" class="agree-term" />
                            <label for="agree-term" class="label-agree-term"><span><span></span></span>I agree all statements in  <a href="#" class="term-service">Terms of service</a></label>
                        </div>
                        <div class="form-group">
                            <input type="submit" name="submit" id="submit" class="form-submit" value="Sign up"/>
                        </div>
                    </form>
                    <p class="loginhere">
                        Have already an account ? <a href="Login.jsp" class="loginhere-link">Login here</a>
                    </p>
                </div>
            </div>
        </section>

    </div>

    <!-- JS -->
    <script src="vendor/jquery/jquery.min.js"></script>
    <script src="js/main.js"></script>
</body><!-- This templates was made by Colorlib (https://colorlib.com) -->
</html>