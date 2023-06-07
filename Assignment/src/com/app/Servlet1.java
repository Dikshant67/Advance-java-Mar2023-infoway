package com.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
@WebServlet("/serv1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Servlet1() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		int prn=Integer.parseInt(request.getParameter("prn"));
		String name=request.getParameter("name");

		int m1=Integer.parseInt(request.getParameter("m1"));
		int m2=Integer.parseInt(request.getParameter("m2"));
		int m3=Integer.parseInt(request.getParameter("m3"));

		//		pw.write(prn+"<br>");
		//		pw.write(name+"<br>");
		//		pw.write(m1+"<br>");
		//		pw.write(m2+"<br>");
		//		pw.write(m3+"<br>");
		Student s=new Student();
		s.setPrn(prn);
		s.setName(name);
		s.setM1(m1);
		s.setM2(m2);
		s.setM3(m3);
		int status=0;

		try {
			status=StudentDAO.saveStudent(s);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(status>0) {
			response.sendRedirect("form.html");
		}
		else {
			pw.write("failed to register");
			request.getRequestDispatcher("index.html");

		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
