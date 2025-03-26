import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        ArrayList<String> p = new ArrayList<String>();

        p.add("Pepsi cerveza");
        p.add("Cocacola");
        p.add("Sunny");

        System.out.println(p.get(1));
        System.out.println(p.size());
        for (String Marca : p) {
            System.out.println(Marca);
        }
    }
}
