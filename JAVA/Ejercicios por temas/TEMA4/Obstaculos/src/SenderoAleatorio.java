public class SenderoAleatorio {

    public static void main(String[] args) {
        int largoSendero = Integer.parseInt(System.console().readLine());
        char obstaculo; 

        for (int i = 0; i < largoSendero; i++) {
            System.out.print("|");
            for (int j = 0; j < 4; j++) {
                if (Math.random() < 0.5) {
                    System.out.print(" ");
                } else {
                    if (Math.random() < 0.5) {
                        obstaculo = Math.random() < 0.5 ? '*' : 'O';
                        System.out.print(obstaculo);
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println("|");
        }
    }
}