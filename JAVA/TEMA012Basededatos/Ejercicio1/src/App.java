import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class App {

    public static void main(String[] args) throws Exception {
        String url = "jdbc:mariadb://localhost:3306/baloncesto";
        String usuario = "root";
        String contraseña = "";

        Connection conexion = null;
        Statement sentencias = null;
        ResultSet resultado = null;

        try {
            conexion = DriverManager.getConnection(url, usuario, contraseña);
            sentencias = conexion.createStatement();
            String query = "SELECT * FROM socio ";
            resultado = sentencias.executeQuery(query);

            while (resultado.next()) {
                int socioID = resultado.getInt("socioID");
                String nombre = resultado.getString("nombre");
                int estatura = resultado.getInt("estatura");
                int edad = resultado.getInt("edad");
                String localidad = resultado.getString("localidad");

                System.out.println("ID socio "+ socioID + " nombre del socio "+nombre +" Estatura " + estatura + " Edad "+edad+" Localida " +localidad);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            try {
                if (resultado!=null) resultado.close();
                if (sentencias!=null) sentencias.close();
                if (conexion!=null) conexion.close(); 
                    
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
