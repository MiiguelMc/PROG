public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Voy a calcular tu Salario");

        System.out.println("Dime las horas que has trabajado este Semana");
        int horas = Integer.parseInt(System.console().readLine());

        System.out.println("Dime tu cuanto cobras por hora");
        double sueldo = Integer.parseInt(System.console().readLine());

        System.out.println("estos es lo que cobras en una semana " +( horas *sueldo));
            if (sueldo<8.28){
                System.out.println("No llegas al sueldo minimo por 40 horas trabajada");
             } else {
                System.out.println("LLegas a el sueldo minimo por 40 horas trabajada ");

                    }

        }

        

        }