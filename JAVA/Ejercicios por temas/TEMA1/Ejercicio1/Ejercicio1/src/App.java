public class App {
    public static void main(String[] args) throws Exception {
        int x = 144;
        int y = 999;
        System.out.println("Estas es la primera variable " + x);
        System.out.println("Estas es la primera variable " + y);
        System.out.println("Esta es la Suma " + (x + y));
        System.out.println("Esta es la Resta " + (x - y));
        System.out.println("Esta es la Division " + ((double) x / (double) y));
        System.out.println("Esta es la Multiplicación " + (x * y));
        System.out.println("Y a partir de aqui tomamos los datos al reves");
        System.out.println("Esta es la Suma " + (y + x));
        System.out.println("Esta es la Resta " + (y - x));
        System.out.println("Esta es la Division " + (y / x));
        System.out.println("Esta es la Multiplicación " + (y * x));
    }
}
// Miguel Macias del Pino
// Escribe un programa en el que se declaren las variables enteras x e y.
// Asígnales
// los valores 144 y 999 respectivamente. A continuación, muestra por pantalla
// el valor de cada variable, la suma, la resta, la división y la
// multiplicación.