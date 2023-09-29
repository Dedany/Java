
package ExpocochesMalaga;


public class Zona {
    
    
    //creamos el atributo entradasPorVender
    private int entradasPorVender;
    
    public Zona(int entradasEnVenta){
    entradasPorVender=entradasEnVenta;
    }

    public int getEntradasPorVender() {
        return entradasPorVender;
    }
    
    
    
    //vende un número de entradas.
    //comprueba si quedan entradas libres antes de realizar la venta
    //n números de entradas a vender
    
    public void vender(int venta){
         
        if (this.entradasPorVender ==0){//si las entradas por vender son igual a 0
            System.out.println("lo siento, las entradas para esa zona están agotadas");
        } else if (this.entradasPorVender<venta){//si las entradas por vender son menor a las entradas vendidas
            System.out.println("solo me quedan "+ this.entradasPorVender+" entradas para esa zona.");
        }
        
        if (this.entradasPorVender >= venta){
        System.out.println("Aquí tiene sus " + venta + " entradas, gracias.");
    }
}
}
