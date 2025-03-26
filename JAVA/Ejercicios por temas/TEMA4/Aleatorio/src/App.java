public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Numeros aleatorios de dado");
        int random = (int)(Math.random()*101);
        int i = 0;
        int numero = Integer.parseInt(System.console().readLine());
        System.out.println(random);
while (numero!=random && i<5) {
    numero = Integer.parseInt(System.console().readLine());
i++;
if (numero!=random){
    System.out.println("Este es tu intento "+ i);
}
}
System.out.println("Has acertado");
}
}
