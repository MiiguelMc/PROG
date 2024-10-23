public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("LIBRERIA DE SUEÑOS");
        System.out.println("================================");
        System.out.print("Introduce código de libro: ");
        int codlibro = Integer.parseInt(System.console().readLine());
        System.out.print("Introduce precio: ");
        double Precio = Double.parseDouble(System.console().readLine());
        System.out.print("Introduce unidades vendidas ");
        int cantvend = Integer.parseInt(System.console().readLine());
        System.out.print("Introduce descuento (%) ");
        int descuento = Integer.parseInt(System.console().readLine());

        double totalsinnada = Precio * cantvend;
        double totaldescuento = totalsinnada * descuento / 100;
        double totalcondescuento = totalsinnada + totaldescuento;
        double Iva = (totalcondescuento * 0.16);
        double total = (totalcondescuento + Iva);

        System.out.println("Su ticket:");
        System.out.println("┌────────────────────────────┐");
        System.out.println("│ LIBRERÍA DE SUEÑOS         │");
        System.out.println("├────────────────────────────┤");
        System.out.printf("│ Cód. %-10d %9.2f \u20ac│\n", codlibro, Precio);
        System.out.printf("│ %-2dUDS           %9.2f \u20ac│\n", cantvend, totalsinnada);
        System.out.printf("│ %-2d%%             %9.2f \u20ac│\n", descuento, totaldescuento);
        System.out.printf("│ 16%% IVA         %9.2f \u20ac│\n", Iva);
        System.out.printf("│\033[46m TOTAL           %9.2f \u20ac\033[0m│ \n", total);
        System.out.printf("└────────────────────────────┘");

    }
}
