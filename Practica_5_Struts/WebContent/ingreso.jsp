<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="estilos.css" media="screen" />
<title>Pagina ingreso</title>
</head>
<body>
<h1>LEECTURA DEL TAROT</h1>
<img id="el_loco" src="recursos/el_loco.jpeg" width="250" height="350">
<s:form id="formulario" action="Validar">
	Ingresa tu nombre,<br>
	Tu pasword=(123),<br>
	Y el tiempo de consulta (presente, pasado o futuro)<br>
	<s:textfield name="userlogin" label="Ingrese usuario (Su nombre)" />
	<s:password name="userpwd" label="Ingrese password (123)" />
	<br>
	<s:textfield name="userlectura" label="Ingrese el tiempo de consulta" />
	<s:submit label="ingresar" />
	

</s:form>
</body>
</html>