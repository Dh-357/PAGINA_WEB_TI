<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <link rel="stylesheet" type="text/css" href="estilos.css" media="screen" />

</head>
<body style="background-color: black">
    <h1 id="bienvenido">BIENVENIDO</h1>
    <h2>Elige la opcion que deseas consultar</h2>
    <img id="el_sol" src="recursos/el_sol.jpeg" width="270px" height="400px">
    <form action="leer" id="formulario_2">
    <input type="radio" name="menu_leer" value="pasado">PASADO<br><br>
    <input type="radio" name="menu_leer" value="presente">PRESENTE<br><br>
    <input type="radio" name="menu_leer" value="futuro">FUTURO<br><br>
    <input type="submit" value="LEER" style="font-size: 20px" id="boton_menu">
    
    </form>
</body>
</html>