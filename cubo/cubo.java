
package cubo;


public class cubo {
    
    
    int capacidad;
    int contenido;
    
    
    //constructor 

    public cubo(int c) {
        this.capacidad = c;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public int getContenido() {
        return contenido;
    }

    public void setContenido(int contenido) {
        this.contenido = contenido;
    }
    
   //otros metodos
    
    void vacia(){
        this.contenido=0;
    }
    
    //llena el cubo al maximo
    
    void llena(){
        this.contenido=this.capacidad;
    }
    
    
    void pinta( ){
        for (int i= this.capacidad;i>0;i--){
            if (this.contenido>=i){
                System.out.println("#~~~~~~~#");
            }else{
                System.out.println("#       #");
            }
        }
        System.out.println("#########");
            
    }
    
    
    void vuelcaEn(cubo destino){
        int libres=destino.getCapacidad() - destino.getContenido();
        
        if (libres >0){
            if (this.contenido <=libres){
                destino.setContenido(destino.getContenido() + this.contenido);
                this.vacia();
            } else{
                this.contenido= libres;
                destino.llena();
            }
        }
    }
    
}
