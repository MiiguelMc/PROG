<%@page import="pool.ConnectionPool"%>
<%@page import="socios.Socio"%>
<%@page import="socios.GestorSocios"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <!-- Bootstrap -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css" integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r" crossorigin="anonymous">
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>

        <title>DreamTeam - JSP - ORM</title>
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
            // TODO: Crear socio a través del gestor (try-catch) y comprobar resultado (si verdadero, mostrar mensaje de éxito)
            try {
                int socioID = Integer.valueOf(request.getParameter("socioID"));
                String nombre = request.getParameter("nombre");
                int estatura = Integer.valueOf(request.getParameter("estatura"));
                int edad = Integer.valueOf(request.getParameter("edad"));
                String localidad = request.getParameter("localidad") ;
                
                Socio misocio = new Socio(socioID,nombre,estatura,edad,localidad);
                if(gestor.create(misocio)){
                %><div><%out.print("Has creado a un socio ");%></div><%
            }
            } catch (Exception e) {
                %><div><%out.print("Has creado a un error ");%></div><%
            }
            // TODO: Cerrar las conexiones del pool  
 pool.closeAll();
        %>
        <br>
        <a href="index.jsp" class="btn btn-primary"><span class="glyphicon glyphicon-home"></span> Página principal</button>
        <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
        <script src="js/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
</body>
</html>