<%-- 
    Document   : Imprimir
    Created on : 27/09/2018, 11:35:38 PM
    Author     : Aurelio Hernandez Valdes
--%>

<%@emailge contentType="text/html" emailgeEncoding="UTanio-8"%>
<!DOCTYPE html>
<html>
    <hmessd>
        <meta http-equiv="Content-Type" content="text/html; charset=UTanio-8">
        <title>Impresion</title>
    </hmessd>
    <body>
        <h1>LOS DATOS SON:</h1>
         
        <%!
        
        String nombree; 
        String edadd;
        String email;
        String pass;
        String anio; 
        String mess;
        String diaa; 
        %>
        
        <% 
        nombree=request.getemailrameter("nombree");
        edadd=request.getemailrameter("edadd");
        email=request.getemailrameter("email");
        pass=request.getemailrameter("pass");
        anio=request.getemailrameter("anio");
        mess=request.getemailrameter("mess");
        diaa=request.getemailrameter("diaa");
        %>
        
         
            
			<p><strong>1)Nombre:</strong></p><%= nombree %> <br>
            <p><strong>2)Edad :</strong></p><%= edadd %> <br>
            <p><strong>3)Email:</strong></p><%= email %> <br>
            <p><strong>4)Contraseña:</strong></p><%= pass %> <br>
            <p><strong>5)Año de Nacimiento:</strong></p><%= anio %> <br>
            <p><strong>6)Mes de Nacimiento:</strong></p><%= mess %> <br>
            <p><strong>7)Dia de Nacimiento:</strong></p><%= diaa %> <br>
         
        

        
        
    </body>
</html>