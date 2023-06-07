<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" session="false" import="com.app.*,java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@include file="header.html" %>
<h2>Factorial of 5 is  <%=Test.factorial(5) %></h2>

User-Agent = <%=request.getHeader("User-Agent")%>
<br>
Locale = <%=request.getLocale() %>
<%@include file="footer.jsp" %>
</body>
</html>