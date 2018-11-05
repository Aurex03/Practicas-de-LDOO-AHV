<%@page import="MODELO.USUARIO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
        HttpSession sesion = request.getSession();
        String usuario,contrasena;
        usuario = sesion.getAttribute("username").toString();
        contrasena = sesion.getAttribute("password").toString();
        USUARIO U = new USUARIO(usuario,contrasena);
%> 
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <LINK rel=StyleSheet href="css_BIENVENIDO.css" type="text/css">
        <title>BIENVENIDO</title>
        <script>
            
        </script>
    </head>
    <body background="aceptado.png">
    
        <h1>Bienvenido</h1>
        <h2>Tu Nombre es: <b> <%=U.getUsuario()%>! </b> </h2>
        <h2>Tu Contraseña es:<b> <%= U.getContrasena()%> </b> </h2>
        <form action="cerrarSesion.jsp">
            <input type="submit" name="CERRAR SESIÓN" value="CERRAR LA SESION"/>
        </form>
        <br>
        <h1> <a href="bent/index.html"  target="_blank" >Visitar Pagina 1</a> </h1>
        <h1> <a href="Pagina2.html"  target="_blank" >Visitar Pagina 2</a> </h1>
        <h1> <a href="Pagina3.html"  target="_blank" >Visitar Pagina 3</a> </h1>
        <a href="COOKIE">
            <input type="submit" value="Cookies" name="Tus Galletudas"/>
        </a>
        <br>
    </body>
</html>
