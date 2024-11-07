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
            double basica = 10;
            double estandar = 15;
            double premiun = 20;
            int suscripcion = Integer.parseInt(System.console().readLine());
            // Este switch lo que hace es una "factura" personalizada segun los datos
            // introducidos
            switch (suscripcion) {
                case 1:
                    if (edad >= 18 && edad <= 25) {
                        double Total = basica - (basica * 0.2);
                        System.out.println("Resumen de tu registro:");
                        System.out.println("Nombre:" + nombre);
                        System.out.println("Tipo de Suscripción: Básica");
                        System.out.println("Precio Original " + basica + "\u20ac");
                        System.out.println("Descuento aplicado: 20%");
                        System.out.println("Precio Final \033[1;31m" + Total + "\u20ac \033[0m");
                    } else if (edad >= 26 && edad <= 40) {
                        double Total = basica - (basica * 0.1);
                        System.out.println("Resumen de tu registro:");
                        System.out.println("Nombre:" + nombre);
                        System.out.println("Tipo de Suscripción: Básica");
                        System.out.println("Precio Original " + basica + "\u20ac");
                        System.out.println("Descuento aplicado: 10%");
                        System.out.println("Precio Final \033[1;31m" + Total + "\u20ac \033[0m");
                    } else if (edad >= 41) {
                        double Total = basica;
                        System.out.println("Resumen de tu registro:");
                        System.out.println("Nombre:" + nombre);
                        System.out.println("Tipo de Suscripción: Básica");
                        System.out.println("Precio Original " + basica + "\u20ac");
                        System.out.println("Descuento aplicado: 0%");
                        System.out.println("Precio Final \033[1;31m" + Total + "\u20ac \033[0m");
                        System.out.println(
                                " \033[43m ¡Gracias por unirte! Esperamos que disfrutes del contenido básico. \033[0m");
                    }

                    break;
                case 2:
                    if (edad >= 18 && edad <= 25) {
                        double Total = estandar - (estandar * 0.2);
                        System.out.println("Resumen de tu registro:");
                        System.out.println("Nombre:" + nombre);
                        System.out.println("Tipo de Suscripción: Estandar");
                        System.out.println("Precio Original " + estandar + "\u20ac \033[0m");
                        System.out.println("Descuento aplicado: 20%");
                        System.out.println("Precio Final \033[1;31m" + Total + "\u20ac \033[0m");
                    } else if (edad >= 26 && edad <= 40) {
                        double Total = estandar - (estandar * 0.1);
                        System.out.println("Resumen de tu registro:");
                        System.out.println("Nombre:" + nombre);
                        System.out.println("Tipo de Suscripción: Estandar");
                        System.out.println("Precio Original " + estandar + "\u20ac");
                        System.out.println("Descuento aplicado: 10%");
                        System.out.println("Precio Final \033[1;31m" + Total + "\u20ac \033[0m");
                        System.out.println(
                                " \033[43m Buena elección para disfrutar de contenido de calidad a un buen precio. \033[0m");
                    } else if (edad >= 41) {
                        double Total = estandar;
                        System.out.println("Resumen de tu registro:");
                        System.out.println("Nombre:" + nombre);
                        System.out.println("Tipo de Suscripción: Estandar");
                        System.out.println("Precio Original " + estandar + "\u20ac");
                        System.out.println("Descuento aplicado: 0%");
                        System.out.println("Precio Final \033[1;31m" + Total + "\u20ac \033[0m");
                    }
                    break;
                case 3:
                    if (edad >= 18 && edad <= 25) {
                        double Total = premiun - (premiun * 0.2);
                        System.out.println("Resumen de tu registro:");
                        System.out.println("Nombre:" + nombre);
                        System.out.println("Tipo de Suscripción: Premium");
                        System.out.println("Precio Original " + premiun + " \u20ac \033[0m");
                        System.out.println("Descuento aplicado: 20%");
                        System.out.println("Precio Final \033[1;31m " + Total + "\033[0m \u20ac");
                        System.out.println(" \033[43m ¡Felicidades, estás aprovechando al máximo nuestra plataforma! \033[0m");
                    } else if (edad >= 26 && edad <= 40) {
                        double Total = premiun - (premiun * 0.1);
                        System.out.println("Resumen de tu registro:");
                        System.out.println("Nombre:" + nombre);
                        System.out.println("Tipo de Suscripción: Premium");
                        System.out.println("Precio Original " + premiun + "\u20ac");
                        System.out.println("Descuento aplicado: 10%");
                        System.out.println("Precio Final \033[1;31m " + Total + "\u20ac \033[0m");
                    } else if (edad >= 41) {
                        double Total = premiun;
                        System.out.println("Resumen de tu registro:");
                        System.out.println("Nombre:" + nombre);
                        System.out.println("Tipo de Suscripción: Premium");
                        System.out.println("Precio Original " + premiun + "\u20ac");
                        System.out.println("Descuento aplicado: 0%");
                        System.out.println("Precio Final \033[1;31m" + Total + "\u20ac \033[0m");
                    }
                    break;
                default:
                    System.out.println("Has elegido un numero incorrecto");
            }
        }

    }
}
