public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("piedra papel o tijera");
        String jugador1 = System.console().readLine();
        String jugador2 = System.console().readLine();
        switch (jugador1) {
            
            case "piedra":
                if (jugador2.equals(jugador1)) {
                    System.out.println("Empate");

                } else if (jugador2.equals("papel")) {
                    System.out.println("Gana Jugador2");

                } else if (jugador2.equals("tijera")) {
                    System.out.println("Gana Jugador1");
                } else {
                    System.out.println("No has puesto una opcion correcta jugador 2");
                }
                break;
            case "papel":
                if (jugador2.equals(jugador1)) {
                    System.out.println("Empate");

                } else if (jugador2.equals("tijera")) {
                    System.out.println("Gana Jugador2");

                } else if (jugador2.equals("piedra")) {
                    System.out.println("Gana Jugador1");
                } else {
                    System.out.println("No has puesto una opcion correcta jugador 2");
                }

                break;
            case "tijera":
                if (jugador2.equals(jugador1)) {
                    System.out.println("Empate");

                } else if (jugador2.equals("piedra")) {
                    System.out.println("Gana Jugador2");

                } else if (jugador2.equals("papel")) {
                    System.out.println("Gana Jugador1");
                } else {
                    System.out.println("No has puesto una opcion correcta jugador 2");
                }

                break;
            default:
                System.out.println("No has puesto una opcion correcta Jugador 1");
        }
    }
}
