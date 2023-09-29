
package animal;


public class Gato extends Mamifero{
    
    
    protected boolean mahullar;
    protected int vidas;
    protected boolean gato;
    protected char felino;

    
    public Gato() {
    }

    public Gato(char felino, int velocidad, boolean vuela, char volar) {
        super(velocidad, vuela, volar);
        this.felino = felino;
    }

    public Gato(char felino) {
        this.felino = felino;
    }
    

    
    
    
    
    
    @Override
     public  void comer(){
         System.out.println("el Gato come sobras y bebe leche");
         
     }
    
    @Override
    public  void andar(){
        System.out.println("el gato anda con cuatro patas");
    }
    
    
    public void sisi(){
        System.out.println("sisis");
    }
    
   
       
 

    @Override
    public void reproducirse() {
            if (felino=='s'||felino =='S'){
            gato=true;
            System.out.println("el gato se reproduce con otro gato");
        }else {System.out.println("el gato solo se reproduce con otro gato");
        gato = false;
        }
    }

    public void setFelino(char felino) {
        this.felino = felino;
    }
    
   
    }
    

