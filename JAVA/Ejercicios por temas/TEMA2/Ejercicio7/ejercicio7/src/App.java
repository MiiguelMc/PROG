public class App {
    public static void main(String[] args) throws Exception {
        // Bandera de España
        System.out.print("Introduzca la altura de la bandera en cm: ");
        int altura = Integer.parseInt(System.console().readLine());
        System.out.print("Introduzca la anchura de la bandera en cm: ");
        int anchura = Integer.parseInt(System.console().readLine());
        System.out.print("¿Quieres escudo bordado? (s/n): ");
        String bordado = System.console().readLine();
        System.out.println("Gracias. Aquí tiene el desglose de su compra.");
        // Precios
        double area = (altura * anchura);
        Double precio = (area * 0.01);
        double escudo = (2.5);
        Double gastosenvio = (3.25);
        double Total = (precio + gastosenvio);
        // facturas
        System.out.printf("Bandera de %10.2f cm: %10.2f $ \n", area, precio);
        if (bordado.equals("s")) {
            double Totalescudo = (precio + escudo + gastosenvio);
            System.out.printf("Con escudo %25.2f $ \n", escudo);
            System.out.printf("Gastos de envio: %19.2f $ \n", gastosenvio);
            System.out.printf("Total %30.2f $ \n", Totalescudo);

        } else {
            System.out.printf("Sin escudo %25.2f $ \n", 0.00);
            System.out.printf("Gastos de envio: %19.2f \n", gastosenvio);
            System.out.printf("Total %30.2f $ \n", Total);
        }

    }
}
