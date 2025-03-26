public class Television extends Dispositivos implements Encendido  {
    int diagonal;
    String tecnologia;
    boolean Encendido = false;
    String canal;

    Television(int diagonal, String tecnologia, boolean Encedido, String canal, String Marca) {
        super(Marca);
        this.diagonal = diagonal;
        this.tecnologia = tecnologia;
        this.Encendido = false;
        this.canal = canal;
    }
    public void encender(){
        Encendido = true ;
        canal = "La 1 ";
    }
    public void apagar(){
        Encendido = false ;
        canal = "OFF";
    }
    @Override
    public String toString() {
        
        return "Television Pulgadas " + diagonal+ " Tecnlogia "+tecnologia+"Encendido "+Encendido +"Canal"+canal;
    }
}
