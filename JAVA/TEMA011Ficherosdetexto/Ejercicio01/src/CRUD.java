import java.util.ArrayList;

public interface CRUD<T> {
    public ArrayList<T> recuperarTodos();
    public ArrayList<Coche> recuperarCoche(String id);
public T añadir (T DATA);
    public T eliminar(String id);
public T modificar (T data);
}
