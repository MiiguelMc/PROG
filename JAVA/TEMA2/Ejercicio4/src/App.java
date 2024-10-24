public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Dime un mes y un dia y te digo el horoscopo");
        System.out.println("Dime el mes de nacimiento en minuscula ");
        String mes = System.console().readLine();
        System.out.println("Dime el día de nacimiento");
        int dia = Integer.parseInt(System.console().readLine());
        switch (mes) {
            case ("enero"):
                if (dia >= 1 && dia <= 19)
                    System.out.println("Capricornio");
                else if (dia >= 20 && dia <= 31) {
                    System.out.println("Acuarios");
                } else {
                    System.out.println("Tu Día no esta en este mes");
                }
                break;
            case ("febrero"):
                if (dia >= 1 && dia <= 18)
                    System.out.println("Acuario");
                else if (dia >= 19 && dia <= 29) {
                    System.out.println("Piscis");
                } else {
                    System.out.println("Tu Día no esta en este mes");
                }
                break;
            case ("marzo"):
                if (dia >= 1 && dia <= 11)
                    System.out.println("Acuarios");
                else if (dia >= 12 && dia <= 31) {
                    System.out.println("Piscis");
                } else {
                    System.out.println("Tu Día no esta en este mes");
                }
                break;
            case ("abril"):
                if (dia >= 1 && dia <= 19)
                    System.out.println("aries");
                else if (dia >= 20 && dia <= 30) {
                    System.out.println("Tauro");
                } else {
                    System.out.println("Tu Día no esta en este mes");
                }
                break;
            case ("mayo"):
                if (dia >= 1 && dia <= 20)
                    System.out.println("Tauro");
                else if (dia >= 21 && dia <= 31) {
                    System.out.println("Géminis");
                } else {
                    System.out.println("Tu Día no esta en este mes");
                }
                break;
            case ("junio"):
                if (dia >= 1 && dia <= 20)
                    System.out.println("Géminis");
                else if (dia >= 21 && dia <= 30) {
                    System.out.println("Cáncer");
                } else {
                    System.out.println("Tu Día no esta en este mes");
                }
                break;
            case ("Julio"):
                if (dia >= 1 && dia <= 22)
                    System.out.println("Cáncer");
                else if (dia >= 21 && dia <= 31) {
                    System.out.println("Leo");
                } else {
                    System.out.println("Tu Día no esta en este mes");
                }
                break;
            case ("agosto"):
                if (dia >= 1 && dia <= 22)
                    System.out.println("Leo");
                else if (dia >= 23 && dia <= 31) {
                    System.out.println("Virgo");
                } else {
                    System.out.println("Tu Día no esta en este mes");
                }
                break;
            case ("septiembre"):
                if (dia >= 1 && dia <= 22)
                    System.out.println("Virgo");
                else if (dia >= 23 && dia <= 30) {
                    System.out.println("Libra");
                } else {
                    System.out.println("Tu Día no esta en este mes");
                }
                break;
            case ("octubre"):
                if (dia >= 1 && dia <= 23)
                    System.out.println("Libra");
                else if (dia >= 23 && dia <= 31) {
                    System.out.println("Escorpio");
                } else {
                    System.out.println("Tu Día no esta en este mes");
                }
                break;
            case ("noviembre"):
                if (dia >= 1 && dia <= 21)
                    System.out.println("Escorpio");
                else if (dia >= 22 && dia <= 30) {
                    System.out.println("Sagitario");
                } else {
                    System.out.println("Tu Día no esta en este mes");
                }
                break;
            case ("Diciembre"):
                if (dia >= 1 && dia <= 21)
                    System.out.println("Sagitario");
                else if (dia >= 20 && dia <= 31) {
                    System.out.println("Capricornio");
                } else {
                    System.out.println("Tu Día no esta en este mes");
                }
                break;
            default:
                System.out.println("No has puesto bien el dia");
        }
    }
}
