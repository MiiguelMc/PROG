public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Desayuno Restaurante");
        System.out.print("¿Que has tomado de desayunar? (Palmera,donut o pitufo): ");
        String desayuno = System.console().readLine();

        double precioPalmera = 1.40;
        double precioDonut = 1;
        double pitufoAceite = 1.2;
        double pitufoTortilla = 1.6;
        double zumo = 1.5;
        double cafe = 1.2;
        double total = 0;

        switch (desayuno) {
            case ("palmera"):
                total = total + precioPalmera;
                System.out.println("Tu palmera cuesta : " + precioPalmera + "$");
                break;
            case ("donut"):
                total = total + precioDonut;
                System.out.println("Tu Donut cuesta : " + precioDonut + "$");
                break;
            case ("pitufo"):
                System.out.print("¿Que Pitufo quieres? (aceite o tortilla): ");
                String pitufo = System.console().readLine();
                switch (pitufo) {
                    case ("aceite"):
                        total = total + pitufoAceite;
                        System.out.println("Tu pitufo aceite cuesta : " + pitufoAceite + "$");
                        break;
                    case ("tortilla"):
                        total = total + pitufoTortilla;
                        System.out.println("Tu pitufo Tortilla cuesta : " + pitufoTortilla + "$");
                        break;
                    default:
                        System.out.println("No tenemos ese pitufo/Esta mal escrito");
                        ;
                }
                break;

            default:
                System.out.println("No tenemos ese producto/Esta mal escrito");

        }

        System.out.print("¿Que has tomado de beber? (zumo o café): ");
        String bebida = System.console().readLine();
        switch (bebida) {
            case ("zumo"):
                total = total + zumo;
                System.out.println("Tu zumo cuesta : " + zumo + "$");
                break;
            case "café", "cafe":
                total = total + cafe;
                System.out.println("Tu cafe cuesta : " + cafe + " $");
                break;
            default:
                System.out.println("No tenemos esa bebida/Esta mal escrita");
        }
        System.out.printf("Total desayuno: %5.2f $", total);

    }
}
