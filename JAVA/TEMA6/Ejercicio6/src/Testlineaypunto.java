public class Testlineaypunto {
    public static void main(String[] args) throws Exception {
        Punto p1 = new Punto(2.65, 4.65);
        Punto p2 = new Punto(2.32 , 4.43);
        Linea l = new Linea(p1,p2);
        System.out.println(l);
    }
}
