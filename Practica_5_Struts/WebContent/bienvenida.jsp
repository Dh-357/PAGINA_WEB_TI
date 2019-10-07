<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="estilos.css" media="screen" />
<title>Insert title here</title>
</head>
<body>
<h1>BIENVENIDO(A):</h1>
<br>
<font size="30px" color=red><s:property value="usernombre"/></font>
<br>
<h1>Tu <font size="30px" color=red><s:property value="userlectura"/></font> es: </h1>
<br>
<img id="el_loco" src="recursos/el_loco.jpeg" width="300" height="400">
<img id="el_carro" src="recursos/el_carro.jpeg" width="300" height="400">
<img id="el_mago" src="recursos/el_mago.jpg" width="300" height="400">
<img id="el_sol" src="recursos/el_sol.jpeg" width="300" height="400">


</body>
</html>