

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%><!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>${headerName}</h1>
	<div>
		<form:form method="post" action="/collagedatamvc/department"
			modelAttribute="dept">


			<table>

				<tr>
					<td>id</td>
					<td><form:input type="text" path="dId"></form:input> <form:errors
							path="dId" cssStyle="color:red;" /></td>
				</tr>

				<tr>
					<td>Name</td>
					<td><form:input type="text" path="dName"></form:input> 
					<form:errors
							path="dName" cssStyle="color:red;" /></td>
				</tr>

				<tr>
					<td>Head</td>
					<td><form:input type="text" path="dHead"></form:input> 
					<form:errors path="dHead" cssStyle="color:red;" /></td>
				</tr>

				<tr>
					<td><input type="submit" value="save"></input></td>
				</tr>
			</table>

		</form:form>
	</div>
</body>
</html>