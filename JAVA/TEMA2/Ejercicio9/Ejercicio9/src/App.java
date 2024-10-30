
public class App {
    public static void main(String[] args) throws Exception {
        double total = 0;
        System.out.print("Introduzca la base imponible: ");
        double baseimpo = Double.parseDouble(System.console().readLine());
        System.out.print("Introduzca el tipo de iva (general , reducido o superreducido): ");
        String tipoIva = System.console().readLine();
        System.out.print("Introduzca el codigo prómocional (nopro, mitad , meno5 o 5 porc ): ");
        String codPromocional = System.console().readLine();
        //Aqui empezamos creando el ticket 
        System.out.printf("Base Imponible: %10.2f\n",baseimpo);
        switch (tipoIva) {
            case "general":
                //calculamos Iva
                double ivaGeneral= (baseimpo * 0.21);
                total = ivaGeneral + baseimpo ;
                System.out.printf("Iva (21%%):  %5.2f\n", ivaGeneral );
                System.out.printf("Precio con Iva %5.2f\n", (total));
                break;
            case "reducido":
                //calculamos Iva
                double ivaReducido= (baseimpo * 0.10);
                total = baseimpo+ivaReducido ;
                System.out.printf("Iva (10%%):  %5.2f\n", ivaReducido );
                System.out.printf("Precio con Iva %5.2f\n", (total));
                break;
            case "superreducido":
                //calculamos Iva
                double ivaSuperreducido= (baseimpo * 0.04);
                total = baseimpo+ivaSuperreducido;
                System.out.printf("Iva (4%%):  %5.2f\n", ivaSuperreducido);
                System.out.printf("Precio con Iva %5.2f\n", (total));
                break;
            default:System.out.println("Error en los codigos para IVA");
                break;
        }
                
        switch (codPromocional) {
            case "nopro":
                total = total + (0*total);
                System.out.printf("cod promocional (%5s)    %5.2f\n",codPromocional,total);
                break;
            case "mitad":
                total = total - (total/2);
                System.out.printf("cod promocional (%5s)    %5.2f\n",codPromocional,total);
                break;
            case "meno5":
                total = total - 5;
                System.out.printf("cod promocional (%5s)    %5.2f\n",codPromocional,total);
                break;
            case "5porc":
                total = total * 0.5;
                System.out.printf("cod promocional (%5s)    %5.2f\n",codPromocional,(0.5*total));
                break;
            default: 
                System.out.println("Error en los codigos promocionales");
                break;
        }
        System.out.printf("total %10.2f", total);
    }    
}
