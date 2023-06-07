<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<!-- <link type="text/css" -->
<!-- 		rel="stylesheet" -->
<%-- 		href="${pageContext.request.contextPath}/resources/css/style.css"> --%>

<title>Insert title here</title>
</head>
<body>
<div id="wrapper">
	<div id="header">
	</div>
</div>
<div id="container">
<div id="content">


<!-- put new button :add customer -->
 <input type="button" value="Add Customer"  onclick="window.location.href='ShowFormForAdd'; return false;" class="add-button" /> 
<!-- add our html table here -->

<table>
<tr>
<th>prn</th>
<th>name</th>
<th>m1</th>
<th>m2</th>
<th>m3</th>
<th>total</th>
</tr>
<!-- loop over & point our customer -->
<c:forEach var="tempStudent" items="${student}">
<!-- construct an update link with customr id -->
<c:set var ="prn" value="${tempStudent.prn }"></c:set>
<tr>
<td>${tempStudent.prn}</td>
<td>${tempStudent.name}</td>
<td>${tempStudent.m1}</td>
<td>${tempStudent.m2}</td>
<td>${tempStudent.m3}</td>
<td>${tempStudent.m3+tempStudent.m2+tempStudent.m1}</td>

 <form action="showformforupdate" method="post"> 
<input type="text" name="prn" value="${tempStudent.prn }" hidden="hidden">
<input type="submit" value="Update"> 
</form> 

<!-- <form action="DeleteCustomer" method="post"> -->
<%-- <input type="text" name="customerId" value="${tempCustomer.id }" hidden="hidden"> --%>
<!-- <input type="submit" value="Delete"> -->
<!-- </form> -->
<!-- </td> -->

</tr>
</c:forEach>

</table>

</div>
</div>
</body>
</html>