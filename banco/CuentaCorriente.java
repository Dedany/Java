
package banco;
//    Implementa la clase CuentaCorriente. Cada cuenta corriente tiene un número 
//    de cuenta de 10 dígitos. Para simplificar, el número de cuenta se 
//    genera de forma aleatoria cuando se crea una cuenta nueva. La cuenta se
//    puede crear con un saldo inicial; en caso de no especificar saldo,
//    se pondrá a cero inicialmente. En una cuenta se pueden hacer ingresos y gastos.
//    También es posible hacer una transferencia entre una cuenta y otra. Se permite 
//    el saldo negativo. En el siguiente capítulo se propone un ejercicio como mejora 
//    de éste, en el que se pide llevar un registro de los movimientos realizados.

public class CuentaCorriente {
    
    int saldo;
    String azar;
    

    public CuentaCorriente(int saldo ){
        this.saldo = saldo;
        this.azar="";
                
                // Genera un número de tarjeta aleatorio de 10 cifras
    
    for (int i = 0; i < 10; i++) {
      this.azar += (int)(Math.random() * 10);
        
    }
    

   
    }
    
    

    public CuentaCorriente() {
        this.saldo=0;
        this.azar="";
        
            for (int i = 0; i < 10; i++) {
      this.azar += (int)(Math.random() * 10);
    }
    }
    
    
    
    
    
    public int ingresos(int ingreso){
    saldo +=ingreso;
    return saldo;
}
    
    
    public int gasto(int gasto){
        saldo -= gasto;
        return saldo;
    }
    
    
     void transferencia(CuentaCorriente transferido,int dinero){
        
       saldo -= dinero;
       transferido.saldo +=dinero;
       
        
       
    }

    @Override
    public String toString() {
        return "CuentaCorrient: " + "saldo=" + saldo + ", número " + azar ;
    }

  
   
    
}
