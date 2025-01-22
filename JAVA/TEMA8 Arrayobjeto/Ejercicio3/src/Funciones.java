public class Funciones {
    public static void Pedirnumero(int[] numero) {
        System.out.println("Te voy a pedir numeros porfavor indique numeros enteros");
        int i = 0;
        while (i < numero.length) {
            System.out.print("Dime un numero porfavor ");
            numero[i] = Integer.parseInt(System.console().readLine());
            i++;
        }

    }

    public static void Escribirnumero(int[] numero) {
        System.out.println("Estos son los numeros que has indicado");
        for (int i = 0; i < numero.length; i++) {
            System.out.print(numero[i] + " ");

        }

    }

    public static void pasarCincuentado(int[] numero) {

        System.out.println("\n Ahora vamos a pasar todos los numero a que sean divisibles por 5 ");
        for (int i = 0; i < numero.length; i++) {
            if (numero[i] % 5 != 0) {
                while (numero[i] % 5 != 0) {
                    numero[i] = numero[i] + 1;
                }
            }
        }

    }
    public static void Escribirnumeroyahechos(int[] numero) {
        System.out.println("Estos son los numeros que has indicado y pasados a ciencuentados");
        for (int  i = 0; i < numero.length; i++) {
            System.out.print (numero[i] +" ");
            
        }
        
    }

}
