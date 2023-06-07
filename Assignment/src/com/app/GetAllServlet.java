package com.app;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.cj.protocol.Resultset;

/**
 * Servlet implementation class GetAllServlet
 */
@WebServlet("/serv3")
public class GetAllServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       Connection con =null;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetAllServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();

		Student s=new Student();
//		Resultset rs1= null;
//		rs1 = (Resultset) StudentDAO.getAllStd();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Found");
			con =DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","Password@123");
			System.out.println("Connection Established");
			
			PreparedStatement pstmt= con.prepareStatement("select * from student"); 
			ResultSet rs=pstmt.executeQuery();
			
			
			
			
			
			 pw.println("<html>");
		     pw.println("<style>");
		     pw.println("table {");
		     pw.println("  border-collapse: collapse;");
		     pw.println("  width: 100%;");
		     pw.println("}");
		     pw.println("td, th {");
		     pw.println("  border: 1px solid black;");
		     pw.println("  padding: 8px;");
		     pw.println("}");
		     pw.println(" th {");
		 
		     pw.println("background-color: Dodgerblue;");
		     pw.println("}");
		     pw.println(" td {");
		     
		     pw.println("background-color: skyblue;");
		     pw.println("}");
		     pw.println("</style>");
		     pw.println("<body>");
		     pw.println("<h2>ALL STUDENT RECORD</h2>");
		     pw.println("<table >");

		    
		     pw.println("<tr>");
		     pw.println("<th>PRN</th>");
		     pw.println("<th>NAME</th>");
		     pw.println("<th>M1</th>");
		     pw.println("<th>M2</th>");
		     pw.println("<th>M3</th>");
		     pw.println("<th>TOTAL</th>");
		     pw.println("<th>PERCENTAGE</th>");
		     pw.println("</tr>");

			
			while(rs.next()) {
				
			 
			     pw.println("<tr>");
			     pw.println("<td>"+rs.getInt(1)+"</td>");
			     pw.println("<td>"+rs.getString(2)+"</td>");
			     pw.println("<td>"+rs.getInt(3)+"</td>");
			     pw.println("<td>"+rs.getInt(4)+"</td>");
			     pw.println("<td>"+rs.getInt(5)+"</td>");
			 
			     pw.println("<td>"+Student.total(rs.getInt(3), rs.getInt(4),rs.getInt(5))+"</td>");
			     pw.println("<td>"+Student.percentage(rs.getInt(3), rs.getInt(4), rs.getInt(5))+"</td>");
			     pw.println("</tr>");

			  
			}
			  
		     pw.println("</table>");
		     pw.println("</body>");
		     pw.println("</html>");
		
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		

	
//		while(rs.next()) {
//			rs.getInt(1);
//		rs.getString(2);
//		rs.getInt(3);
//			rs.getInt(4);
//			rs.getInt(5);
//		}
//	
		
		

	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			doGet(request, response);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
