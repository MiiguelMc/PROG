public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Introduzca el numero de reyes totales");
        int totalesreyes = Integer.parseInt(System.console().readLine());
        System.out.println("Vaya introduciendo los nombres de los reyes y pulsando INTRO.");
        String[] reyes;
        reyes = new String[totalesreyes];
        for (int i = 0; i < reyes.length; i++) {
            String reytest = System.console().readLine();
            reyes[i] = reytest;
        }
        System.out.println("Los reyes Introducidos son ");
        for ( int i = 0; i < reyes.length; i++) {
            int orden = 1;
            //Este basicamente pasa por todos los anteriores 
            for (int j = 0; j < i; j++) {
                if (reyes[i].equals(reyes[j])){
                    orden++;
                }
            }
            System.out.println(" "+reyes[i]+"" + orden);
        }

    }
}
