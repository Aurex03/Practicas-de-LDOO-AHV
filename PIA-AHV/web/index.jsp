<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
      <meta charset="UTF-8">
     
      <title>LOGIN</title>
   </head>
   <body background="wallpaper.png">
  
       <h1>INICIAR SESIÓN</h1>
       <form action="PROCESO" method="POST">
                <tr>
                    
                        <h1>Usuario <input type="text" name="usuario"/></h1>
                   
             
                   
                        <h1>Contraseña <input type="password" name="contrasena"/> </h1>
                    
                        <h1> <input type="submit" name="ENTRAR" value="Entrar"/> </h1>
                       <br>
                       <h1>  <a href="registro.jsp">Registrarse</a> </h1>
                  
       </form>
   
   </body>
</html>