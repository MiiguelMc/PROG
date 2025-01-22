public class App {
    public static void main(String[] args) throws Exception {
        Vehiculo[] mivehi = new Vehiculo[5];
        mivehi[0] = new Coche("Mercedes", "2222DWK", 23, 3, "No dañado");
        for (int j = 0; j < 99; j++) {

            System.out.println("Vehiculos");
            System.out.println("----------------");
            System.out.println("1º Añadir coche ");
            System.out.println("2º Añadir bicicleta");
            System.out.println("3º Ver vehiculos");
            System.out.println("4º Ver Coches");
            System.out.println("5º Ver bicicletas");
            int eleccion = Integer.parseInt(System.console().readLine());
            switch (eleccion) {
                case 1:
                mivehi[1]= new Coche("Merced5es", "24222DWK", 2333, 33, "Muy dañado");
                                    break;
                                case 2:
                mivehi[2] = new Bicicleta("pepe", "nul", 321, true, "Muy rota");
                                    break;
                                case 3:
                                    for (int i = 0; i < mivehi.length; i++) {
                                        if (mivehi[i] != null) {
                                            System.out.println(mivehi[i]);
                                        }
                                    }
                                    break;
                                case 4:
                
                                    break;
                                case 5:
                
                                    break;
                
                                default:
                                    break;
                            }
                        }
                    }
                

}
