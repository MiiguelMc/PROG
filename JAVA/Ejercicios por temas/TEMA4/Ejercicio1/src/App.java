public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int figura = (int) (Math.random() * 5) + 1;
        int figura2 = (int) (Math.random() * 5) + 1;
        int figura3 = (int) (Math.random() * 5) + 1;
        figura(figura);
        figura(figura2);
        figura(figura3);
        System.out.println("");
        if (figura == figura2 && figura2 == figura3) {
            System.out.println("Toma ya ludopata");
        } else if (figura == figura2 || figura == figura3 || figura2 == figura3) {
            System.out.println("Te doy una moneda");
        }
        else{
                System.out.println("No has ganado nada ");
        }
    }

    public static void figura(int a) {
        switch (a) {
            case 1:
                System.out.print("Diamantes ");
                break;
            case 2:
                System.out.print("Limon ");
                break;
            case 3:
                System.out.print("Corazon ");
                break;
            case 4:
                System.out.print("Herradura ");
                break;
            case 5:
                System.out.print("Campana ");
                break;
            default:
                break;
        }

    }
}