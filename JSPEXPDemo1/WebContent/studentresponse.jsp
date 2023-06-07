<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%=
request.getParameter("fname")
%>
Student Confirmed:
${param.fname }
${param.lname }

Student Programming Language :
<%
String lang[]=request.getParameterValues("language");
for(String temp:lang){
	out.print("<li>"+temp+"</li>");
}
%>

</body>
</html>