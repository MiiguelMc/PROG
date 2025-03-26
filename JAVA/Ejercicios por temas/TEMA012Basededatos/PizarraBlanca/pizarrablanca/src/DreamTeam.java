import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DreamTeam {
    private static String URL = "jdbc:mariadb://localhost:3306/baloncesto";
    private static String USUARIO = "root";
    private static String CONTRASEÑA = "";
    private static ConnectionPool miconnec = new ConnectionPool(URL, USUARIO, CONTRASEÑA);
    private static GestorSocio migestor = new GestorSocio(miconnec.getConnections());

    public static void main(String[] args) throws SQLException {
        int num = 5;
        Socio miSocio = new Socio(95434, "Miguel Macias del Pino ", 199, 19, "Malaga");
        while (num == 5) {
            añadirSocio();
            bajaSocio();
            System.out.println("Numero 5 para seguir");
            num = Integer.parseInt(System.console().readLine());

        }

    }

    public static int leerOpcion() {

        return 2;
    }

    public static Socio añadirSocio(){
        System.out.println("Vamos a crear un usuarios");
        System.out.println("Indicame el id ");
        int id = Integer.parseInt(System.console().readLine());
        System.out.println("Indicame el nombre al completo");
        String nombre = System.console().readLine();
        System.out.println("Dime su altura");
        int altura = Integer.parseInt(System.console().readLine());
        System.out.println("Digame la edad");
        int edad = Integer.parseInt(System.console().readLine());
        System.out.println("Digame la localidad ");
        String localidad = System.console().readLine();
         Socio createSocio = new Socio(id, nombre, altura, edad, localidad);
        try {
           if (migestor.create(createSocio)) 
           System.out.println("Usuario creado con exito");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
                return null;
  

    }

    public static void bajaSocio() {
        System.out.println("Vamos a eliminar un usuarios");
        System.out.println("Indicame el id ");
        int id = Integer.parseInt(System.console().readLine());
        System.out.println("Indicame el nombre al completo");
        String nombre = System.console().readLine();
        System.out.println("Dime su altura");
        int altura = Integer.parseInt(System.console().readLine());
        System.out.println("Digame la edad");
        int edad = Integer.parseInt(System.console().readLine());
        System.out.println("Digame la localidad ");
        String localidad = System.console().readLine();
         Socio deleteSocio = new Socio(id, nombre, altura, edad, localidad);
        try {
           if (migestor.delete(deleteSocio)) 
           System.out.println("Usuario eliminado con exito");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void modificarSocio() {
        System.out.println("Vamos a eliminar un usuarios");
        System.out.println("Indicame el id ");
        int id = Integer.parseInt(System.console().readLine());
        System.out.println("Indicame el nombre al completo");
        String nombre = System.console().readLine();
        System.out.println("Dime su altura");
        int altura = Integer.parseInt(System.console().readLine());
        System.out.println("Digame la edad");
        int edad = Integer.parseInt(System.console().readLine());
        System.out.println("Digame la localidad ");
        String localidad = System.console().readLine();
         Socio updateSocio = new Socio(id, nombre, altura, edad, localidad);
        try {
           if (migestor.update(updateSocio)) 
           System.out.println("Usuario Actualizado con exito");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void listarTodos() {
        // Mostramos a todos los socio
    }

    public static void buscarSocio() {
        // Buscamos a un socio y to String
    }

}
