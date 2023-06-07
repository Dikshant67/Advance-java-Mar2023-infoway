package com.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/serv1")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		String d=request.getParameter("data");
		String n=request.getParameter("engine");
		String url=null;
		try {
			if(d.trim().length()==0) {
				throw new Exception();
				
			}
			if(n.equals(null)) {
				throw new Exception();
			}
			if(n.equals("bing")) {
				url="https://www.bing.com/search?q="+d;
			}
			if(n.equals("yahoo")) {
				url="https://in.search.yahoo.com/search?p="+d;
			}
			if(n.equals("google")) {
				url="https://www.google.co.in/search?q="+d;
				
			}
			
			response.sendRedirect(url);
			
			
		}catch (Exception e) {
			response.sendRedirect("error.html");
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
