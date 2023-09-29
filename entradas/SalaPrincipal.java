
package entradas;


public class SalaPrincipal extends Expocoches {
private  int salaPrincipal ;
private int totalSalaPrincipal;

    public SalaPrincipal() {
        super();
        this.salaPrincipal=1000;
        
        
        
    }

   

   
@Override
    public void ventaEntradas(int entradas) {
       if (entradas<salaPrincipal){
           System.out.println("has vendido " + entradas + " entradas");
           salaPrincipal -=entradas;
           
           
           
           System.out.println("en la sala principal quedan "+ salaPrincipal);
           
           System.out.println("te quedan en la sala Principal un total de "+ salaPrincipal + " entradas");
           
           
           
           
       } else {System.out.println(" no te quedan entradas para vender ");
           
           
       
       
           
        
    }
   




}

}
