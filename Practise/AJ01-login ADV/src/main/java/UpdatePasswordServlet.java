

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/UpdatePasswordServlet")
public class UpdatePasswordServlet extends HttpServlet {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		PrintWriter pw = response.getWriter();
		
		try {
			
			
			String a = request.getParameter("n1");
			String b = request.getParameter("n2");
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection
					("jdbc:mysql://localhost:3306/aj01_login", "root", "Bianco@Anon1");
			
			Statement st = con.createStatement();
			st.executeUpdate
			("UPDATE registration_table SET password = '"+b+"' WHERE password = '"+a+"' ");
			response.sendRedirect("PasswordUpdateSuccess.jsp");
		}
		
		catch(Exception e){
			pw.println(e);
		}
	}

}
