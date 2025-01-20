public class Funciones {
    public static void menu(Articulos[] articulos) {

        int eleccion = 0;
        while (eleccion < 7) {
            System.out.println("1º Listado");
            System.out.println("2º Alta");
            System.out.println("3º Bajas ");
            System.out.println("4º Modificacion");
            System.out.println("5º Entrada de mercancias ");
            System.out.println("6º Salida de Mercancia ");
            System.out.println("7º Salir ");
            eleccion = Integer.parseInt(System.console().readLine());
            switch (eleccion) {
                case 1:
                    for (int i = 0; i < articulos.length && articulos != null; i++) {
                        System.out.println(articulos[i]);
                    }
                    break;
                case 2:
                    PedirArticulos(articulos);
                    break;
                case 3:
                    EliminarArticulo(articulos);
                    break;
                case 4:
                    Modificacion(articulos);
                    break;
                case 5:
                    AñadirStock(articulos);
                    break;
                case 6:
                    RetirarStock(articulos);
                    break;
                case 7:
                    System.out.println("Gracias por usar el programa");
                    break;

                default:
                    System.out.println("Error reinicie el programa");
                    break;
            }
        }

    }

    public static int ultimonumero(Articulos[] articulos) {
        int ultimonumeroo = 0;
        int j = 0;
        while (j < articulos.length && articulos[j] != null) {
            j++;
            ultimonumeroo = j;
        }

        return (ultimonumeroo);

    }

    public static void PedirArticulos(Articulos[] articulos) {
        System.out.println("Indicame el producto que quieres que añada");
        System.out.println("Dime el nombre ");
        String nombre = System.console().readLine();
        System.out.println("Dime una breve descripcion");
        String Descripcion = System.console().readLine();
        System.out.println("Indicame el precio");
        double Precio = pedirdouble();
        System.out.println("Indicame el Stock ");
        double Stock = pedirdouble();
        articulos[ultimonumero(articulos)] = new Articulos(nombre, Descripcion, Precio, Stock);
    }

    public static Articulos Buscarnombre(Articulos[] articulos) {
        System.out.println("Dime que Buscas");
        String nombreee = System.console().readLine();
        for (int i = 0; i < articulos.length; i++) {
            if (nombreee.equals(minusculas(articulos[i].getNombre()))) {
                return articulos[i];
            }
        }
        return null;
    }

    public static String minusculas(String entrada) {
        entrada = entrada.toLowerCase();
        return entrada;
    }

    public static void EliminarArticulo(Articulos[] articulos) {
        System.out.println("Dime el objeto que quieres eliminar");
        String eliminar = System.console().readLine();
        for (int i = 0; i < articulos.length && articulos[i] != null; i++) {
            if (eliminar.equals(minusculas(articulos[i].getNombre()))) {
                articulos[i] = null;
            }

        }
    }

    public static void Modificacion(Articulos[] articulos) {
        System.out.println("Buenas dime que quieres modificar");
        Articulos nombre = Buscarnombre(articulos);
        System.out.println("1º Nombre");
        System.out.println("2º Descripcion");
        System.out.println("3º Precio");
        System.out.println("4º Stock ");
        int valor = pedirEntero();

        switch (valor) {
            case 1:
                System.out.println("Dime el nuevo nombre que le quieres dar");
                String Newnombre = System.console().readLine();
                nombre.setNombre(Newnombre);
                break;
            case 2:
                System.out.println("Dime el nuevo Descripcion que le quieres dar");
                String Newdescripcion = System.console().readLine();
                nombre.setNombre(Newdescripcion);
                break;
            case 3:
                System.out.println("Dime el nuevo Precio que le quieres dar");
                String Newprecio = System.console().readLine();
                nombre.setNombre(Newprecio);
                break;
            case 4:
                System.out.println("Dime el nuevo Precio que le quieres dar");
                String NewStock = System.console().readLine();
                nombre.setNombre(NewStock);
                break;
            default:
                System.out.println("Eleccion incorrecta");
                break;
        }
    }

    public static void AñadirStock(Articulos[] articulos) {
        System.out.println("Indicame el nombre del articulo al cual le quieres añadir Stock");
        Articulos nombre = Buscarnombre(articulos);
        System.out.println("Dime cuanto Stock quieres añadir");
        int newStock = pedirEntero();
        double OldStock = nombre.getStock();
        nombre.Stock(OldStock + newStock);
    }

    public static void RetirarStock(Articulos[] articulos) {
        System.out.println("Indicame el nombre del articulo al cual le quieres añadir Stock");
        Articulos nombre = Buscarnombre(articulos);
        System.out.println("Dime cuanto Stock quieres retirar");
        int newStock = pedirEntero();
        double OldStock = nombre.getStock();
        nombre.Stock(OldStock - newStock);

    }

    private static int pedirEntero() {
        boolean intro = false;
        int Entero = 0;
        do {
            try {
                Entero = Integer.parseInt(System.console().readLine());
                intro = true;
            } catch (Exception e) {
                System.out.println("Error al introducir el numero");
            }
        } while (!intro);
        return Entero;
    }

    private static double pedirdouble() {
        boolean intro = false;
        double numero = 0;
        do {
            try {
                numero = Double.parseDouble(System.console().readLine());
                intro = true;
            } catch (Exception e) {
                System.out.println("Error al introducir el numero");
            }
        } while (!intro);
        return numero;
    }
}
//Hola estos es un comentario para edes
// Hola como estas 