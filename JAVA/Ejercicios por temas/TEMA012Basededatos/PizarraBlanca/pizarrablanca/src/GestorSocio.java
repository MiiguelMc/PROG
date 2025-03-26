import java.lang.reflect.Array;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GestorSocio implements CRUD {
    private Connection conn;

    public GestorSocio(Connection conn) {
        this.conn = conn;
    }

    public ArrayList<Socio> query(String column, String value) throws SQLException {
        List<String> validColumns = Arrays.asList("nombre", "localidad");
        if (!validColumns.contains(column))
            throw new SQLException("Columna no válida");

        ArrayList<Socio> result = new ArrayList<Socio>();
        String sqlQuery = "SELECT * FROM socio WHERE " + column + " = ?";

        try (PreparedStatement stmt = this.conn.prepareStatement(sqlQuery)) {
            stmt.setString(1, value);

            // Ejecución de la consulta
            ResultSet querySet = stmt.executeQuery();
            // Recorrido del resultado de la consulta
            while (querySet.next()) {
                int socioID = querySet.getInt("socioID");
                String nombre = querySet.getString("nombre");
                int estatura = querySet.getInt("estatura");
                int edad = querySet.getInt("edad");
                String localidad = querySet.getString("localidad");
                result.add(new Socio(socioID, nombre, estatura, edad, localidad));
            }
            return result;
        } catch (SQLException e) {
            throw e;
        }
    }

    @Override
    public ArrayList<Socio> query(String col, int val) throws SQLException {
        List<String> validColumns = Arrays.asList("socioID", "edad", "estatura");
        if (!validColumns.contains(col))
            throw new SQLException("Columna no válida");

        ArrayList<Socio> result = new ArrayList<Socio>();
        String sqlQuery = "SELECT * FROM socio WHERE " + col + " = ?";

        try (PreparedStatement stmt = this.conn.prepareStatement(sqlQuery)) {
            stmt.setInt(1, val);

            ResultSet querySet = stmt.executeQuery();

            while (querySet.next()) {
                int socioID = querySet.getInt("socioID");
                String nombre = querySet.getString("nombre");
                int estatura = querySet.getInt("estatura");
                int edad = querySet.getInt("edad");
                String localidad = querySet.getString("localidad");
                result.add(new Socio(socioID, nombre, estatura, edad, localidad));
            }
            return result;
        } catch (SQLException e) {
            throw e;
        }
    }

    @Override
    public ArrayList<Socio> requestAll(String sortedBy) throws SQLException {
        ArrayList<Socio> result = new ArrayList<>();
        String sqlRequestAll = "SELECT * FROM socio ORDER BY" + sortedBy;
        try (Statement stmt = this.conn.createStatement()) {
            ResultSet querySet = stmt.executeQuery(sqlRequestAll);
            while (querySet.next()) {
                int socioID = querySet.getInt("socioID");
                String nombre = querySet.getString("nombre");
                int estatura = querySet.getInt("estatura");
                int edad = querySet.getInt("edad");
                String localidad = querySet.getString("localidad");
                result.add(new Socio(socioID, nombre, estatura, edad, localidad));
            }
            return result;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public Object requestById(int id) throws SQLException {
        Socio result = null;
        String sqlRequestId = "SELECT * FROM socio WHERE socioID = ?";
        try (PreparedStatement stmt = this.conn.prepareStatement(sqlRequestId)) {
            stmt.setInt(1, id);
            ResultSet querySet = stmt.executeQuery(sqlRequestId);
            while (querySet.next()) {
                int socioID = querySet.getInt("socioID");
                String nombre = querySet.getString("nombre");
                int estatura = querySet.getInt("estatura");
                int edad = querySet.getInt("edad");
                String localidad = querySet.getString("localidad");
                result = new Socio(socioID, nombre,estatura, edad, localidad);
            }
            return result;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public boolean create(Socio socio) throws SQLException {
        int socioID = socio.getIDSocio();
        String nombre = socio.getNombre();
        int estatura = socio.getEstatura();
        int edad = socio.getEdad();
        String localidad = socio.getLocalidad();

        String sqlCreate = "INSERT INTO socio VALUES (?,?,?,?,?)";
        try (PreparedStatement stmt = this.conn.prepareStatement(sqlCreate)) {
            stmt.setInt(1, socioID);
            stmt.setString(2, nombre);
            stmt.setInt(3, estatura);
            stmt.setInt(4, edad);
            stmt.setString(5, localidad);
            int affect = stmt.executeUpdate();
            if (affect == 0) {
                throw new SQLException();
            }
            return affect == 1;
        } catch (Exception e) {
            throw e;
        }

    }

    @Override
    public boolean update(Socio socio) throws SQLException {
        int socioID = socio.getIDSocio();
        String nombre = socio.getNombre();
        int estatura = socio.getEstatura();
        int edad = socio.getEdad();
        String localidad = socio.getLocalidad();

        String sqlUpdate = "UPDATE socio SET nombre = ? , estatura = ? , edad = ? , localidad = ?  WHERE socioID = ?";
        try (PreparedStatement stmt = this.conn.prepareStatement(sqlUpdate)) {
            stmt.setString(1, nombre);
            stmt.setInt(2, estatura);
            stmt.setInt(3, edad);
            stmt.setString(4, localidad);
            stmt.setInt(6, socioID);
            int affect = stmt.executeUpdate();
            if (affect == 0) {
                throw new SQLException();
            }
            return affect == 1;
        } catch (Exception e) {
            throw e;
        }

    }

    @Override
    public boolean delete(Socio socio) throws SQLException {
        int socioID = socio.getIDSocio();
        String sqlDelete = "DELETE FROM socio WHERE socioID = ?";
        try (PreparedStatement stmt = this.conn.prepareStatement(sqlDelete)) {
            stmt.setInt(1, socioID);
            int affect = stmt.executeUpdate();
            if (affect == 0) {
                throw new SQLException();
            }
            return affect == 1;
        } catch (Exception e) {
            throw e;
        }

    }

}
