public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int numero = 987;
        int resto =0;
        int invertido=0; 
        while (numero > 0) { 
            resto = numero % 10;
            invertido = invertido * 10 + resto;
            numero /= 10; }
            System.out.println(invertido);
    }
}
