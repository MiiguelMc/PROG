
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) throws Exception {
        //Iniciamos la variable Scanner que utilizaremos al pedir los datos
        Scanner examen2 = new Scanner(System.in);
        //Ponemos los codigos para colorear el texto
        System.out.println("\033[1;30m AREA DE UN CÍRCULO \033[0m");
        System.out.println("══════════════════════════════════════════");
        System.out.print("introduzca el radio (cm): ");
        //Aqui esta todos los calculos necesarios para poder tener el area 
        double radio = examen2.nextDouble();
        double radioo = radio * radio;
        double area = (radioo * Math.PI);
        //Y aqui le mostramos al usuario el resultado
        System.out.print("El área del círculo es: \033[1;31m " + area);
        System.out.print("\033[0m cm\u00B2.");

    }
}
