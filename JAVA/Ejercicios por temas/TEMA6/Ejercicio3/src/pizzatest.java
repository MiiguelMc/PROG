public class pizzatest {
    public static void main(String[] args) throws Exception {
        pizza p1 = new pizza("Mediana", "Margarita" );
        System.out.println(p1.goString());
        p1.sirve();
        System.out.println(p1.goString());

    }
}
