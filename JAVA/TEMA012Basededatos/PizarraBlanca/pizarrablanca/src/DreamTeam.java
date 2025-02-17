import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DreamTeam {
    private static String URL = "jdbc:mariadb://localhost:3306/baloncesto";
    private static String USUARIO = "root";
    private static String CONTRASEÑA = "";
    public static void main(String[] args) throws SQLException {
        ConnectionPool miconnec = new ConnectionPool(URL, USUARIO, CONTRASEÑA);
        int num = 5;
        GestorSocio migestor = new GestorSocio(miconnec.getConnections());
        Socio miSocio = new Socio(95434, "Miguel Macias del Pino ", 199, 19, "Malaga");
        while (num == 5) {
            migestor.create(miSocio);
            num = Integer.parseInt(System.console().readLine());
            
        }

    }
    
    public static int leerOpcion(){

        return 2;
    }
    public static void añadirSocio(){
        //crea un socio y despues lo añadimos 
    }
    public static void bajaSocio(){
        //Eliminar Socio
    }
    public static void modificarSocio(){
        //basicamente setteamos todo lo del socio 
    }
    public static void listarTodos(){
        //Mostramos a todos los socio
    }
    public static void buscarSocio(){
        //Buscamos a un socio y to String 
    } 


    

    }
