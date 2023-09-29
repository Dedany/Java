
package Biblioteca;


public class Libro extends Publicacion implements Prestable{
    
    private boolean prestado= false;

    public Libro(String isbn, String titulo, int anyoPublicacion) {
        super(isbn, titulo, anyoPublicacion);
    }

    @Override
   public void presta(){
       if (this.prestado){
           System.out.println("Lo siento , ese libro ya está prestado");
       }else{
           this.prestado=true;
       }
   }
   
    @Override
   public void devuelve(){
       this.prestado=false;
   }

    @Override
    public String toString() {
        return super.toString()+ "("+ (this.prestado ? "prestado" :"no prestado")+ ")";
    }
    
      
    @Override
  public boolean estaprestado() {
    return this.prestado;
   
   
    }
}
    
    
    

