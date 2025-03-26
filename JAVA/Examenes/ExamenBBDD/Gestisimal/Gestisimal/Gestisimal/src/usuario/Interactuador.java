package usuario;

import java.util.ArrayList;
import java.util.Scanner;
import pool.ConnectionPool;
import productos.Producto;
import productos.GestorInventario;

public interface Interactuador {
    // Configuración de la conexión a la base de datos
    final String URL = "jdbc:mariadb://localhost:3306/gestisimal";
    final String USUARIO = "root";
    final String CLAVE = "";

    ConnectionPool pool = new ConnectionPool(URL, USUARIO, CLAVE);
    GestorInventario miGestor = new GestorInventario(pool.getConnection());
    Scanner sc = new Scanner(System.in);

    // Consulta ordenada de productos
    public static void consultaOrdenada() {
        ArrayList<Producto> miarray = new ArrayList<>();
        System.out.println("Indiqueme los criterios de ordenacion que quiere");
        String Criterios = System.console().readLine();
        try {
            miarray = miGestor.requestAll(Criterios);
            for (Producto producto : miarray) {
                System.out.println(producto);
            }
            System.out.println(GREEN_BRIGHT+"Productos enseñados con exito"+RESET);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Consulta de datos por ID
    public static void consultaPorCódigo() {
        System.out.println("Indicame el ID del producto");
        long id = (Long) solicitarValorNumérico(Long.class);
        try {
            Producto producto = new Producto(miGestor.requestById(id));
            System.out.println(producto);
            System.out.println(YELLOW_BRIGHT+"Producto enseñado con exito"+RESET);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Alta de nuevo producto
    public static void altaProducto() {
        System.out.println("Indiqueme el Id del Producto");
        long codigo = (Long) solicitarValorNumérico(Long.class);
        System.out.println("Indiqueme el nombre del producto");
        String descripcion = System.console().readLine();
        System.out.println("Indicame el precio compra del los productos ");
        double preciocompra = Double.parseDouble(System.console().readLine()); // me daba un error y tardaba mucho en
                                                                               // cargar por eso puse Double.parseDouble
        System.out.println("Indicame el precio venta  del los productos ");
        double precioventa = (Double) solicitarValorNumérico(Double.class);
        System.out.println("Indicame la existencias de los productos");
        int stock = (Integer) solicitarValorNumérico(Integer.class);
        Producto producto = new Producto(codigo, descripcion, preciocompra, precioventa, stock);
        try {
            miGestor.create(producto);
            System.out.println(RED_BRIGHT+"Producto creado con Exito"+RESET);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Actualización de los datos de un producto
    public static void modificaciónProducto() {
        System.out.println("Indiqueme el Id del Producto");
        long codigo = (Long) solicitarValorNumérico(Long.class);
        System.out.println("Indiqueme el nombre del producto");
        String descripcion = System.console().readLine();
        System.out.println("Indicame el precio del los productos ");
        double preciocompra = (Double) solicitarValorNumérico(Double.class);
        System.out.println("Indicame el precio del los productos ");
        double precioventa = (Double) solicitarValorNumérico(Double.class);
        System.out.println("Indicame la existencias de los productos");
        int stock = (Integer) solicitarValorNumérico(Integer.class);
        Producto producto = new Producto(codigo, descripcion, preciocompra, precioventa, stock);
        try {
            miGestor.update(producto);
            System.out.println(GREEN_BRIGHT+"Producto modificado con exito"+ RESET);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Baja de un producto
    public static void bajaProducto() {
        System.out.println("Indiqueme el Id del Producto");
        long id = Long.parseLong(System.console().readLine());
        try {
            miGestor.delete(id);
            System.out.println(YELLOW_BRIGHT+"Producto Eliminado con exito"+RESET);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Solicitar opción al usuario
    public static int solicitarElección(int OPCIÓN_MAX) {
        int elección = 0;
        try {
            elección = sc.nextInt();
            if (elección < 1 || elección > OPCIÓN_MAX)
                throw new IllegalArgumentException();
        } catch (Exception e) {
            System.out.println("Opción inválida.\n");
        } finally {
            sc.nextLine(); // Limpiamos buffer de entrada
        }
        return elección;
    }

    // Solicitar valor numérico al usuario
    // Ejemplo de uso 1: int existencias = (Integer)
    // solicitarValorNumérico(Integer.class);
    // Ejemplo de uso 2: long código = (Long) solicitarValorNumérico(Long.class);
    // Ejemplo de uso 3: double precioCompra = (Double)
    // solicitarValorNumérico(Double.class);
    private static Object solicitarValorNumérico(Class<?> tipo) {
        Object resultado = null;
        while (resultado == null) {
            try {
                if (tipo == Short.class)
                    resultado = sc.nextShort();
                else if (tipo == Integer.class)
                    resultado = sc.nextInt();
                else if (tipo == Long.class)
                    resultado = sc.nextLong();
                else if (tipo == Float.class)
                    resultado = sc.nextFloat();
                else if (tipo == Double.class)
                    resultado = sc.nextDouble();
                else
                    System.out.println("Tipo de dato no soportado.");
            } catch (Exception e) {
                System.out.print("Valor inválido.\nPruebe de nuevo: ");
            } finally {
                sc.nextLine(); // Limpiamos buffer de entrada
            }
        }
        return resultado;
    }

    // Cerrar scanner
    public static void cerrarScanner() {
        sc.close();
    }
    public static final String RED_BRIGHT = "\033[0;91m"; // RED
    public static final String GREEN_BRIGHT = "\033[0;92m"; // GREEN
    public static final String YELLOW_BRIGHT = "\033[0;93m"; // YELLOW
    public static final String RESET = "\033[0m"; // Text Reset

}
