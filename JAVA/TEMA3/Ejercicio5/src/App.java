public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Altura de arbol");
        int num = 7;
        for (int i = 0; i < num; i++) {
            for (int in = 0; in < i; in++) {
                System.out.print(" ");
            }
            for (int in = 0; in <= i; in++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}