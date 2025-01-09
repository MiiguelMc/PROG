public class fichasdomino {
    private int lado1;
    private int lado2;

    fichasdomino(int a, int b) {
        this.lado1 = a;
        this.lado2 = b;
    }
    public String quitar0(int num){
        if(num==0){
            return " ";
        }else {
            return "" + num;
        }
    } 

    public String toString() {
        return "[" + quitar0(lado1)+ "|" + quitar0(lado2) + "]";
    }

    public String Voltea() {
        return "[" + quitar0(lado2)+ "|" + quitar0(lado1) + "]";
    }

    public int getLado1() {
        return lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public boolean encaja(fichasdomino f2) {
        if (lado1 == f2.getLado1() || lado1 == f2.getLado1() || lado2 == f2.getLado1() || lado2 == f2.getLado2()) {
            return true;
        } else {
            return false;
        }
    }
    
    
}
