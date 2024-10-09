public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("convertido de euros a pesetas " );
        double pesetas = 550.36;
        System.out.println("Dime la cantidad de euros " );
        double euros = Integer.parseInt(System.console().readLine());
        System.out.println("Aqui podemos ver las cantidad en pesetas " + (euros * pesetas) );

        

    }
}
