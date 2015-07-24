<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>

<html lang="en">
<head>
<meta charset="UTF-8" />
<title>SamplSpringApp</title>
<link href="/SampleSpringApp/CSS/bootstrap/bootstrap.css" rel="stylesheet" type="text/css"/>
<link href="/SampleSpringApp/CSS/chartist/chartist.min.css" rel="stylesheet" type="text/css"/>
<script type="text/javascript" src="/SampleSpringApp/JS/bootstrap/bootstrap.js"></script>
<script type="text/javascript" src="/SampleSpringApp/JS/chartist/chartist.js"></script>
<script type="text/javascript" src="/SampleSpringApp/JS/jquery/jquery-2.1.4.js"></script>
</head>

<body>
<div>
<div class="btn-group" role="group" aria-label="...">
  <button type="button" class="btn btn-default">Left</button>
  <button type="button" class="btn btn-default">Middle</button>
  <button type="button" class="btn btn-default">Right</button>
</div>
</div>
	<!-- 
	<div>
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
	</div>
	 -->
</body>
</html>