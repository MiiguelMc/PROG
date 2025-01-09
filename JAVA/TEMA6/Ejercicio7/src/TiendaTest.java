public class TiendaTest {
    public static void main(String[] args) throws Exception {
        Producto papas = new Producto("Papas Lays" , 1, "Ricas patatas fritas" );
        System.out.println(papas);
        System.out.println(papas.getPrecio());
        papas.setDescripcion("Patatas sabor Jamon");
    }
}
