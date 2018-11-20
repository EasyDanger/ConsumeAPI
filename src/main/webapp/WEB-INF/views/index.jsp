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
<title>Home Page</title>
</head>
<body>
	<%@include file="partials/header.jsp"%>
	<h3>This is an index page.</h3>
	<h2>These are some Computer Science Heroes:</h2>
	<table>
		<thead>
			<tr>
				<th>Hero</th>
				<th>Invention</th>
				<th>Year of Invention</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach
				var="TinyHero"
				items="${Tinies}"
			>
				<div>
					<tr>
						<td>${TinyHero.name}</td>
						<td>${TinyHero.invented}</td>
						<td>${TinyHero.year}</td>
					</tr>
				</div>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>