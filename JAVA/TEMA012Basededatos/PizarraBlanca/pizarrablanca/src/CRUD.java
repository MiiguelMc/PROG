import java.sql.SQLException;
import java.util.ArrayList;

public interface CRUD<T> {
    public ArrayList<T> query (String col , String val) throws SQLException;
    public ArrayList<T> query(String col , int val) throws SQLException;
    public ArrayList<T> requestAll(String sortedBy) throws SQLException;
    public T requestById (int id ) throws SQLException;
    public boolean create (Socio socio) throws SQLException;
    public boolean update (Socio socio) throws Exception;
    public boolean delete (Socio socio) throws SQLException;
}
