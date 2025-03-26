public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Dime un numero y te digo los 100 siguientes");
        //Lee el numero que se te pide 
        int numero = Integer.parseInt(System.console().readLine());
        //Aqui empieza el bucle en el cual sumamos hasta el numero + 100
        for (int i = 0; i <= 100 ; i++) {
            System.out.println(numero + i);
            
        }
    }
}
//Aqui Acaba el Ejercicio