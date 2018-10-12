<%-- 
    Document   : DatosCorrectos
    Created on : 28/09/2018, 10:34:39 PM
    Author     : Aurelio Hernandez Valdes
--%>
<%@page import="modelo.Usuario"%>
<%

    Usuario x1 = (Usuario)request.getSession().getAttribute("persona1"); 



%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Datos recibidos</title>
    </head>
    <body background="https://img00.deviantart.net/c251/i/2016/152/c/4/itachi_uchiha__naruto__minimalist_wallpaper_by_slezzy7-da4kc3c.png">
        <h1>Datos Correctos</h1>
        <p><b>Nombre:</b> <%= x1.getNombre()%> </p>
        <p><b>Apellidos:</b> <%= x1.getApellidos()%></p>
        <p><b>Edad:</b> <%= x1.getEdad()%></p>
        <p><b>Correo:</b> <%= x1.getCorreo()%></p>
        <p><b>Contraseña:</b> <%= x1.getContrasenia()%></p>
        <p><b>Año:</b> <%= x1.getAnio()%></p>
        <p><b>Mes:</b> <%= x1.getMes()%></p>
        <p><b>Dia:</b> <%= x1.getDia()%></p>
    </body>
</html>
