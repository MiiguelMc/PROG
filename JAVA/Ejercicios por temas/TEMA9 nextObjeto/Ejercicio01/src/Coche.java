public class Coche extends Vehiculo {
    int kilometros;
    int precio;

    public Coche(String Marca, String Matricula, int kilometros, int precio, String daños) {
        this.marca = Marca;
        this.matricula = Matricula;
        this.kilometros = kilometros;
        this.precio = precio;
        this.daños = daños;

    }

    @Override
    public String toString() {

        return matricula + " " + marca + " " + kilometros + " " + precio + " " + daños;
    }
}
