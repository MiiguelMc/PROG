public  abstract class CuentaBancaria {
protected double tipoInteres;
protected double saldo;
protected String numeroCuenta;

CuentaBancaria(double tipoInteres,double saldo , String numeroCuenta){
    this.tipoInteres = tipoInteres;
    this.saldo = saldo;
    this.numeroCuenta = numeroCuenta;
}
public void depositar(double deposito){
    saldo = saldo + deposito;
}
public void retirar(double retiro){
    saldo = saldo - retiro;
}
public double toStringSaldo(){
    return saldo;
}
}
