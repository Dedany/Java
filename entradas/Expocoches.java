
package entradas;

//Queremos gestionar la venta de entradas (no numeradas) de Expocoches Campanillas 
//que tiene 3 zonas, la sala principal con 1000 entradas dispo- nibles, la zona de 
//compra-venta con 200 entradas disponibles y la zona vip con 25 entradas disponibles. 
//Hay que controlar que existen entradas antes de venderlas.

public abstract class Expocoches {
   private  int salaPrincipal;
   private int compraVenta;
   private int zonaVip;
   private int entradasTotales;
   private int entradasVendidas;

    public Expocoches() {
    }

    public int getEntradasTotales() {
        return entradasTotales;
    }

    public int getEntradasVendidas() {
        return entradasVendidas;
    }

   

   
   
 //establecemos metodo de venta de entradas vacio ya que es una clase abstracta y no puede tener cuerpo
  public abstract void ventaEntradas(int entradas);
    
    
 
  
   
   public void totalEntradas(){
       int entradasTotales= salaPrincipal+compraVenta+zonaVip;
   }
   
   
   
   
    
           
       
   }
    

