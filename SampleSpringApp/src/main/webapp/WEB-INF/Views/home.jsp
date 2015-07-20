<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>

<html lang="en">
	<head>
		<meta charset="UTF-8" />
		<title>SamplSpringApp</title>
	</head>
	
	<body>
		<table border="1">
			<tr>
				<td><b>Customer ID</b></td>
				<td><b>Contact Name</b></td>
				<td><b>Company name</b></td>
			</tr>
			
			<c:forEach items="${homePageModel}" var="customerDTO">
				<tr>
					<td>${customerDTO.customerId}</td>
					<td>${customerDTO.contactName}</td>
					<td>${customerDTO.companyName}</td>
				</tr>
			</c:forEach>
		</table>
	</body>
</html>