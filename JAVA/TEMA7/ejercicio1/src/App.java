public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        int[] n;
        n = new int[10];
        int numero = 0 ;
        int menor = 1232;
        int maximo = 0;
        // n[0]=1;
        // n[1]=2;
        // n[2]=3;
        // n[3]=4;
        // n[4]=5;
        // System.out.println("Los numeros del array son "+n[0]+" "+n[1]+" "+n[2]+"
        // "+n[3]+" "+n[4] );
        // for (int i = 0; i < 4; i++) {
        // edad = Integer.parseInt(System.console().readLine());
        // n[i] = edad;
        // }
        // System.out.println("Este es el Numero 1 " + n[0]);
        // System.out.println("Este es el Numero 1 " + n[1]);
        // System.out.println("Este es el Numero 2 " + n[2]);
        // System.out.println("Este es el Numero 3 " + n[3]);

        for (int i = 0; i < 10; i++) {
            numero = Integer.parseInt(System.console().readLine());
            n[i] = numero;
            if (maximo< n[i] ) {
                maximo = n[i];
            }
            if (menor > n[i] ) {
                menor = n[i];
            }
        }
        System.out.println("El mayor es "+maximo+" El menor es "+menor );
    }
}
