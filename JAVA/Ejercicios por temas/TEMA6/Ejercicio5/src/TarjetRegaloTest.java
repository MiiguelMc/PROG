public class TarjetRegaloTest {
    public static void main(String[] args) throws Exception {
        TarjetaRegalo t1 = new TarjetaRegalo(1000);
        TarjetaRegalo t2 = new TarjetaRegalo(1000);
        System.out.println(t2);

        System.out.println(t1);
        t1.gasta(500);
        System.out.println(t1);
        TarjetaRegalo t3 = t1.fusionar(t2);
        System.out.println(t3);
        System.out.println(t1);

    }
}
