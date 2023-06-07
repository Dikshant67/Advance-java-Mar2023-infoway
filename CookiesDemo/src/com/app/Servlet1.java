package com.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
@WebServlet("/serv1")
public class Servlet1 extends HttpServlet implements Servlet {
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
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	response.setContentType("text/html"); 
	PrintWriter pw=response.getWriter();
	//read firstname
	String fname =request.getParameter("txtFirstName");
	//creating a cookie
	Cookie c1=new Cookie("fname",fname);
	//set max size
	c1.setMaxAge(30);
	//add cookie to response
	response.addCookie(c1);
	pw.write("<center><form action='serv2' method='post'>");
	pw.write("Enter LastName = <input type='text' name='txtLastname'> <br>");
	pw.write("<input type='submit' value='enter'>");
	pw.write("</center></form>");
	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
