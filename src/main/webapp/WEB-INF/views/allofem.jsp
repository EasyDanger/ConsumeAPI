<%@ page
	language="java"
	contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
%>
<%@ taglib
	uri="http://java.sun.com/jsp/jstl/core"
	prefix="c"
%>
<!DOCTYPE html>
<html>
<head>
<link
	rel="stylesheet"
	href="http://localhost:8080/styles.css"
>
<meta charset="UTF-8">
<title>Second Page</title>
</head>
<body>
	<%@include file="partials/header.jsp"%>
	<h3>This is a second page.</h3>
	<h2>And here are even more Computer Science Heroes:</h2>
	<table>
		<thead>
			<tr>
				<th>Hero <br>First Name</th>
				<th>Hero <br>Last Name</th>
				<th>Innovation</th>
				<th>Year of Innovation</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach
				var="Hero"
				items="${Heroes}"
			>
				<div>
					<tr>
						<td>${Hero.firstName}</td>
						<td>${Hero.lastName}</td>
						<td>${Hero.innovation}</td>
						<td>${Hero.year}</td>
					</tr>
				</div>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>