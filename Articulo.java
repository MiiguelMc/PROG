public class Articulo {
    String codigo;
    String descripcion;
    double preciocompra;
    double precioventa;
    int stock;

    Articulo(String descripcion, String codigo, double preciocompra, double precioventa, int stock) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.preciocompra = preciocompra;
        this.precioventa = precioventa;
        this.stock = stock;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setPreciocompra(double preciocompra) {
        this.preciocompra = preciocompra;
    }

    public double getPreciocompra() {
        return preciocompra;
    }

    public void setPrecioventa(double precioventa) {
        this.precioventa = precioventa;
    }

    public double getPrecioventa() {
        return precioventa;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public String toString() {

        return ("Nombre del producto " + codigo + " descripcion " + descripcion + " precio de compra " + preciocompra
                + "precio Venta " + precioventa + "Stock" + stock);
    }



}
