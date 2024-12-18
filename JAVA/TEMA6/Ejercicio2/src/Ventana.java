public class Ventana {
    String programa;
    int ancho;
    int largo;
    Ventana (int ancho,int largo , String programa){
        this.largo =largo;
        this.ancho = ancho;
        this.programa =programa;
    }
    public void tamañoVentana (int ancho , int largo){
        this.largo =largo;
        this.ancho = ancho;
    }
    public String toString(){
        return "Tu ventana es "+ largo +" de larga ademas de ser de "+ ancho +" de ancho y es del programa "+programa ;
    }
}