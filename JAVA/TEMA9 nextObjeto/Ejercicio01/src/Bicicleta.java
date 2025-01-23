public class Bicicleta extends Vehiculo {
    int precio;
    boolean ruedines;

    Bicicleta(String Marca, String Matricula, int precio, boolean ruedines, String daños) {
        this.marca = Marca;
        this.matricula = Matricula;
        this.precio = precio;
        this.ruedines = ruedines;
        this.daños = daños;

    }
}
