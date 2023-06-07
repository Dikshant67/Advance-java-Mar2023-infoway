<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link type="text/css"
		rel="stylesheet"
		href="${pageContext.request.contextPath}/resources/css/style.css">

<title>Insert title here</title>
</head>
<body>
<div id="wrapper">
	<div id="header">
		 <h2>CRM-Customer relationship manager</h2>
	</div>
</div>
<div id="container">
<div id="content">


<!-- put new button :add customer -->
<input type="button" value="Add Customer"  onclick="window.location.href='ShowFormForAdd'; return false;" class="add-button" />
<!-- add our html table here -->

<table>
<tr>
<th>First Name</th>
<th>Last Name</th>
<th>Email</th>
<th>Action</th>
</tr>
<!-- loop over & point our customer -->
<c:forEach var="tempCustomer" items="${customers}">
<!-- construct an update link with customr id -->
<c:set var ="id" value="${tempCustomer.id }"></c:set>
<tr>
<td>${tempCustomer.firstName}</td>
<td>${tempCustomer.lastName}</td>
<td>${tempCustomer.email}</td>

<td> 
<form action="ShowFormForUpdate" method="post">
<input type="text" name="customerId" value="${tempCustomer.id }" hidden="hidden">
<input type="submit" value="Update">
</form>

<form action="DeleteCustomer" method="post">
<input type="text" name="customerId" value="${tempCustomer.id }" hidden="hidden">
<input type="submit" value="Delete">
</form>
</td>

</tr>
</c:forEach>
</table>

</div>
</div>
</body>
</html>