<%@page import="pool.ConnectionPool"%>
<%@page import="socios.Socio"%>
<%@page import="socios.GestorSocios"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <%
            String url = "jdbc:mariadb://localhost:3306/baloncesto";
            String usuario = "root";
            String contrasena = "";
            // TODO: Instanciar ConnectionPool y GestorSocios
            ConnectionPool pool = new ConnectionPool(url, usuario, contrasena);
            GestorSocios gestor = new GestorSocios(pool.getConnection());
            // TODO: Establecer la codificación de caracteres de la petición a UTF-8
            request.setCharacterEncoding("UTF-8");
            // TODO: Realizar borrado a través del gestor (try-catch) y comprobar resultado (si verdadero, mostrar mensaje de éxito)
            try {
                int socioID = Integer.valueOf(request.getParameter("socioID"));
                gestor.delete(socioID);
            } catch (Exception e) {
        %><div><%out.print("Has eliminado a un error ");%></div><%

            }
            // TODO: Cerrar las conexiones del pool                  
            pool.closeAll();
        %>
        <script>document.location = "index.jsp"</script> 
    </body>
</html>
