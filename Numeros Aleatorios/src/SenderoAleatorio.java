public class SenderoAleatorio {

    public static void main(String[] args) {
        int largoSendero = 20; // Número de metros del sendero (puedes modificarlo)
        char obstaculo; // Para determinar el tipo de obstáculo (* o O)

        for (int i = 0; i < largoSendero; i++) {
            // Imprimimos los bordes
            System.out.print("|");

            // Imprimimos los 4 caracteres del medio
            for (int j = 0; j < 4; j++) {
                if (Math.random() < 0.5) {
                    System.out.print(" "); // Espacio en el medio
                } else {
                    // Si hay un obstáculo
                    if (Math.random() < 0.5) {
                        // Hay un obstáculo en esta línea
                        obstaculo = Math.random() < 0.5 ? '*' : 'O'; // Determinamos el tipo de obstáculo
                        System.out.print(obstaculo);
                    } else {
                        System.out.print(" "); // Sin obstáculo
                    }
                }
            }
            
            // Imprimimos el borde final
            System.out.println("|");

        }
    }
}
