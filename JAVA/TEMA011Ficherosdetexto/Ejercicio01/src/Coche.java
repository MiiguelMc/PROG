public class Coche implements Serializable{
    private String matricula;
    private String marca;
    private int año;

    Coche(String matricula, String marca, int año) {
        this.matricula = matricula;
        this.marca = marca;
        this.año = año;
    }
    public Coche(String Linea){
        this.deserializar(Linea);
    }
    @Override
    public String serializar(){
        return String.format("%s,%s,%d",this.matricula,this.marca,this.año);
    }
    @Override
    public void deserializar(String linea){
        String[] datos = linea.split(";");
        this.matricula = datos[0];
        this.marca = datos[1];
        this.año = Integer.parseInt(linea);
    }

}
