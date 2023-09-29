
package prueba_elcorteIslandes;

//La empresa El TarjetaRegalo Islandés nos ha encargado una aplicación para gestionar las tarjetas regalo.
//Como primer paso para implementar la aplicación, es necesario crear la clase principal. 
//Implementa la clase TarjetaRegalo. Cuando se crea una nueva tarjeta, se le da un saldo y 
//se asigna de forma automática un número de 5 dígitos. Si se intenta gastar más dinero del 
//que tiene la tarjeta, se debe mostrar un mensaje de error. Dos tarjetas regalo se pueden 
//fusionar creando una nueva tarjeta con la suma del saldo que tenga cada una y un nuevo número 
//aleatorio de 5 cifras. Al fusionar dos tarjetas en una, las dos tarjetas originales se quedarían con 0 € de saldo.


import java.text.DecimalFormat;


public class TarjetaRegalo {
   
//crear los atributos
      String numero;
  double saldo;

  public TarjetaRegalo(double saldo) {
    this.saldo = saldo;
    
 // Genera un número de tarjeta aleatorio de 5 cifras
    this.numero = "";
    for (int i = 0; i < 5; i++) {
      this.numero += (int)(Math.random() * 10);
    }
  }

  @Override
  public String toString() {
    DecimalFormat dosDecimales = new DecimalFormat("0.00");
    return "Tarjeta nº " + numero + " - Saldo " + dosDecimales.format(saldo) + "€";
  }

  void gasta(double gasto) {
    if (gasto > saldo) {
      System.out.printf("No tiene suficiente saldo para gastar ", gasto);
    } else {
      saldo -= gasto;
    }
  }

  TarjetaRegalo fusionaCon(TarjetaRegalo t) {
    double nuevoSaldo = this.getSaldo() + t.getSaldo();
    this.setSaldo(0);
    t.setSaldo(0);
    return new TarjetaRegalo(nuevoSaldo);
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  public double getSaldo() {
    return saldo;
  }  
}

