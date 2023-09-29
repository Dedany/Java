
package animal;

public class Canario extends Mamifero {
    boolean vuela;
    String volar;

    @Override
    public void comer() {
      
    }

    @Override
    public void andar() {
       
    }

    @Override
    public void reproducirse() {
         }
    
    
    public void volar(char volar){
        if (volar=='s'|| volar == 'S'){
            vuela=true;
        System.out.println("el mamifero vuela");
    } else 
     {System.out.println("el mamifero non vuela");
     
     }
    }
    
    
    
    
}
