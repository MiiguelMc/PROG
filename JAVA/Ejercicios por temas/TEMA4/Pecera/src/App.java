public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Altura");
        int altura = Integer.parseInt(System.console().readLine());
        System.out.println("Pecera de don pepe");
        int horizontal = Integer.parseInt(System.console().readLine());
        int i = 0;
        int pezx = (int) (Math.random() * horizontal - 2)+2 ;
        int pezy = (int) (Math.random() * altura - 2)+2 ;
        int carax = (int) (Math.random() * horizontal - 2)+2 ;
        int caray = (int) (Math.random() * altura - 2)+2 ;
        int cabax = (int) (Math.random() * horizontal - 2)+2 ;
        int cabay = (int) (Math.random() * altura - 2)+2 ;
        while (carax==cabax && caray==cabay) {
            carax = (int) (Math.random() * horizontal - 2) + 1;
            caray = (int) (Math.random() * altura - 2) + 1; 
        }
        while((pezx==carax && pezy==caray) || (pezx==cabax && pezy==cabay)){
            pezx = (int) (Math.random() * horizontal - 2) + 1;
            pezy = (int) (Math.random() * altura - 2) + 1;
        }
        while (i <= altura) {
            int j = 0;
            while (j <= horizontal) {
                if (i == 0 || i == altura) {
                    System.out.print("*");
                } else if (j == 0 || j == horizontal) {
                    System.out.print("*");
                } else {
                    if (pezx == j && pezy == i) {
                        System.out.print("&");
                    } else if (carax == j && caray == i) {
                        System.out.print("@");
                    } else if (cabax == j && cabay == i) {
                        System.out.print("$");
                    } else {
                        System.out.print(" ");
                    }
                }
                j++;
            }
            System.out.println("");
            i++;
        }
    }
}