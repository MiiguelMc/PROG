public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Caja Fuerte Introduzca el codigo");
        for (int a = 1; a <= 4; a++) {
            int cod = Integer.parseInt(System.console().readLine());
            if (cod == 444) {
                a = a + 4;
                System.out.println("La caja fuerte se ha abierto satisfactoriamente");

            } else {
                System.out.println("Lo siento, esa no es la combinación");

            }

        }
    }
}
