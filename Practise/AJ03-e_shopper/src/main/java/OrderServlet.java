

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/OrderServlet")
public class OrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter pw = response.getWriter();
		
		String a = request.getParameter("n1");
		String b = request.getParameter("n2");
		String c = request.getParameter("n3");
		String d = request.getParameter("n4");
		String e = request.getParameter("n5");
		String f = request.getParameter("n6");
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aj03_e_shopper", "root", "Bianco@Anon1");
			Statement st = con.createStatement();
			st.executeUpdate("INSERT INTO order_table VALUES ('"+a+"', '"+b+"', '"+c+"', '"+d+"', '"+e+"', '"+f+"', 'not delivered yet')");
			response.sendRedirect("success.jsp");
		} 
		catch (Exception e2) {
			pw.println(e2);
		}
	}

}
