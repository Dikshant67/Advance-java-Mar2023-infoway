<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="error.jsp" import="com.app.dao.UserDAO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="u" class="com.app.bean.User"></jsp:useBean>
<jsp:setProperty property="*" name="u"/>
<%
    int i = UserDAO.saveUser(u);
      if(i>0)
    {
    	  
	response.sendRedirect("success.jsp");
	
	
    }

%>

</body>
</html>