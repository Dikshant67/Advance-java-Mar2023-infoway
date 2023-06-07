<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%! int sum=1; %>
<%
int num= Integer.parseInt(request.getParameter("fact"));

%>
<%
for(int i=1;i<=num;i++){
	sum=sum*i;
}
%>
<%=
  (sum)
%>

</body>
</html>