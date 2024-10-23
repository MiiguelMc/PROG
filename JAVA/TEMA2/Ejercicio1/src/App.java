public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Dime un dia de la semana y te digo que tienes a primera");
        String dia = System.console().readLine();
        switch (dia) {
            case "lunes":
                System.out.println("Entorno de desarrollo");
                break;
            case "martes":
                System.out.println("Digitalizacion");
                break;
            case "miercoles":
                System.out.println("Lenguaje de Marca");
                break;
            case "jueves":
                System.out.println("Lenguaje de marca");
                break;
            case "viernes":
                System.out.println("Base de datos");
                break;
            default:
                System.out.println("No ha elegido correctamente un día o has dicho otra cosa");
        }
    }
}