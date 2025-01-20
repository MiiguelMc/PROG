public class Funciones {
    public static Articulo buscarObjeto(String producto, Articulo articulos[]) {
        String nombreproducto = minuscula(producto);
        for (int i = 0; i < articulos.length && articulos[i] != null; i++) {
            if (nombreproducto.equals(articulos[i].getCodigo())) {
                return (articulos[i]);
            }

        }
        return null;

    }

    public static String minuscula(String producto) {
        return producto.toLowerCase();

    }

    public static int Ultimonumero(Articulo articulo[]) {
        int i = 0;
        while (i < articulo.length && articulo[i] != null) {
            i++;
        }
        return i;
    }

    public static void ModificarArticulo(Articulo articulos[]) {
        System.out.println("Dime el codigo del producto");
        String producto = System.console().readLine();
        System.out.println("Que Quieres Modificar ");
        System.out.println("1 Codigo");
        System.out.println("2 Stock");
        int ele = Integer.parseInt(System.console().readLine());
        switch (ele) {
            case 1:
                System.out.println("Dime el nuevo nombre");
                String nuevonombre = System.console().readLine();
                buscarObjeto(producto, articulos).setCodigo(nuevonombre);
                break;
            case 2:
                System.out.println("Dime el nuevo Stock");
                int nuevoStock = Integer.parseInt(System.console().readLine());
                buscarObjeto(producto, articulos).setStock(nuevoStock);
                break;
            default:
                System.out.println("Opcion no valida ");
                break;
        }

    }
    public static void Entrada(Articulo[] producto) {
        int i = Funciones.Ultimonumero(producto);
                System.out.println("Introduce el codigo del producto");
                String cod = System.console().readLine();
                System.out.println("Dime la descripcion");
                String dep = System.console().readLine();
                System.out.println("Precio de Venta ");
                int PVenta = Integer.parseInt(System.console().readLine());
                System.out.println("Precio de Compra ");
                int PCompra = Integer.parseInt(System.console().readLine());
                System.out.println("Stock");
                int Stock = Integer.parseInt(System.console().readLine());
                producto[i] = new Articulo(dep, cod, PCompra, PVenta, Stock);
                
            }
        
}