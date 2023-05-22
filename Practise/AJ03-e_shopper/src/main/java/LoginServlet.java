

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter pw = response.getWriter();
		
		String d = request.getParameter("n4");
		String e = request.getParameter("n5");
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aj03_e_shopper", "root", "Bianco@Anon1");
			Statement st = con.createStatement();
			
			ResultSet rs = st.executeQuery("SELECT * FROM registration WHERE email='"+d+"' AND password='"+e+"' ");
			
			if(rs.next()) {
				HttpSession s = request.getSession(); 
				s.setAttribute("uName", rs.getString(1));
				response.sendRedirect("index.jsp");
			}
			else {
				pw.println("Please check your username & password");
			}
		} 
		
		catch (Exception e1) {
			pw.println(e1);
		}
	}

}
