public class App {
    public static void main(String[] args) throws Exception {
        fichasdomino f1 =new fichasdomino(1, 5);
        fichasdomino f2 =new fichasdomino(3, 1);
        fichasdomino f3 =new fichasdomino(0, 5);
        fichasdomino f4 =new fichasdomino(3, 2);
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
        System.out.println(f4);
        System.out.println(f1.Voltea());
        System.out.println(f1.encaja(f2));

    
    }


}
