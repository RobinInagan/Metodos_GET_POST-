<%-- 
    Document   : Contacto_VTA
    Created on : 17/08/2021, 11:30:54 AM
    Author     : robin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Contacto</title>
    </head>
    <body>
        <form method="post" action="Contacto_CTO?accion=Crear"> 
            <legend>Formulario De Control</legend>
            <fieldset>
                <label>Nombre:</label>
                <input type="text" name="txt_nombre" required>
                <label>Correo:</label>
                <input type="email" name="txt_mail" required>
                <label>Asunto:</label>
                <input type="text" name="txt_asunto" required>            
                <label>Descripción:</label>
                <textarea type="text" name="txt_desc" required></textarea>
                <input type="submit" value="Enviar Comentario">
                <input type="reset" value="Limpiar">
            </fieldset>
        </form>
    </body>
</html>
