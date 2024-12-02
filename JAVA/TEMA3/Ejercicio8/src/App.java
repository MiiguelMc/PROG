public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        String hola = System.console().readLine();
        for (int i = 0; i < hola.length(); i++) {
            System.out.println(hola.charAt(i));

        }
        int num = Integer.parseInt(System.console().readLine());
        System.out.println(hola.charAt(num));
    }
}
