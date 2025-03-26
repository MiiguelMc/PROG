package primo;

public class Primero {
    public static boolean solucionPrimo(int a ){
    int i = 0;
    for ( i = 2 ; i < a; i++ ){
        if (a%i==0){
            return false ;}
    }return true;
}
}