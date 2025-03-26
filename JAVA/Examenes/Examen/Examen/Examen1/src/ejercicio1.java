
import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) throws Exception {
        // Iniciamos escaner para poder utilizarlos al pedir
        Scanner examen = new Scanner(System.in);
        System.out.println("DISTANCIA QUE RECORRE LA LUZ");
        System.out.println("═════════════════════════════");
        System.out.print("Ingrese el número de años: ");
        int años = examen.nextInt();
        // Aqui le damos a la variable velocidad los km que recorre en un segundo
        double velocidad = (299792);
        // Estos son los calculos necesarios para saber los segundos
        int horas = (365 * 24);
        int minutos = (horas * 60);
        int segundos = (minutos * 60);
        double añseg = (segundos * años);
        // Aqui es el calculos para saber el resultado que queremos
        double distancia = (añseg * velocidad);
        // Este ya es el texto final
        System.out.print("La luz recorre aproximadamente " + distancia);
        System.out.print(" Kilometros en " + años);
        System.out.print(" años.");
    }
}
