public class Funciones {
    public static Articulo buscarObjeto(String producto, Articulo articulo[]) {
        String nombreproducto = minuscula(producto);
        for (int i = 0; i < articulo.length && articulo[i] != null; i++) {
            if (nombreproducto.equals(articulo[i].getCodigo())) {
                return (articulo[i]);
            }
            
        }
        return null;

    }

    public static String minuscula(String producto) {
        return producto.toLowerCase();

    }
    public static int Ultimonumero( Articulo articulo[]) {
        int i = 0;
        while (i < articulo.length && articulo[i] != null) {
           i++; 
        }
                return i;
    }
}