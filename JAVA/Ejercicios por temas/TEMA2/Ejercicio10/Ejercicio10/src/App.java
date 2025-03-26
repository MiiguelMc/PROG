public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Dime un numero de hasta 5 cifras y te digo el primer numero");
        int numero = Integer.parseInt(System.console().readLine());
        if(numero >=0 && numero <=9){
            Integer cifra = numero ;
            System.out.println("La primera cifra de tu numero es "+ cifra);
        }else if (numero >= 10 && numero <= 99) {
            Integer cifra = numero / 10;
            System.out.println("La primera cifra de tu numero es "+ cifra);
        } else if(numero >= 100 && numero <=999) {
            Integer cifra = numero / 100;
            System.out.println("La primera cifra de tu numero es "+ cifra);
        } else if (numero >= 1000 && numero <=9999) {
            Integer cifra = numero / 100;
            System.out.println("La primera cifra de tu numero es "+ cifra);
        } else if(numero >= 10000 && numero <=99999) {
            Integer cifra = numero / 1000;
            System.out.println("La primera cifra de tu numero es "+ cifra);
        }
        
    }
}

