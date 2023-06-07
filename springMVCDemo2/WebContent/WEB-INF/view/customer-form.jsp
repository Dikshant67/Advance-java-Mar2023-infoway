<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Save Customer</title>
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resourses/css/style.css" />
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resourses/css/add-customer-style.css" />

</head>
<body>
	<div id="wrapper">
		<div id="header">
			<hr>
			<h2>CRM Customer Relationship Management</h2>
		</div>
	</div>
	<div id="container">
		<h3>Save Customer</h3>
		<form:form action="saveCustomer" ModelAttribute="customer" method="post">
			<form:hidden path="id"/>
			<table>
				<tbody>
					<tr>
						<td><label>firstname</label></td>
						<td><form:input path="firstName" /></td>
						<td><label>lastname</label></td>
						<td><form:input path="lastName" /></td>
						<td><label>email</label></td>
						<td><form:input path="email" /></td>

					</tr>
					<tr>
						<td><label></label></td>
						<td><input type="submit" value="save" class="save"></td>
					</tr>

				</tbody>
			</table>
		</form:form>
		<div style="clear;both;"></div>
		<p>
			<a href="${pageContextrequest.contextpath}/customer/list">Back to list</a>
		</p>



	</div>

</body>
</html>