<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body style="background-color:black ">
<h1 style="color:red">LECTURA DE TAROT</h1>
<br>
<form action="registrar" style="color:red">
Nombre <input type="text" name="nombre">
<br>
Edad <input type="text" name="edad">
<br>
<input type="radio" name="lectura" value="precente">Consultar Precente
<br>
<input type="radio" name="lectura" value="pasado">Consultar Pasado
<br>
<input type="radio" name="lectura" value="futuro">Consultar Futuro
<br><br>
<input type="submit" value="Registrar">

</form>
<br>
<a style="color:red" href="muestra_tabla">Mostrar Base de Datos</a>
</body>
</html>