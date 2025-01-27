public class Gestor {
    public static void main(String[] args) throws Exception {
        System.out.println("Cuentas de ahorros");
        CuentaBancaria[] micuent = new CuentaBancaria[2];
        micuent[0] = new Cuentaahorro(12, 223, "121212");
        micuent[1] = new Cuentacorriente(1, 0, "6739361");
        micuent[1].depositar(162);
        micuent[1].retirar(43);
        for (CuentaBancaria cuenta : micuent) {
            ((Operables) cuenta).mostrarResultado();
        }
    }
}
