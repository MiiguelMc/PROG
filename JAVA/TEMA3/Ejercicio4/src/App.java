public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Dime un numero y te digo los 100 siguientes");
        int numero = Integer.parseInt(System.console().readLine());
        for (int i = 0; i <= 100 ; i++) {
            System.out.println(numero + i);
            
        }
    }
}
