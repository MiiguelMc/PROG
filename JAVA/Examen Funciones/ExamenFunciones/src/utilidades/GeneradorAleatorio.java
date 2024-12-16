package utilidades;

public class GeneradorAleatorio {

    /**
     * @author Miguel Macias del Pino
     * @param a
     * @return
     * @Note
     *       AQUI TENEMOS LOS CREADORES DE EL DADO Y LAS CARTAS Y LO QUE HACEN ES
     *       SACAR UN NUMERO ALEATORIO ENTRE LOS 6 DEL DADO Y LOS 40 DE LAS CARTAS
     */

    public static int generarCarta(int a) {
        a = (int) (Math.random() * 40 + 1);
        return a;
    }

    public static int generarDados(int a) {
        a = (int) (Math.random() * 6 + 1);
        return a;
    }
}
