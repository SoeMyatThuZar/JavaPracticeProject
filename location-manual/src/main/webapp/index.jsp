<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Web Greeting</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>

</head>
<body>

	<div class="container pt-4">

		<h1>SOE MYAT THU ZAR</h1>
		<h3>Manual Connection</h3>

		<c:choose>

			<c:when test="${empty list }">
				<a href="#" class="btn btn-primary">Load Data</a>


			</c:when>


		</c:choose>






	</div>

</body>
</html>