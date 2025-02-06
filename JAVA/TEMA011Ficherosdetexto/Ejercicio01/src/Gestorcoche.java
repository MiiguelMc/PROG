import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class Gestorcoche implements CRUD<Coche> {
    private ArrayList<Coche> misCoches = new ArrayList<>();
    private File file;
public Gestorcoche (File file){
this.file= file;
}
@Override
public ArrayList<Coche> recuperarCoche(String id) {
    try {
        BufferedReader br = new BufferedReader(new FileReader(file));
        String linea = ";";
        while ((linea = br.readLine()) != null) {
            Coche coche = new Coche(linea);
            misCoches.add(coche);
        }
        br.close();
        return misCoches;
    } catch (Exception ioe) {
        System.out.println(ioe.getLocalizedMessage());
    }
    return null;
}
@Override
public Coche añadir(Coche DATA) {
    
    
}
@Override
public Coche eliminar(String id) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'eliminar'");
}
@Override
public Coche modificar(Coche data) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'modificar'");
}
@Override
public ArrayList<Coche> recuperarTodos() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'recuperarTodos'");
}
}
