import java.util.ArrayList;
import java.util.HashMap;
//Aqui importamos el Arraylist y el hashMap para luego utilizarlos
    /**
     * @author Miguel Macias del Pino
     * 
     */
public class ServiciosHotel {
    // Inicializamos nuestra hashMap
    HashMap<String, ArrayList<String>> mihashmap = new HashMap<>();

    /**
     * 
     * Estos para poder realizar pruebas sin tener que añadir datos cada vez que se
     * inicializar son los de ejemplo de la primera tabla
     * 
     **/

    public void tablainicial(HashMap<String, ArrayList<String>> HotelServicios) {
        mihashmap.put("Cazorla", new ArrayList<String>());
        mihashmap.get("Cazorla").add("Restaurante");
        mihashmap.get("Cazorla").add("Piscina");
        mihashmap.get("Cazorla").add("Actividades");
        mihashmap.get("Cazorla").add("Lavandería");
        mihashmap.put("Aroche", new ArrayList<String>());
        mihashmap.get("Aroche").add("Desayuno");
        mihashmap.get("Aroche").add("Cafeteria");
        mihashmap.get("Aroche").add("Tienda");
        mihashmap.get("Aroche").add("Internet");
        mihashmap.get("Aroche").add("Cuna");
        mihashmap.put("Barbate", new ArrayList<String>());
        mihashmap.get("Barbate").add("Aparcamiento");
        mihashmap.get("Barbate").add("Televisión");
        mihashmap.get("Barbate").add("Tienda");
        mihashmap.get("Barbate").add("Gimnasio");

    }

    /**
     * 
     * Usado para ver todos los servicios del Hotel
     * 
     **/

    public void consultartabla(HashMap<String, ArrayList<String>> HotelServicios) {
        System.out.println("Indiqueme el nombre del hotel porfavor");
        String nombreHotel = System.console().readLine();
        if (!mihashmap.containsKey(nombreHotel)) {
            System.out.println("No tenemos ese hotel");
        } else {
            System.out.print(nombreHotel + " tienes estos servicios: ");
            for (int i = 0; i < mihashmap.get(nombreHotel).size(); i++) {
                System.out.print(mihashmap.get(nombreHotel).get(i) + ",");
            }

        }
    }

    /**
     * 
     * Crea un servicio asociado a un hotel
     * 
     **/

    public void crearServicio(HashMap<String, ArrayList<String>> HotelServicios) {
        System.out.println("Indiqueme el nombre del hotel");
        String nombrehotel = System.console().readLine();
        System.out.println("Indiqueme porfavor el servicio ha añadir");
        String nombreservicio = System.console().readLine();
        if (!mihashmap.containsKey(nombrehotel)) {
            mihashmap.put(nombrehotel, new ArrayList<String>());
            mihashmap.get(nombrehotel).add(nombreservicio);
        } else if (mihashmap.get(nombrehotel).contains(nombreservicio)) {
            System.out.println("Actividad ya registrada");
        } else {
            System.out.println("Hotel ya registrado registramos nuevo servicio");
            mihashmap.get(nombrehotel).add(nombreservicio);
        }
        System.out.println("Servicio Creado");
    }

    /**
     * 
     * Borra todo el hotel junto a sus servicios
     * 
     **/

    public void borrartodo(HashMap<String, ArrayList<String>> HotelServicios) {
        System.out.println("Indiqueme el nombre del hotel porfavor");
        String nombrehotel = System.console().readLine();
        if (!mihashmap.containsKey(nombrehotel)) {
            System.out.println("No tenemos ese hotel");
        } else {
            mihashmap.remove(nombrehotel);
            System.out.println("Hotel Borrado");
        }
    }

    /**
     * 
     * Borra solo el servicio indicado en el hotel indicado
     * 
     **/

    public void borrarservicio(HashMap<String, ArrayList<String>> HotelServicios) {
        System.out.println("Indiqueme el nombre del hotel porfavor");
        String nombrehotel = System.console().readLine();
        System.out.println("Indiqueme porfavor el servicio ha eliminar");
        String nombreservicio = System.console().readLine();
        if (!mihashmap.containsKey(nombrehotel)) {
            System.out.println("No tenemos ese hotel");
        } else {
            mihashmap.get(nombrehotel).remove(nombreservicio);
            System.out.println("Servicio Borrado");
        }
    }
}