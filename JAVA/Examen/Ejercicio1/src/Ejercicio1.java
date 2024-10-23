public class Ejercicio1 {
    public static void main(String[] args) throws Exception {
        System.out.print("Ingrese la cantidad de kilómetros:");
        Integer kilometros = Integer.parseInt(System.console().readLine());
        //Aqui hacemos la conversion para saber las millas 
        double millas = (kilometros * 0.621371);
        System.out.println("------------------------------------------------");
        System.out.println("Ingrese la cantidad de kilómetros: " + kilometros);
        System.out.println("Equivalente en millas: \033[43m" + millas + " mi\033[0m");
        System.out.println("------------------------------------------------");
        System.out.println("\033[0mLa conversión se realizó utilizando la fórmula: ");
        //resultado Final 
        System.out.print("\033[41m" + kilometros + "Km\033[0m = ");
        System.out.print("\033[42m" + millas);
        System.out.print(" mi\033[0m");
    }
}
