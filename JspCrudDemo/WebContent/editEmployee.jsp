<%@page import="com.app.dao.EmployeeDao, com.app.bean.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit Employee</title>
</head>
<body>
<%
	int id = Integer.parseInt(request.getParameter("id"));
	Employee e = EmployeeDao.getEmployeeId(id);
%>
<h1>Edit Employee</h1>
<hr>
<form action="editEmp.jsp" method="post">
<input type="hidden" name="id" value="<%= e.getId() %>">
<table>
<tr>
<td>Name:</td>
<td><input type="text" name="name" value="<%= e.getName() %>"></td>
</tr>
<tr>
<td>Password:</td>
<td><input type="password" name="password" value="<%= e.getPassword() %>"></td>
</tr>
<tr>
<td>Email-Id:</td>
<td><input type="email" name="email" value="<%= e.getEmail() %>"></td>
</tr>
<tr>
<td>Gender:</td>
<td>
<% 
if(e.getGender().equals("male"))
{
%>
<input type="radio" name="gender" value="male" CHECKED>Male
<%
}
else
{
%>
<input type="radio" name="gender" value="male">Male
<%
}
%>

<% 
if(e.getGender().equals("female"))
{
%>
<input type="radio" name="gender" value="female" CHECKED>Female
<%
}
else
{
%>
<input type="radio" name="gender" value="female">Female
<%
}
%>
</td>
</tr>

<tr>
<td>Country:</td>
<td>
<select name="country" selected=${e.getCountry()}>
<%
if(e.getCountry().equals("India"))
{%>
<option selected="selected">India</option>
<%
}
else
{
%>
<option>India</option>
<%
}
%>

<%
if(e.getCountry().equals("USA"))
{%>
<option selected="selected">USA</option>
<%
}
else
{
%>
<option>USA</option>
<%
}
%>

<%
if(e.getCountry().equals("France"))
{%>
<option selected="selected">France</option>
<%
}
else
{
%>
<option>France</option>
<%
}
%>

<%
if(e.getCountry().equals("Germany"))
{%>
<option selected="selected">Germany</option>
<%
}
else
{
%>
<option>Germany</option>
<%
}
%>
<option>Other</option>
</select>
</td>
</tr>
<tr>
<td></td>
<td><input type="submit" value="Edit"></td>
</tr>

</table>
</form>
</body>
</html>