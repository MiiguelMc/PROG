public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Introduce un numero");
        int numero = Integer.parseInt(System.console().readLine());
        int invertido = 0, resto;
        while (numero > 0) {
            resto = numero % 10;
            invertido = invertido * 10 + resto;
            numero /= 10;
        }
        while (invertido > 0) {
            int alreves = (invertido % 10);
            invertido = invertido / 10;
            for (int i = 0; i < alreves; i++) {
                System.out.print("|");
            }
            if (invertido >= 1) {
                System.out.print("-");
            }
        }
    }
}