public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Dime La nota que has sacado en el examen");
        float nota = Float.parseFloat(System.console().readLine());
        System.out.println("Que nota quieres sacar en el trimestre?");
        float quiero = Float.parseFloat(System.console().readLine());        
        float nota2 = ((quiero * 100) - (nota * 40)) / 60;
        System.out.println("La nota que necesitas en el segundo examen es  ® " + nota2  );

    }
}
