package juego;

import utilidades.CalculadorPuntacion;
import utilidades.GeneradorAleatorio;
import utilidades.ImpresoraResultados;

public class CompeticionMagos {
    // La funcion de aqui es para poder de forma mas facil colorear el texto
    public static final String RED_BRIGHT = "\033[0;91m"; // RED
    public static final String GREEN_BRIGHT = "\033[0;92m"; // GREEN
    public static final String YELLOW_BRIGHT = "\033[0;93m"; // YELLOW
    public static final String RESET = "\033[0m"; // Text Reset

    /**
     * @author Miguel Macias del Pino
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        // Aqui iniciamos el juego ademas de que declaramos todas la variables
        System.out.println("Empieza el Juego para" + GREEN_BRIGHT + " Magos" + RESET);
        System.out.println("Pulsa " + YELLOW_BRIGHT + "ENTER " + RESET + "para Jugar");
        String c = System.console().readLine();
        // Aqui tenemos basicamente el si no pulsas enter no juegas
        if (c.equals("")) {
            int i = 0;
            int dados = 0;
            int carta = 0;
            double puntuacioJugador1 = 0;
            double puntuacioJugadorTotal1 = 0;
            double puntuacioJugador2 = 0;
            double puntuacioJugadorTotal2 = 0;
            // Estos es el Juego en si
            while (i < 5) {
                dados = GeneradorAleatorio.generarDados(0);
                carta = GeneradorAleatorio.generarCarta(0);
                puntuacioJugador1 = CalculadorPuntacion.CalculadoradePuntacion(carta, dados);
                puntuacioJugadorTotal1 = puntuacioJugadorTotal1 + puntuacioJugador1;
                // Estas es la puntuacion de Jugador 1 despues de cada ronda
                System.out.println("Las " + GREEN_BRIGHT + "Cartas" + RESET + " que Han Salido "+YELLOW_BRIGHT+"Al Jugador 1 "+RESET+"es " + carta
                        + " y Los" + RED_BRIGHT + " Dados" + RESET + " son " + dados
                        + " La puntuacion de esta ronda es " + puntuacioJugador1 + " .Y la total es "
                        + puntuacioJugadorTotal1);
                dados = GeneradorAleatorio.generarDados(0);
                carta = GeneradorAleatorio.generarCarta(0);
                puntuacioJugadorTotal2 = puntuacioJugadorTotal2 + puntuacioJugador2;
                puntuacioJugador2 = CalculadorPuntacion.CalculadoradePuntacion(carta, dados);
                puntuacioJugadorTotal2 = puntuacioJugadorTotal2 + puntuacioJugador2;
                // Estas es la puntuacion de Jugador 2 despues de cada ronda
                System.out.println("Las " + GREEN_BRIGHT + "Cartas" + RESET + " que Han Salido "+YELLOW_BRIGHT+"Al Jugador 2"+RESET+" es " + carta
                        + " y Los" + RED_BRIGHT + " Dados" + RESET + " son " + dados
                        + " La puntuacion de esta ronda es " + puntuacioJugador2 + " . Y la total es "
                        + puntuacioJugadorTotal2);
                i++;
                System.console().readLine();
            }
            // estas es la puntuacion de fin de Juego
            System.out.println(ImpresoraResultados.Impresion(puntuacioJugadorTotal1, puntuacioJugadorTotal2));
        } else {
            System.out.println("No has querido Jugar a el Juego Para " + YELLOW_BRIGHT + "Magos" + RESET);
        }
    }
}
