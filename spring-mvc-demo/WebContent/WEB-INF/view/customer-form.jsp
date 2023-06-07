<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link type="text/css"
	  rel="stylesheet"
	  href="${pageContext.request.contextPath}/resources/css/add-customer-style.css">
<link type="text/css"
		rel="stylesheet"
		href="${pageContext.request.contextPath}/resources/css/style.css">
</head>
<body>
<div id="wrapper">
	<div id="header">
		 <h2>CRM-Customer relationship manager</h2>
	</div>
</div>
<div id="container">
<h3>Save Customer</h3>
<form:form action="saveCustomer" modelAttribute="customer" method="post">
<form:hidden path="id" />
<table>
<tbody>
<tr>
<td><label>FirstName:</label></td>
<td> <form:input path="firstName"/></td>
</tr>
<tr>
<td><label>Lastname:</label></td>
<td> <form:input path="lastName"/></td>
</tr>
<td><label>Email:</label></td>
<td> <form:input path="email"/></td>
</tr>
<tr>
<td><input type="submit" value="Save" class="save" /></td>
</tr>
</tbody>
</table>
</form:form>
<div style="clear;both"></div>
<p>
<a href="${pageContext.request.contextPath }/customer/list">Back to List</a>
</p>
</div>
</body>
</html>