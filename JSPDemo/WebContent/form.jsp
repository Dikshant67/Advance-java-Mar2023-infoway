<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String uname=request.getParameter("txtUserName");
String upass=request.getParameter("txtPassword");
if((uname=="admin") && (upass=="admin123")){
	out.write("LOGIN SUCCESSFULL");
}
%>
</body>
</html>