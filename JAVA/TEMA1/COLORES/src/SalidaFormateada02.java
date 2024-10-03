public class SalidaFormateada02 {
    public static void main(String[] args){
        System.out.println("Articulos        Precios/caja        Nºcajas");
        System.out.println("----------------------------------------");
        System.out.printf("%-10s    %8.2f   %6d\n", "manzanas", 4.5, 10);
        System.out.printf("%-10s    %8.2f   %6d\n", "peras", 2.5, 120);
        System.out.printf("%-10s    %8.2f   %6d\n", "Aguacates", 10.0, 6);
        

    }       
}