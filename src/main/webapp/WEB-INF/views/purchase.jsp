<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Purchase Order</title>
</head>
<body>
	
	<div align="center">
	Place Your Order
	<hr>
		<form:form action="sale" modelAttribute="purchase">
		Order Item : <form:input path="name" />
			<br>
		Order Amount : <form:input path="pay" />
			<br>
			<input type="submit" value="Purchase Item">
		</form:form>
	</div>
</body>
</html>