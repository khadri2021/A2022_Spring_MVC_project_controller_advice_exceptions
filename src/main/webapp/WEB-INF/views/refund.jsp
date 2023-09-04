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
	Refund Your Order
	<hr>
		<form:form action="return" modelAttribute="refund">
		Refund Order Item : <form:input path="name" />
			<br>
		Refund Order Amount : <form:input path="pay" />
			<br>
			<input type="submit" value="Refund Item">
		</form:form>
	</div>
</body>
</html>