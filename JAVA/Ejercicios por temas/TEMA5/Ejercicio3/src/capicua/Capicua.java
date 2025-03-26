package capicua;

public class Capicua {
    public static boolean Escapicua(int a) {
        int volteado = 0;
        int b = a ;
        while (0 < a) {
            volteado = volteado * 10 + (a % 10);
            a = a / 10;
        }
        if (volteado != b) {
            return false;
        }else{
        return true;
        }
    }

}
