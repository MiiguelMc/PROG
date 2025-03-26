public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ahora voy a pasar tus Kb a Megabyte");
        double kilobyte = Integer.parseInt(System.console().readLine());
        System.out.println("Tus Kilobyte en Megabyte son : " +( kilobyte/1024 ));
    }
}