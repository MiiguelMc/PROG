public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\033[42m ¡Bienvenido/a a la plataforma digital! \033[0m");
        System.out.println(" ");
        // Aqui empezamos a pedir las variables necesarias para el registro
        System.out.print("Por favor, dinos tu nombre: ");
        String nombre = System.console().readLine();
        System.out.print("Por favor, dinos tu edad: ");
        int edad = Integer.parseInt(System.console().readLine());
        // Con este codigo quitamos a los que tengan menos de 18
        if (edad < 18) {
            System.out.print("No te puedes resgistrar en esta plataforma");
        } else {
            System.out.println(" ");
            System.out.println("¡Gracias por registrarte, " + nombre + "!");
            System.out.println("Selecciona el tipo de suscripción que deseas:");
            System.out.println("1. Básica - 10 \u20ac");
            System.out.println("2. Estándar - 15 \u20ac");
            System.out.println("3. Premium - 20 \u20ac");
            // aqui le ponemos valor a las variables para mas tarde usarlas
            int suscripcion = Integer.parseInt(System.console().readLine());
            double basica = 10;
            double estandar = 15;
            double premiun = 20;
            int descuento = 0 ;
            double Total = 0;
            String textofinal = "Gracias por registrarte en nuestra plataforma.";
            // Este switch lo que hace es una "factura" personalizada segun los datos
            // introducidos
            switch (suscripcion) {
                case 1:
                System.out.println("Resumen de tu registro:");
                System.out.println("Nombre:" + nombre);
                System.out.println("Tipo de Suscripción: Básica");
                System.out.println("Precio Original " + basica + "\u20ac");
                    if (edad >= 18 && edad <= 25) {
                        Total = basica - (basica * 0.2);
                        descuento = 20 ;
                    } else if (edad >= 26 && edad <= 40) {
                        Total = basica - (basica * 0.1);
                        descuento = 10;
                    } else if (edad >= 41) {
                        Total = basica;
                        descuento = 0;
                        textofinal = "¡Gracias por unirte! Esperamos que disfrutes del contenido básico.";
                    }
                    System.out.println("Precio Final \033[1;31m" + Total + "\u20ac \033[0m");
                    System.out.println("Descuento aplicado:" + descuento + "%");
                    System.out.println("\033[43m "+ textofinal +"\033[0m");
                    break;
                case 2:
                System.out.println("Resumen de tu registro:");
                System.out.println("Nombre:" + nombre);
                System.out.println("Tipo de Suscripción: Estandar");
                System.out.println("Precio Original " + estandar + "\u20ac \033[0m");
                    if (edad >= 18 && edad <= 25) {
                        Total = estandar - (estandar * 0.2);
                        descuento = 20;
                    } else if (edad >= 26 && edad <= 40) {
                        textofinal =  "Buena elección para disfrutar de contenido de calidad a un buen precio."; 
                        Total = estandar - (estandar * 0.1);
                        descuento = 10;
                    } else if (edad >= 41) {
                        Total = estandar;
                    }
                    System.out.println("Descuento aplicado: "+ descuento + "%");
                    System.out.println("Precio Final \033[1;31m" + Total + "\u20ac \033[0m");
                    System.out.println("\033[43m "+ textofinal +"\033[0m");
                    break;
                case 3:
                System.out.println("Resumen de tu registro:");
                System.out.println("Nombre:" + nombre);
                System.out.println("Tipo de Suscripción: Premium");
                System.out.println("Precio Original " + premiun + " \u20ac \033[0m");
                    if (edad >= 18 && edad <= 25) {
                        Total = premiun - (premiun * 0.2);
                        descuento = 20 ;
                        textofinal = "¡Felicidades, estás aprovechando al máximo nuestra plataforma!";
                    } else if (edad >= 26 && edad <= 40) {
                        Total = premiun - (premiun * 0.1);
                        descuento = 10;
                    } else if (edad >= 41) {
                        Total = premiun;
                    }
                    System.out.println("Descuento aplicado: "+ descuento + "%");
                    System.out.println("Precio Final \033[1;31m" + Total + "\u20ac \033[0m");
                    System.out.println("\033[43m "+ textofinal +"\033[0m");
                    break;
                default:
                    System.out.println("Has elegido un numero incorrecto");
            }
        }
    }
}
