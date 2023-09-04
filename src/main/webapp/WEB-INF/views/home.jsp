<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>

	<div align="center">
		Order Your Items
		<hr>
		<form:form>
			<a href="purchase"> Purchase Item</a> <br>
			<a href="refund"> Refund Item</a>
		</form:form>
	</div>

</body>
</html>