public class ventanaTest {
    public static void main(String[] args) {

        Ventana google = new Ventana(3, 4,"brave");
        System.out.println(google.toString());
        System.out.println("vamos a revisar los datos ");
        google.tamañoVentana(1, 2);
        System.out.println(google.toString());
    }
}