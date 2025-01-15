public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Numero Cincuentado");
        int[] Cincuentado;
        Cincuentado = new int[15];
        Funciones.Pedirnumero(Cincuentado);
        
        Funciones.Escribirnumero(Cincuentado);

        Funciones.pasarCincuentado(Cincuentado);

        Funciones.Escribirnumeroyahechos(Cincuentado);
    }
}
