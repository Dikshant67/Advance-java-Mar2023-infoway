package com.app;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet
 */
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       ServletConfig config;
       String p,n,r;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

public void init() throws ServletException {
	super.init();
	config=getServletConfig();
	p=config.getInitParameter("principal");
	n=config.getInitParameter("years");
	r=config.getInitParameter("roi");
	
}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	response.setContentType("text/html");
	PrintWriter pw=response.getWriter();
	String str="";
	Enumeration<String> e= config.getInitParameterNames();
	while(e.hasMoreElements()) {
		str=e.nextElement();
		pw.write(str+" "+config.getInitParameter(str)+"<br>");
		
	}
		
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
