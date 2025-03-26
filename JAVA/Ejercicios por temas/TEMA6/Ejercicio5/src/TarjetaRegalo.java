public class TarjetaRegalo {
  private double saldo;
  private int numserie;

  TarjetaRegalo(double saldo) {
    this.saldo = saldo;
    this.numserie = numrandom();

  }

  public int numrandom() {
    int numserie = 0;
    int digito = 0;
    for (int i = 1; i < 5; i++) {
      numserie = numserie * 10;
      digito = (int) (Math.random() * 10);
      numserie = digito + numserie;

    }
    return numserie;
  }

  public void gasta(double gasto) {
    if (saldo < gasto) {
      System.out.println("No puedes , no tienes saldo suficiente ");
    } else {
      saldo = (saldo - gasto);
    }
  }

  public void setsaldo(double saldo) {
    this.saldo = saldo;
  }

  public TarjetaRegalo fusionar(TarjetaRegalo Tarjeta) {
    TarjetaRegalo t3 = new TarjetaRegalo(saldo + Tarjeta.saldo);
    saldo = 0;
    Tarjeta.setsaldo(0);
    return t3;
  }

  public String toString() {
    return "Tarjeta nº" + numserie + " y el saldo actual es " + saldo + "";
  }
}
