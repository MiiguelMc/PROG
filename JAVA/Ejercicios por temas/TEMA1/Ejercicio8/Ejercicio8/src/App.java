import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ejer1 = new Scanner(System.in);
        System.out.println("Hola, Dame tu nombre porfavor");
        String nombre = ejer1.nextLine();
        System.out.println("Ahora dime el producto");
        String articulo = ejer1.nextLine();
        System.out.println("Ahora dime que la cantidad");
        int cantidad = Integer.parseInt(ejer1.nextLine()); 
        System.out.println("Cuanto es el coste unitario");
        float coste = Float.parseFloat(ejer1.nextLine());
        float TotalSIm;
        float total;
        //Calcular total sin impuesto
        TotalSIm = cantidad * coste;
        float iva;
        //Iva lo de float lo cambio VSCODE
        iva = (float) (TotalSIm * 0.21);
        //Precio Total IVA * totalSIm
        total = TotalSIm + iva;
        System.out.println("┌───────────────────┬───────────────────┐");
        System.out.printf("│%-19s│%19.10s│\n" , "Cliente" , nombre);
        System.out.printf("│%-19s│%19.10s│\n" ,"Producto" , articulo);
        System.out.printf("│%-19s│%19d│\n" ,"Cantidad", cantidad);
        System.out.printf("│%-19s│%19.2f│\n","Precio Unitario", + coste);
        System.out.printf("│%-19s│%19.2f│\n", "Total sin Impuesto" , + TotalSIm);
        System.out.println("│───────────────────┼───────────────────│");
        System.out.printf("│%-19s│%19.2f│\n" ,"IVA", iva);
        System.out.println("│───────────────────┼───────────────────│");
        System.out.printf("│%-19s│%19.2f│\n" ,"Precio con impuesto", total);
        System.out.println("└───────────────────────────────────────┘");

    }
}
