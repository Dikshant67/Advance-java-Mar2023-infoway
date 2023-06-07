<%@page import="com.app.dao.EmployeeDao, com.app.bean.Employee, java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Employees</title>
</head>
<body>
<h1>Employees</h1>
<hr>
<%
	List<Employee> list = EmployeeDao.getAllEmployees();
	request.setAttribute("list", list);
%>

<table border="1" width="100%">
<tr>
<th>ID</th><th>Name</th><th>Password</th><th>Email</th><th>Gender</th><th>Country</th><th>Edit</th><th>Delete</th>
</tr>
<c:forEach var="e" items="${list}">
<tr>
<td>${e.getId()}</td>
<td>${e.getName()}</td>
<td>${e.getPassword()}</td>
<td>${e.getEmail()}</td>
<td>${e.getGender()}</td>
<td>${e.getCountry()}</td>
<td><a href="editEmployee.jsp?id=${e.getId()}">Edit</a></td>
<td><a href="deleteEmployee.jsp?id=${e.getId()}">Delete</a></td>
</tr>
</c:forEach>
</table>
</body>
</html>