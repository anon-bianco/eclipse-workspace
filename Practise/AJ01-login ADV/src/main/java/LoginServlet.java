

import java.io.*;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter pw = response.getWriter();
		
		String a = request.getParameter("n6");
		String b = request.getParameter("n7");
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aj01_login", "root", "Bianco@Anon1");
			Statement st = con.createStatement();
			
			ResultSet rs = st.executeQuery("SELECT * FROM registration_table WHERE email='"+a+"' AND password='"+b+"' ");
			if(rs.next()) {
				
				String c = rs.getString(1);
				String d = rs.getString(6);
				
				HttpSession s = request.getSession();
				s.setAttribute("sName", c);
				s.setAttribute("sPhoto", d);
				
				response.sendRedirect("Home.jsp");
			}
			else {
				response.sendRedirect("WrongPassword.jsp");
			}
		}
		
		catch(Exception e2) {
			pw.println(e2);
		}
	}

}
