import java.util.ArrayList;
import java.util.HashMap;

public class funciones {
    public static void Iniciarbase(HashMap<String, ArrayList<Integer>> lista) {
        lista.put("Malaga", new ArrayList<Integer>());
        lista.get("Malaga").add(12);
        lista.get("Malaga").add(13);
        lista.get("Malaga").add(15);
        lista.get("Malaga").add(22);
        lista.put("Sevilla", new ArrayList<Integer>());
        lista.get("Sevilla").add(13444);
        lista.get("Sevilla").add(144);
        lista.get("Sevilla").add(124);
        lista.get("Sevilla").add(13);

    }

    public static void añadirCp(HashMap<String, ArrayList<Integer>> lista) {
        System.out.println("dime el nombre de la provincia");
        String name = System.console().readLine();
        System.out.println("indicame el nuevo Codigo postal ");
        int cp = Integer.parseInt(System.console().readLine());
        lista.get(name).add(cp);
    }

    public static void borrarCp(HashMap<String, ArrayList<Integer>> lista) {
        System.out.println("dime el nombre de la provincia");
        String name = System.console().readLine();
        System.out.println("Indicame el codigo postal para borrar");
        int cp = Integer.parseInt(System.console().readLine());
        lista.get(name).remove(Integer.valueOf(cp));
    }

    public static void listarElementos(HashMap<String, ArrayList<Integer>> lista) {
        System.out.println("Indicame el nombre de la provincia");
        String name = System.console().readLine();
        if (lista.containsKey(name)) {
            System.out.println("La Provincia es " + name + " y los codigo postales son");
            for (int i = 0; i < lista.get(name).size(); i++) {

                System.out.println(lista.get(name).get(i));
            }

        } else {

        }

    }
}
