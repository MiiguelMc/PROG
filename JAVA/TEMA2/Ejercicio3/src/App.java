
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Voy a realizar la media entre tus notas y despues te dire si esta aprobado ");
        System.out.println("Dime la primera nota");
        int nota1 = Integer.parseInt(System.console().readLine());
        System.out.println("Dime la segunda nota");
        int nota2 = Integer.parseInt(System.console().readLine());
        System.out.println("Dime la tercera nota");
        int nota3 = Integer.parseInt(System.console().readLine());
        double notamedia = (nota1 + nota2 + nota3) / 3;
        if (10 < nota1 || 10 < nota2 || 10 < nota3 || 0 < nota1 || 0 < nota2 || 0 < nota3) {
            System.out.println("Error has introducido un numero superior a 10");
        } else {

            System.out.println("Tu nota Media es: " + notamedia);

        }
        if (5 > notamedia) {
            System.out.println("Tu notas es insuficiente boletín");
        } else if (5 == notamedia) {
            System.out.println("Tu nota Media es Suficiente boletín");
        } else if (6 == notamedia) {
            System.out.println("Tu nota Media es Bien en el boletín");
        } else if (notamedia == 7 && notamedia == 8) {
            System.out.println("Tu nota Notable es Bien en el boletín");
        } else if (notamedia == 9 && notamedia == 10) {
            System.out.println("Tu nota Sobresaliente es Bien en el boletín");

        }

    }
}