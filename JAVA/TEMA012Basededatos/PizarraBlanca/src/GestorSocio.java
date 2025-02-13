import java.sql.Connection;
import java.util.ArrayList;

public class GestorSocio implements CRUD {
private Connection conn;

public GestorSocio(Connection conn) {
    this.conn = conn;
}

@Override
public ArrayList query(String col, String val) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'query'");
}

@Override
public ArrayList query(String col, int val) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'query'");
}

@Override
public ArrayList requestAll(String sortedBy) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'requestAll'");
}

@Override
public Object requestById(int id) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'requestById'");
}

@Override
public boolean create(Object model) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'create'");
}

@Override
public boolean update(Object model) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'update'");
}

@Override
public boolean delete(Object model) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'delete'");
}

}
