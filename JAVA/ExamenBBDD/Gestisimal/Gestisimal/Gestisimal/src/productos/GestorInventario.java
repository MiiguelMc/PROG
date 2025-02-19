package productos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.ArrayList;

import crud.CRUD;

public class GestorInventario implements CRUD<Producto> {
    Connection conn;

    public GestorInventario(Connection conn) {
        this.conn = conn;
    }

    @Override
    public ArrayList<Producto> requestAll(String sortedBy) throws SQLException {
        ArrayList<Producto> productos = new ArrayList<>();
        String sqlQuery = "SELECT * FROM productos ORDER BY " + sortedBy;
        try (Statement stmt = this.conn.createStatement();
                ResultSet rsall = stmt.executeQuery(sqlQuery)) {
            while (rsall.next()) {
                Producto producto = new Producto(
                        rsall.getInt("codigo"),
                        rsall.getString("descripcion"),
                        rsall.getDouble("preciocompra"),
                        rsall.getDouble("precioventa"),
                        rsall.getInt("stock"));
                productos.add(producto);
            }
            return productos;
        } catch (SQLException e) {
            throw e;
        }
    }
    /**
     * Lo que hace esta funcion es con el codigo  que nosotros le damos nos devuelve un Producto  
     */
    @Override
    public Producto requestById(long códigoProducto) throws SQLException {
        Producto producto = null;
        String sqlQuery = "SELECT * FROM productos WHERE codigo = ?";
        try (PreparedStatement stmt = this.conn.prepareStatement(sqlQuery)) {
            stmt.setLong(1, códigoProducto);
            try (ResultSet reqid = stmt.executeQuery()) {
                if (reqid.next()) {
                    producto = new Producto(
                            reqid.getInt("codigo"),
                            reqid.getString("descripcion"),
                            reqid.getDouble("preciocompra"),
                            reqid.getDouble("precioventa"),
                            reqid.getInt("stock"));
                }
            }
            return producto;
        } catch (SQLException e) {
            throw e;
        }
    }
    /**
     * Aqui creamos un producto y como le damos un producto atraves de los getters le damos el valor 
     */
    @Override
    public boolean create(Producto producto) throws SQLException {
        String sqlQuery = "INSERT INTO productos (codigo ,descripcion,preciocompra, precioventa,stock) VALUES (?, ?, ?, ?, ?)";

        try (PreparedStatement stmt = this.conn.prepareStatement(sqlQuery)) {
            stmt.setLong(1, producto.getCodigo());
            stmt.setString(2, producto.getDescripcion());
            stmt.setDouble(3, producto.getPreciocompra());
            stmt.setDouble(4, producto.getPrecioventa());
            stmt.setInt(5, producto.getStock());

            int affectedRows = stmt.executeUpdate();
            if (affectedRows == 0)
                throw new SQLException("Falló la creación del nuevo producto.");
            return affectedRows == 1;
        } catch (SQLException e) {
            throw e;
        }
    }
    /**
     * Parecido al de crear solo que el "Comando SQL" es un update pero igual que el create se le da un objeto entoces atraves de los setters sacamos la informacion y se la proporcionamos donde lo necesite 
     */
    @Override
    public boolean update(Producto producto) throws SQLException {
        String sqlQuery = "UPDATE productos SET descripcion = ?, preciocompra = ?, precioventa = ? ,stock = ? WHERE codigo = ?";

        try (PreparedStatement stmt = this.conn.prepareStatement(sqlQuery)) {
            stmt.setString(1, producto.getDescripcion());
            stmt.setDouble(2, producto.getPreciocompra());
            stmt.setDouble(3, producto.getPrecioventa());
            stmt.setInt(4, producto.getStock());
            stmt.setLong(5, producto.getCodigo());
            int affectedRows = stmt.executeUpdate();
            if (affectedRows == 0)
                throw new SQLException("Falló la actualización de los datos del producto.");
            return affectedRows == 1;
        } catch (SQLException e) {
            throw e;
        }
    }
    /**
     * Aqui atraves del codigo eliminamos el producto 
     */
    @Override
    public boolean delete(long códigoProducto) throws SQLException {
        String sqlQuery = "DELETE FROM productos WHERE codigo = ?";

        try (PreparedStatement stmt = this.conn.prepareStatement(sqlQuery)) {
            stmt.setLong(1, códigoProducto);

            int affectedRows = stmt.executeUpdate();
            if (affectedRows == 0)
                throw new SQLException("Falló el borrado de los datos del producto.");
            return affectedRows == 1;
        } catch (SQLException e) {
            throw e;
        }
    }

}