

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String a = request.getParameter("n1");
		String b = request.getParameter("n2");
		String c = request.getParameter("n3");
		
		PrintWriter pw = response.getWriter();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aj03_e_shopper", "root", "Bianco@Anon1"); 
			Statement st = con.createStatement();
			
			ResultSet rs = st.executeQuery("SELECT * FROM registration WHERE email = '"+b+"' ");
			
			if(rs.next()) {
				pw.println("This username is already taken, try another.");
			}
			else {
				st.executeUpdate("INSERT INTO registration VALUES ('"+a+"', '"+b+"', '"+c+"') ");
				response.sendRedirect("login.jsp");
			}
		}
		
		catch(Exception e) {
			pw.println(e);
		}
	}

}
