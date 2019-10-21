<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<meta charset="UTF-8">
<link href="<c:url value='/static/css/bootstrap.css' />" rel="stylesheet"></link>
<link href="<c:url value='/static/css/custom.css' />" rel="stylesheet"></link>
<title>Insert title here</title>
</head>

<body style="background-color:black">
<h1 style="color:red">BASE DE DATOS</h1>
	<a style="color:red" href="inicio">Ir a Inicio</a>
	<div class="container mt-4">
		<div class="card border-info">
			<div class="card-body">
				<table>
					<thead>
						<tr>
							<th>NOMBRE  </th>
							<th>EDAD  </th>
							<th>LECTURA</th>
							
						</tr>
					</thead>
					<tbody>
						<c:forEach var="variable" items="${lista}">
						<tr>
							<td>${variable.Nombre}</td>
							<td>${variable.Edad}</td>
							<td>${variable.Lectura}</td>
							<td>
								<a href="delete?id=${variable.Id}">Borrar</a>
							</td>
						</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</div>
</body>
</html>