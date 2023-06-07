<%@page import="com.app.dao.EmployeeDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="emp" class="com.app.bean.Employee"></jsp:useBean>
<jsp:setProperty property="*" name="emp"/>
<%
	int i = EmployeeDao.updateEmployee(emp);
	if(i>0)
		response.sendRedirect("viewEmployees.jsp");
	else
		response.sendRedirect("error.jsp");
%>
</body>
</html>