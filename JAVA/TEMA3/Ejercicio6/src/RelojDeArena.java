import java.util.Scanner;

public class RelojDeArena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario la altura total del reloj de arena
        System.out.print("Introduce la altura total del reloj de arena (número impar): ");
        int altura = scanner.nextInt();

        // Verificar que la altura sea impar
        if (altura % 2 == 0) {
            System.out.println("La altura debe ser un número impar.");
            return;
        }

        // Parte superior del reloj de arena (parte ancha)
        for (int i = 0; i < altura / 2 + 1; i++) {
            // Imprimir espacios antes de los asteriscos
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // Imprimir asteriscos
            for (int j = 0; j < (2 * (altura / 2 - i) + 1); j++) {
                System.out.print("*");
            }
            // Nueva línea después de cada fila
            System.out.println();
        }

        // Parte inferior del reloj de arena (parte estrecha)
        for (int i = altura / 2 - 1; i >= 0; i--) {
            // Imprimir espacios antes de los asteriscos
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // Imprimir asteriscos
            for (int j = 0; j < (2 * (altura / 2 - i) + 1); j++) {
                System.out.print("*");
            }
            // Nueva línea después de cada fila
            System.out.println();
        }

        // Cerrar el scanner
        scanner.close();
    }
}