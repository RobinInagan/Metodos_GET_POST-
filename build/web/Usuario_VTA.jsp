<%-- 
    Document   : Usuario_VTA
    Created on : 19/08/2021, 09:18:25 AM
    Author     : robin
--%>

<%@page import="modelo.dto.UsuariosDTO"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Usuario</title>
    </head>
    <body>
        <h1>Lista de Usuarios</h1>
        <table>
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Nombre</th>
                    <th>Email</th>
                    <th>Contraseña</th>
                    <th>Rol</th>
                </tr>
            </thead>
            <tbody>
                <% Object Lista = request.getAttribute("lista");
                    List<Object> listobj = (List) Lista;
                    for(Object i: listobj){
                        UsuariosDTO usu = (UsuariosDTO) i;   
                %>
                <tr> 
                    <td> <%=usu.getId_usuario() %> </td>
                    <td> <%=usu.getNombre()%> </td>
                    <td> <%=usu.getCorreo()%> </td>
                    <td> <%=usu.getClave()%> </td>
                    <td> <%=usu.getRol()%> </td>
                </tr>
                
                <% }%>
            </tbody>         
        </table>
    </body>
</html>
