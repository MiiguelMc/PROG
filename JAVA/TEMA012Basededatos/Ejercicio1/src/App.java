import java.beans.Statement;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class App {
    public static void main(String[] args) throws Exception {
        String url = "jbdc:mariadb://localhost:3306/baloncesto";
        String usuario = "root";
        String contraseña = "";

        Connection conexion = null;
        Statement sentencias = null;
        ResultSet resultado = null;

        try {
            conexion = DriverManager.getConnection(url, usuario, contraseña);
            sentencias = conexion.createStatement();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
