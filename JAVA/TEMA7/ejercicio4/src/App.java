public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int[][] num;
        num = new int[3][6];
        for (int i = 0; i < num.length; i++) {
            System.out.println("Tabla " + (i+1));
            for (int j = 0; j < num[i].length; j++) {
                int temporal = Integer.parseInt(System.console().readLine());
                num[i][j] = temporal;
            }
        }
        for (int i = 0; i < num.length; i++) {
            System.out.print("Linea "+(i+1)+" |");
            for (int j = 0; j < num[i].length; j++) {
                System.out.print(" " + num[i][j] + " ");
            }
            System.out.println(" ");
        }

    }
}
