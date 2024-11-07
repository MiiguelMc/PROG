public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        long num = Long.parseLong(System.console().readLine()); 
        long total = num;
        while (total>=9) {
            total = total / 10;
        }
        System.out.println(total);
    }
}
