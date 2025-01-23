public class ordenador extends Dispositivos implements Encendido {
    String ram;
    String procesador;
    String disco;
    String programa;
    boolean encendido = false;

    ordenador(String ram, String procesador, String disco, String programa, String marca) {
        super(marca);
        this.ram = ram;
        this.procesador = procesador;
        this.disco = disco;
        this.programa = programa;
        this.encendido = false;
    }

    @Override
    public String toString() {

        return "Ordenador : " + marca + " RAM" + ram + " Procesador " + procesador + " Discos " + disco + " Software "
                + programa + " Encedido " + encendido;
    }

    public void encender() {
        encendido = true;
        programa = "Navegador";

    }

    public void apagar() {
        encendido = false;
        programa = "";
    }
}
