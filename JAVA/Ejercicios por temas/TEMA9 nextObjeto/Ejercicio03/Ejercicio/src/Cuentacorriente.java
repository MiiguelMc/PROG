public class Cuentacorriente extends CuentaBancaria implements Operables {

    Cuentacorriente(double tipoInteres, double saldo, String numeroCuenta) {
        super(tipoInteres, saldo, numeroCuenta);

    }

    public void calcularInteres() {
        System.out.println("Tu cuenta tendria que pagar  un interes " + saldo * (tipoInteres / 100));
    }

    public void mostrarResultado() {
        System.out.println("Tu numero de cuenta es " + numeroCuenta + " Tu saldo actual es " + saldo
                + " El tipo de interes es " + tipoInteres);
    }
}
