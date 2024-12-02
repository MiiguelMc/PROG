public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println(volteado(532));
        System.out.println(capicua(525));
        System.out.println(capicua(523));
        System.out.println(Esprimo(6));
        System.out.println(Esprimo(7));
        System.out.println(SiguientePrimo(7));
        System.out.println(Potencia(2, 4));
        System.out.println(contar(12345));
        System.out.println(digiton(9753, 2));
        System.out.println(quitarpordetras(54321,2));
        System.out.println(quitarpordelante(54321,2));



    }

    public static int volteado(int n) {
        int volteado = 0;
        while (0 < n) {
            volteado = volteado * 10 + (n % 10);
            n = n / 10;
        }
        return volteado;
    }

    public static boolean capicua(int n) {
        if (volteado(n) != n)
            return false;
        else {
            return true;
        }
    }

    public static boolean Esprimo(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int SiguientePrimo(int n) {
        while (Esprimo(++n) == false) {
        }
        return n;
    }

    public static double Potencia(double a, double b) {
        double c = Math.pow(a, b);
        return c;
    }

    public static int contar(int a ){
        int acumulador = 1;
        for (int i = 1; i < a; i++) {
            a = a /10; acumulador ++;
        }return acumulador;
        
    }

    public static int digiton(int a , int b){
        a = volteado(a);
        int c = 0 ;
        for (int i = -1; i < b; i++) {
        c = a ;
        c%=10;
        a/=10;
        }return c;
    }

    //public static int posidig(){}
    public static int quitarpordetras(int a , int b){
        int i = 0;
        while (i<b) {
            a=a/10;
            i++;
        } 
        return a ;
    }

    public static int quitarpordelante(int a , int b){
        a = volteado(a);
        a = quitarpordetras(a, b);
        a=volteado(a);
        return a;
    }
    public static int 
}