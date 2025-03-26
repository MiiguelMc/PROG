package utilidades;

public class ImpresoraResultados {

    /**
     * @author Miguel Macias del Pino
     * @param puntuacioJugador1
     * @param puntuacioJugador2
     * @return
     * @Note
     *       EN ESTA FUNCION NOS DA LA IMPRESION DEL RESULTADO FINAL COLOREADA
     */
    public static final String RED_BRIGHT = "\033[0;91m"; // RED
    public static final String GREEN_BRIGHT = "\033[0;92m"; // GREEN
    public static final String YELLOW_BRIGHT = "\033[0;93m"; // YELLOW
    public static final String RESET = "\033[0m"; // Text Reset

    public static String Impresion(double puntuacioJugador1, double puntuacioJugador2) {
        String c = " ";
        if (puntuacioJugador1 > puntuacioJugador2) {
            System.out
                    .println("La puntuacion De " + GREEN_BRIGHT + " Jugador 1 " + RESET + " es  " + puntuacioJugador1
                            + " La puntuacion del " + RED_BRIGHT + "Jugador 2 " + RESET + " es "
                            + puntuacioJugador2);
            System.out.println("El ganador de este Partidas es " + YELLOW_BRIGHT + "!!!!Jugador 1!!!! " + RESET);
        } else if (puntuacioJugador1 < puntuacioJugador2) {
            System.out
                    .println("La puntuacion De " + GREEN_BRIGHT + " Jugador 1 " + RESET + " es  " + puntuacioJugador1
                            + " La puntuacion del " + RED_BRIGHT + " Jugador 2 " + RESET + " es "
                            + puntuacioJugador2);
            System.out.println("El ganador de este Partidas es " + YELLOW_BRIGHT + "!!!!Jugador 2!!!!" + RESET);
        } else if (puntuacioJugador1 == puntuacioJugador2) {
            System.out.println("La puntuacion De Jugador 1 es  " + puntuacioJugador1
                    + " La puntuacion del " + RED_BRIGHT + "Jugador 2 " + RESET + "es " + puntuacioJugador2);
            System.out.println("Tenemos un empate entre los Jugadores");
        }
        return c;
    }
}
