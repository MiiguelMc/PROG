public class arrayfunciones {
    public static void generarArrayInt(int maximo, int minimo) {
        int[] n = new int[5];
        double random = 0;
        int i = 0;
        while (i < n.length) {
            random = (int) (Math.random() * 10);
            if (random < maximo && random > minimo) {
                n[i] = (int) random;
                i++;
            }
        }
        System.out.println(n[0] + " " + n[1] + " " + n[2] + " " + n[3] + " " + n[4]);

    }
}
