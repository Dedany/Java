
package Incidencias;


public class Control {
    String codigo=" ";
    String mensaje;
    int puesto;
    String estado;
    static int contador;
   

    public Control(int puesto, String mensaje) {
        this.mensaje = mensaje;
        this.puesto=puesto;
        this.estado="pendiente";
        this.codigo = codigo;
        for (int i =0;i<4;i++){
            this.codigo+=(int)(Math.random()*10);
        }
        contador++;
        
    }
        
        void resolver(String mensaje){
            this.estado="resuelto";
            this.mensaje=mensaje;
            contador--;
        }

    @Override
    public String toString() {
        return "Incidencia "+ codigo+ " - Puesto: "+puesto+" - "+mensaje+ " - "+ estado;
                
    }
        
        
             
            
        }
        
    
    
    
    

