public class Coche extends Vehiculo {
    public int numeroPuertas;

    Coche(double precioMercado, int año, int totalVehiculos, int numeroPuertas) {
        super(precioMercado, año, totalVehiculos);
        this.numeroPuertas = numeroPuertas;
    }

}

// 2%=0.02
// 20%=0.2
// 0.2%=0.002