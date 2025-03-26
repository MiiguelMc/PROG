public class App {
    public static void main(String[] args) throws Exception {
        int puntos = 0;
        System.out.println("Tipo Test");
        System.out.println("Vamos a ver tus conocimientos");
        System.out.println("¿Que prefieres?");
        System.out.println("a Base de datos");
        System.out.println("b Lenguaje de Marca");
        System.out.println("c Programación");
        String respuesta1 = System.console().readLine();
        if (respuesta1.equals("a")) {
            puntos = puntos + 1;
        }
        System.out.println("Tipo Test");
        System.out.println("Vamos a ver tus conocimientos");
        System.out.println("¿Que prefieres?");
        System.out.println("a pc");
        System.out.println("b Playstation ");
        System.out.println("c XBox");
        String respuesta2 = System.console().readLine();
        if (respuesta2.equals("a")) {
            puntos = puntos + 1;
        }
        System.out.println("¿Que prefieres?");
        System.out.println("a Logitech");
        System.out.println("b Razer");
        System.out.println("c HyperX");
        String respuesta3 = System.console().readLine();
        if (respuesta3.equals("a")) {
            puntos = puntos + 1;
        }
        System.out.println("Tus puntos son: " + puntos);
    }
}
