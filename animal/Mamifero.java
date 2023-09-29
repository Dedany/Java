
package animal;


public abstract class Mamifero extends Animal{

    public Mamifero(int velocidad, boolean vuela, char volar) {
        this.velocidad = velocidad;
        this.vuela = vuela;
        this.volar = volar;
    }
    
   
  protected int velocidad;
   protected boolean vuela;
   protected char volar;
  

    public Mamifero() {
    }
    
   
    
    
    
  
   
}

