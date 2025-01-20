public class App {
    public static void main(String[] args) throws Exception {
        Articulo producto[] = new Articulo[99];
        int num = 0;
        while (num != 7) {
            System.out.println("1º Listado");
            System.out.println("2º Alta");
            System.out.println("3º Baja");
            System.out.println("4º Modificacion");
            System.out.println("5º Entrada de mercancia");
            System.out.println("6º Salida de Mercancia");
            System.out.println("7º Salida");
            num = Integer.parseInt(System.console().readLine());
            switch (num) {
                case 1:
                    int k = 0;
                    while (k <= producto.length && producto[k] != null) {
                        System.out.println(producto[k].toString());
                        k++;
                    }

                    break;
                case 2:

                    break;

                case 3:

                    break;

                case 4:
                    Funciones.ModificarArticulo(producto);
                    break;

                case 5:
                Funciones.Entrada(producto);
                    break;

                case 6:

                    break;

                case 7:

                    break;

                default:
                    System.out.println("Error al indicar numero");
                    break;
            }

        }
    }
}
