public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Validador de Contraseñas");
        String contraseña = System.console().readLine();
        int i = 0;
        int x = 0;
        while (i < 3) {
            if (tamaño(contraseña)) {
                x++;
                i+= 3;
            }
            i++;
        }
        if (i == 3 && x == 0) {
            System.out.println("\033[0;93m Numero Maximo de intentos alcanzados\033[0m\"");
        } else if (i <= 3 && x == 1) {
            System.out.println(contraseña);
            System.out.println("\033[0;92mContraseña Segura \033[0m\"");
        }
    }

    // if (minuscula(contraseña)) {
    // i++;
    // System.out.println("Si es ");
    // }
    // contraseña = System.console().readLine();
    // i++;
    // }

    // Aqui damos el valor de que se ha mayor a 8 caracteres
    public static boolean tamaño(String tamaño) {
        for (int i = 7; i <= tamaño.length();) {
            return true;
        }
        return false;
    }
}