package com.app.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/controllerdemo")
public class ControllerDemo {
@RequestMapping("/")
public String showpage()
{
	return "helloworld-form";
}

@RequestMapping("/proccessform")
public String proccessformPage(HttpServletRequest request,Model theModel)
{
	String username = request.getParameter("txtUserName");
	username=username.toUpperCase();
	String result ="Hey"+username;
	theModel.addAttribute("messege", result);
	return "welcome-form";
	
	}
@RequestMapping("/proccessformtwo")
public String proccessformtwo(@RequestParam("txtUserName")
String username,Model theModel) {
	
	username=username.toUpperCase();
	String result = "Hello"+username;
	theModel.addAttribute("messege", result);
	return "welcome-form";
	
}
}
