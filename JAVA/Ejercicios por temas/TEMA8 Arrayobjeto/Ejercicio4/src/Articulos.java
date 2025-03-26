public class Articulos {
    String nombre;
    String Descripcion;
    double precio;
    double preciocompra;

    Articulos(String nombre, String Descripcion, double precio, double preciocompra) {
        this.nombre = nombre;
        this.Descripcion = Descripcion;
        this.precio = precio;
        this.preciocompra = preciocompra;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void Stock(double preciocompra) {
        this.preciocompra = preciocompra;
    }

    public double getStock() {
        return preciocompra;
    }

    public String toString() {

        return "Nombre del articulo " + nombre + " Descripcion breve " + Descripcion
                + " Precio de Venta al publico " + precio + " Precio de compra del articulo al por Mayor "
                + preciocompra;
    }
}
