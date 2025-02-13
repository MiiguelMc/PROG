import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class ConnectionPool {
    private ArrayList<Connection> con;
    private String url;
    private String usuario;
    private String contraseña;
    Connection conexion = null;
    Statement sentencias = null;
    ResultSet resultado = null;

    public ConnectionPool(String url, String usuario, String contraseña) {
        this.url = url;
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public ArrayList<Connection> getCon() {
        return con;
    }

    public void closeAll() {
        for (int i = 0; i < con.size(); i++) {
            while (con != null) {
                try {
                    conexion.close();
                    sentencias.close();
                    resultado.close();
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }

}
