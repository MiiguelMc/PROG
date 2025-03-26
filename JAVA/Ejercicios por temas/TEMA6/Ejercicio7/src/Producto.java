public class Producto {
    String producto;
    double precio;
    String descripcion;
    int Stock;

    public Producto(String producto, double precio, String descripcion) {
        this.producto = producto;
        this.precio = precio;
        this.descripcion = descripcion;
    }
    public String toString() {
        return "El producto es "+producto+" son "+descripcion+" El precio Total es "+precio + "El es stock es " + +;
    }
    public double getPrecio() {
        return precio;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
