public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Primos");
        int numero=0;
        int prueba = Integer.parseInt(System.console().readLine());
        while (!esprimo(prueba)) {
            if(!esprimo(prueba)){
                if (prueba>numero) {
                    numero=prueba;
                }
            }
            prueba = Integer.parseInt(System.console().readLine());
        }
        System.out.println(numero);
    }
    public static boolean esprimo(int n) {
        for (int i = 2; i<n ; i++) {
            if (n%i==0) {
                return false;
            }
            
        }
            return true;
        
    }
}
