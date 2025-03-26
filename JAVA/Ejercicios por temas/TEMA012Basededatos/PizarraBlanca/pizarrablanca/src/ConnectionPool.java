import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class ConnectionPool {
    private ArrayList<Connection> con = new ArrayList<Connection>();
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

    public Connection getConnections() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(this.url,this.usuario,this.contraseña);
            if (conn!=null) {
                this.con.add(conn); 
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public void closeAll() {
        for (Connection conn : this.con) {
            try {
                if (conn!=null) {
                    conn.close();
                }
            } catch (Exception e) {
            System.out.println(e.getMessage());    
            }
        }
        this.con.clear();
    }

}
