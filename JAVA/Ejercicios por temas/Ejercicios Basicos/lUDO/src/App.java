public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("Dime que cantidad de dinero quieres apostar: ");
        int cantidad = Integer.parseInt(System.console().readLine());
        int dado1 = (int) (Math.random() * 6 - 1 + 1) + 1;
        int dado2 = (int) (Math.random() * 6 - 1 + 1) + 1;
        int dados = dado1 + dado2;
        int segundosDados = 0;
        boolean ganado = false;
        System.out.println(dados);
        switch (dados) {
            case 7, 11:
                cantidad = 2;
                System.out.println("Has ganado: " + cantidad);
                break;
            case 2, 3, 12:
                System.out.println("Has perdido");

                break;
            default:
                System.out.println(dados);
                segundosDados = (int) (Math.random() * 12 - 2 + 1 + 2);
                while (ganado == false) {
                    segundosDados = (int) (Math.random() * 12 - 1 + 1 + 1);
                    System.out.println(segundosDados);
                    if (segundosDados == dados) {
                        System.out.println("Has ganado: " + cantidad * 2);
                        ganado = true;
                    } else if (segundosDados == 7) {
                        System.out.println("Has perdido");
                        ganado = true;
                    }
                }
                break;
        }
        System.out.println("La suma de los dados es de: " + dados);
    }
}