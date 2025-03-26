public abstract class Vehiculo {
    protected double precioMercado;
    protected int año;
    private static int totalVehiculos;

    Vehiculo(double precioMercado, int año, int totalVehiculos) {
        this.precioMercado = precioMercado;
        this.año = año;
        totalVehiculos++;
    }
    public void obtenerTotalVehiculo(){
        System.out.println("Hay un total de " + totalVehiculos + " Vehiculos .");
    }
}
