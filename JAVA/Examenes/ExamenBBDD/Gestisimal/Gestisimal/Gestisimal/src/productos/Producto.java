package productos;

public class Producto {
    /**
     * @author Miguel Macias 
     * 
     */

    public static final String RED_BRIGHT = "\033[0;91m"; // RED
    public static final String GREEN_BRIGHT = "\033[0;92m"; // GREEN
    public static final String YELLOW_BRIGHT = "\033[0;93m"; // YELLOW
    public static final String RESET = "\033[0m"; // Text Reset
    /**
     * Aqui incializamos las variables para los contructores y los getters y setters  
     */
    private long codigo;
    private String descripcion;
    private double preciocompra;
    private double precioventa;
    private int stock;

    public long getCodigo() {
        return codigo;
    }
    /**
     * Atraves de este String podemos ver los productos  
     */
    @Override
    public String toString() {
        return RED_BRIGHT + "Producto" + RESET + " | codigo=" + codigo + ", | descripcion=" + descripcion
                + ", | preciocompra=" + preciocompra
                + ", | precioventa=" + precioventa + ", | stock=" + stock;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }
    /**
     * Aqui tenemos el contructor "normal"
     */
    public Producto(long codigo, String descripcion, double preciocompra, double precioventa, int stock) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.preciocompra = preciocompra;
        this.precioventa = precioventa;
        this.stock = stock;
    }
    /**
     * Con este desde un producto podemos crear un nuevo producto totalmente igual 
     */
    public Producto(Producto producto) {
        this.codigo = producto.codigo;
        this.descripcion = producto.descripcion;
        this.preciocompra = producto.preciocompra;
        this.precioventa = producto.precioventa;
        this.stock = producto.stock;
    }
    /**
     * Esto son getters y setter normales sin ningun cambio 
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPreciocompra() {
        return preciocompra;
    }

    public void setPreciocompra(double preciocompra) {
        this.preciocompra = preciocompra;
    }

    public double getPrecioventa() {
        return precioventa;
    }

    public void setPrecioventa(double precioventa) {
        this.precioventa = precioventa;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

}