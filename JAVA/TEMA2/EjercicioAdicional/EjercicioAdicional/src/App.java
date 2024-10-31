
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Dime el precio de tu entrada");
        double precio = Double.parseDouble(System.console().readLine());
        // Aqui pedimos que me diga donde se va a sentar
        System.out.println("Dime que  asiento quieres ");
        System.out.println("1 - Palco");
        System.out.println("2 - Gallinero");
        Integer tipoAsiento = Integer.parseInt(System.console().readLine());
        // Aqui pedimos que espectador es
        System.out.println("Dime que tipo de espectador eres ");
        System.out.println("1 - Publico Invitado");
        System.out.println("2 - Publico Local");
        System.out.println("3 - Publico Foraneo");
        Integer tipopublico = Integer.parseInt(System.console().readLine());
        double total = 0;
        // Aqui ya es donde le decimos el coste real de su entrada segun las posibles
        // variables que hay
        switch (tipopublico) {
            case 1:
                if (tipoAsiento == 1) {
                    total = precio - (precio * 0.10);
                } else if (tipoAsiento == 2) {
                    total = precio - (precio * 0.05);
                }
                System.out.println("El precio de tu entradas es " + total + "€");
                break;
            case 2:
                total = precio;
                System.out.println("El precio de tu entradas es " + total + "€");
                break;
            case 3:
                if (tipoAsiento == 1) {
                    total = precio + (precio * 0.10);
                } else if (tipoAsiento == 2) {
                    total = precio + (precio * 0.05);
                }
                System.out.println("El precio de tu entradas es " + total + "€");
                break;
            default:
                System.out.println("No has elegido una opcion correcta");
        }
    }
}
