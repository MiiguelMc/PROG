public class PruebaServicioHotel {

    /**
     * @author Miguel Macias del Pino
     * 
     */
    public static void main(String[] args) throws Exception {
        // Esto lo usamos para llamar a las funciones
        ServiciosHotel servicios = new ServiciosHotel();
        // Esto es para el hecho de inicializar el numero que pedimos
        int numeropedir = 0;
        servicios.tablainicial(null);
        while (numeropedir <= 5) {
            // Esta es nuestro menu en donde eligen las opciones
            System.out.println("Servicios Hotel ");
            System.out.println("1º Consultar tablas ");
            System.out.println("2º Añadir nuevo Servicio ");
            System.out.println("3º Borrar entrada completa de la tabla ");
            System.out.println("4º Borrar Servicio");
            System.out.println("5º Salir Programa ");
            // Aqui es donde utilizamos el trycatch
            numeropedir = entero();
            switch (numeropedir) {
                case 1:
                    // Recorre todo el array
                    servicios.consultartabla(null);
                    break;
                case 2:
                    // Aqui creamos el Hotel si no existe y si existe le añadimos esa actividad
                    servicios.crearServicio(null);
                    break;
                case 3:
                    // Aqui lo que hacemos basicamente es Borrar todo el hotel
                    servicios.borrartodo(null);
                    break;
                case 4:
                    // Aqui borramos solo el servicio que nos indiquen
                    servicios.borrarservicio(null);
                    break;
                case 5:
                    // Mensaje Final
                    System.out.println("Gracias por Usar el programa");
                    break;

                default:
                    // Por si ponen un numero mayor al 5
                    System.out.println("Numero Invalido");
                    break;
            }
        }
    }

    // Un try Catch para numero enteros
    public static int entero() {
        boolean verdad = false;
        int entero = 0;
        do {
            try {
                System.out.println("Introduzca el numero de la seccion que quieres ");
                entero = Integer.parseInt(System.console().readLine());
                verdad = true;
            } catch (Exception e) {
                System.out.println("Introduce un numero entero porfavor");
            }
        } while (!verdad);
        return entero;

    }
}
