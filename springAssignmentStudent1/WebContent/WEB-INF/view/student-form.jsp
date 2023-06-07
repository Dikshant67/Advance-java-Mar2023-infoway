<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Student</title>
</head>
<body>
<form:form action="saveStudent" modelAttribute="student" method="post"> 
<form:hidden path="prn"/>
<table>
<tbody>
<thead>
<tr>
<td><lable>name</lable></td>
<td><form:input path="name"/></td>
</tr>
<tr>
<td><label>m1</label></td>
<td><form:input path="m1"/></td>
</tr>
<tr>
<td><label>m2</label></td>
<td><form:input path="m2"/></td>
</tr>
<tr>
<td><label>m3</label></td>
<td><form:input path="m3"/></td>
</tr>
<tr>
<td><a href="${pageContext.request.contextPath }/student/list">Back to List</a>  </td>
<td><input type="submit" value="SAVE"></td>
</tr>




</tbody>


</table>

</form:form>
</body>
</html>