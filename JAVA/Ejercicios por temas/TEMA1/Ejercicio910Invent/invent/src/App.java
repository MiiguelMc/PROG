public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hola esto es un test para ver ti te engaña tu pareja");
        System.out.println("Primera pregunta ¿te engaña? ");
        String pregunta = System.console().readLine();
        if (pregunta.equals("si")) {
            System.out.println("Vaya perdedor");

        } else if (pregunta.equals("no")) {
            System.out.println("Menos mal");

        }
        System.out.println("Tu novia se besa con su amigo supuestamente gay");  
        String preguntad = System.console().readLine();
        if (preguntad.equals("si")) {
            System.out.println("Sal de hay Jefe");

        } else if (pregunta.equals("no")) {
            System.out.println("Menos mal pero ten cuidado que no hay amigos gay hay amigos con paciencia");
        }
        
    }
}
