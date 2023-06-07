<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customers List</title>
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath }/resources/css/style.css/">
</head>
<body>
	<div id="wrapper">
		<div id="header">
			<h2>CRM Customer Relationship Management</h2>
		</div>
		<div id="container">
			<div id="content">

				<input type="button" value="Add Customer"
					onclick="window.location.href='showformforadd'; return=false;"
					class="add-button" />
				<!-- Adding HTML table here-->
				<form action="showformforUpdate" method="get">
					<table>

						<tr>
							<th>FirstName</th>
							<th>LastName</th>
							<th>Email</th>
							<th>Action</th>
						</tr>
						<!-- Loop over and print customer -->
						<c:forEach var="tempCustomer" items="${customer}">
							<c:url var="updateLink" value="/customer/showformforUpdate">
							<c:param name="customerId" value="${tempCustomer.id}" />

							</c:url>
							<c:set var="id" value="${tempCustomer.id}" />
							<tr>
								<td>${tempCustomer.firstName }</td>
								<td>${tempCustomer.lastName }</td>
								<td>${tempCustomer.email }</td>
								<td><a href="${updateLink}">Update</a></td>
								<td><input type="text" name="customerId"
									value=${tempCustomer.id } hidden="hidden" /> <input
									type="submit" value="update" /></td>
							</tr>
						</c:forEach>
					</table>
				</form>
				<!-- </form> -->

			</div>
		</div>
	</div>


</body>
</html>