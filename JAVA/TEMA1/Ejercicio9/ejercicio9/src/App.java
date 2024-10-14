
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner bloq2 = new Scanner(System.in);
        //Datos personales 
       System.out.print("Hola , Dime tu nombre porfavor: ");
       String nombre = bloq2.nextLine();
       System.out.print("Buenas dime la direccion de tu casa: ");
       String Direccion = bloq2.nextLine();
       System.out.print("Porfavor deme su numero de telofono: ");
       //Por si pone numeros con prefijo mas uso string ya que solo lo voy a exponer en pantalla ya que es el numero 
       String telefono = bloq2.nextLine();
//1º producto
       System.out.print("Digame el nombre del 1º producto:  ");
       String nomb1 = bloq2.nextLine();
       System.out.print("Digame el precio del 1º producto: ");
       double preciounidad1 = bloq2.nextLong();
       System.out.print("Digame la cantidad del 1º producto: ");
       int cant1 = bloq2.nextInt();
       bloq2.nextLine();
       
       double total1 = (cant1 * preciounidad1);

//2º producto
       System.out.print("Digame el nombre del 2º producto: ");
       String nomb2 = bloq2.nextLine();
       System.out.print("Digame el precio del 2º producto: ");
       double preciounidad2 = bloq2.nextLong();
       System.out.print("Digame la cantidad del 2º producto: ");
       int cant2 = bloq2.nextInt();
       bloq2.nextLine();
       double total2 = (cant2 * preciounidad2);
//3º producto
       System.out.print("Digame el nombre del 3º producto: ");
       String nomb3 = bloq2.nextLine();
       System.out.print("Digame el precio del 3º producto: ");
       double preciounidad3 = bloq2.nextLong();
       System.out.print("Digame la cantidad del 3º producto: ");
       int cant3 = bloq2.nextInt();
       bloq2.nextLine();
       double total3 = (cant3 * preciounidad3);
       double tSinImpuestos = (total1+total2+total3);
       double Impuesto = tSinImpuestos * 0.18 ;
       //En el ticket del ejercicio sale que es un 10% pero en el ejercicio escrito pone que es un 5%
       double descuento = tSinImpuestos * 0.05;
       double TotalAPagar = tSinImpuestos + Impuesto - descuento;
// Aqui empieza la factura
        System.out.println("-------------------------------");
        System.out.println("          FACTURAS             ");
        System.out.println("-------------------------------");
        System.out.println("Cliente: " + nombre );
        System.out.println("Direccion: " + Direccion );
        System.out.println("Telefono: " + telefono );
        System.out.printf("%-19s %-19s %-19s %-19s\n", "Producto" , "Precio Unitario" , "Cantidad" , "Total Parcial" );
        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.printf("%-19s %-19.2f %-19d %-19.2f\n", nomb1,preciounidad1,cant1,total1 );
        System.out.printf("%-19s %-19.2f %-19d %-19.2f\n", nomb2,preciounidad2,cant2,total2 );
        System.out.printf("%-19s %-19.2f %-19d %-19.2f\n", nomb3,preciounidad3,cant3,total3 );
        System.out.println("----------------------------------------------------------------------------------------------");
        //Aqui empezamos con los subtotal e impuestos 
        System.out.printf("%-19s %19s %19.2s %-19.2f\n", "Subtotal:"," "," ",tSinImpuestos );
        System.out.printf("%-19s %19s %19.2s %-19.2f\n", "Impuesto (%18) :"," "," ", Impuesto );
        System.out.printf("%-19s %19s %19.2s %-19.2f\n", "Descuento (%10) :"," "," ", descuento );
        System.out.println("----------------------------------------------------------------------------------------------");
//Aqui tenemos el Total a pagar lo que seria el final del ejercicio 
       System.out.printf("%-19s  %19s %19.2s %-19.2f\n", "Total a Pagar:"," "," ",TotalAPagar);

    }
}
