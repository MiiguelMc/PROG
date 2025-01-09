
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int[][] num;
        num = new int[4][5];
        int sumar = 0;
        for (int i = 0; i < num.length; i++) {
            System.out.println("Tabla " + (i + 1));
            for (int j = 0; j < num[i].length; j++) {
                int temporal = Integer.parseInt(System.console().readLine());
                num[i][j] = temporal;
                sumar = temporal + sumar ;
            }
        }
        for (int i = 0; i < num.length; i++) {
            System.out.print(" " + (i + 1) + " ");
            for (int j = 0; j < num[i].length; j++) {
                System.out.print(" " + num[i][j] + " ");
            }
            System.out.print(" Fila "+(i+1));
            System.out.println(" ");
        }
        System.out.print(sumar);
    }
}
