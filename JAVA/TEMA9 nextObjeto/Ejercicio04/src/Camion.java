public class Camion extends Vehiculo {
    public int cargaMax;

    Camion(double precioMercado, int año, int totalVehiculos , int cargaMax) {
        super(precioMercado, año, totalVehiculos);
        this.cargaMax = cargaMax;
    }

}
