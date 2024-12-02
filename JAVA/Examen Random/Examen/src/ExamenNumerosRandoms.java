import java.util.Scanner;

public class ExamenNumerosRandoms {
    public static void main(String[] args) throws Exception {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("\033[0;93m CHICAGO \033[0m");
            int i = 2;
            // Inicializamos los acumuladores para ya tenerlos
            int ayuda = 1;
            int acumulador1 = 0;
            int acumulador2 = 0;
            int acumulador3 = 0;
            // Empieza el bucle de la rondas
            while (i != 13) {
                // Aqui tenemos los dados
                int dados1 = (int) (Math.random() * 6) + 1;
                int dados2 = (int) (Math.random() * 6) + 1;
                int dadosjugador21 = (int) (Math.random() * 6) + 1;
                int dadosjugador22 = (int) (Math.random() * 6) + 1;
                int dadosjugador31 = (int) (Math.random() * 6) + 1;
                int dadosjugador32 = (int) (Math.random() * 6) + 1;
                System.out.println("\033[0;91mRonda ; " + (i - ayuda) + " Puntuacion Objetivo : " + i + "\033[0m");
                // Estos If lo que hacen es ver si el los dados dan la suma y si lo dan suma al
                // acumulador si no no suma al acumulador
                if (i == dados1 + dados2) {
                    System.out.println("Tirada del Jugador 1 :" + (dados1) + "-" + (dados2) + ";" + " 1 punto");
                    acumulador1 = acumulador1 + 1;
                } else if (i != dados1 + dados2) {
                    System.out.println("Tirada del Jugador 1 :" + (dados1) + "-" + (dados2) + ";" + " 0 puntos");
                }
                if (i == dadosjugador21 + dadosjugador22) {
                    acumulador2 = acumulador2 + 1;
                    System.out.println(
                            "Tirada del Jugador 2 :" + (dadosjugador21) + "-" + (dadosjugador22) + ";" + " 1 punto");
                } else if (i != dadosjugador21 + dadosjugador22) {
                    System.out.println(
                            "Tirada del Jugador 2 :" + (dadosjugador21) + "-" + (dadosjugador22) + ";" + " 0 puntos");
                }
                if (i == dadosjugador31 + dadosjugador32) {
                    acumulador3 = acumulador3 + 1;
                    System.out.println(
                            "Tirada del Jugador 3 :" + (dadosjugador31) + "-" + (dadosjugador32) + ";" + " 1 punto");
                } else if (i != dadosjugador31 + dadosjugador32) {
                    System.out.println(
                            "Tirada del Jugador 3 :" + (dadosjugador31) + "-" + (dadosjugador32) + ";" + " 0 puntos");
                }
                // Aqui Tenemos la tabla del fondo la cual dice la puntuaciones totales
                System.out.println("Puntuaciones Generales: Jugador 1 - " + acumulador1 + " Puntos ; Jugador 2 - "
                        + acumulador2 + " Puntos ; Jugador 3 - " + acumulador3 + " Puntos ;");
                // Aqui Tenemos el dar intro o Fin de la partida
                if (i < 11) {
                    System.out.println("Pulse INTRO para la siguiente Ronda");
                    s.nextLine();
                } else if (i == 12) {
                    System.out.println("Fin de la partida");
                }
                i++;
            }
        }
    }
}
