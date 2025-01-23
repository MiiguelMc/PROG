public abstract class Dispositivos {
    protected String marca;
    private static int contadorDisp;

    Dispositivos(String marca) {
        this.marca = marca;
        contadorDisp++;
    }

    public static int getContadorDisp() {
        return contadorDisp;
    }

    public void setContadorDisp(int contadorDisp) {
        Dispositivos.contadorDisp = contadorDisp;
    }

    public String toString() {
        return "Dispositivo : Marca " + marca;
    }
}
