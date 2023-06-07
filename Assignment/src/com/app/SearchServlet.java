package com.app;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SearchServlet
 */
@WebServlet("/serv2")
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		//read prn
		int prn=Integer.parseInt(request.getParameter("prn"));
		Student s=new Student();
		s.setPrn(prn);
		boolean status=false;
		Student name1=new Student();
//		try {
//			status=StudentDAO.searchStd(s);
//			System.out.println(status);
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		try {
			
			name1=StudentDAO.getStd(s);
			status=StudentDAO.searchStd(s);
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	
	if(status) {
//		pw.write("<br>"+name1.getPrn()+"<br>"+name1.getName()+"<br>"+name1.getM1()+"<br>"+name1.getM2()+"<br>"+name1.getM3());
//	 pw.write("<br> total is"+s.total(name1.getM1(), name1.getM2(),name1.getM3())+"<br>");
//	 pw.write("<br> Percentage is"+s.percentage(name1.getM1(), name1.getM2(), name1.getM3())+"<br>");
//		
	   
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

 
     pw.println("<tr>");
     pw.println("<td>"+name1.getPrn()+"</td>");
     pw.println("<td>"+name1.getName()+"</td>");
     pw.println("<td>"+name1.getM1()+"</td>");
     pw.println("<td>"+name1.getM2()+"</td>");
     pw.println("<td>"+name1.getM3()+"</td>");
 
     pw.println("<td>"+s.total(name1.getM1(), name1.getM2(),name1.getM3())+"</td>");
     pw.println("<td>"+s.percentage(name1.getM1(), name1.getM2(), name1.getM3())+"</td>");
     pw.println("</tr>");

    
     pw.println("</table>");
     pw.println("</body>");
     pw.println("</html>");
	 
	}
	else {
		pw.write("Invalid PRN");
	}
}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
