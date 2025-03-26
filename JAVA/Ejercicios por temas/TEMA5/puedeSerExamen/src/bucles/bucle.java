package bucles;

public class bucle {
    public static int detalacual (int random1 , int random2){
        if (random1<random2){
        while (random1!=random2){
            System.out.println(random1);
            random1++; 
        }return random1;
        }else 
        while (random2!=random1) {
            System.out.println(random2);
            random2++;  
        }
                return 0;
        }
    }
