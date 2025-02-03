import java.util.ArrayList;
import java.util.HashMap;

public class App {
    public static void main(String[] args) throws Exception {
        HashMap<String, ArrayList<Integer>> ciudad = new HashMap<String, ArrayList<Integer>>();
        System.out.println(ciudad);
        funciones.Iniciarbase(ciudad);
        System.out.println(ciudad);
        funciones.añadirCp(ciudad);
        System.out.println(ciudad);
        funciones.borrarCp(ciudad);
        System.out.println(ciudad);
        funciones.listarElementos(ciudad);
    }
}
