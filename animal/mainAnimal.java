
package animal;

import java.util.Scanner;


public class mainAnimal {
    
    public static void main(String[] args) {
        Mamifero garfield=new Gato();
        Animal scooby= new Perro();
        Mamifero garfield2= new Gato();
        Mamifero garfield3;
        
        Canario piolin=new Canario();
        
        
        Perro perro=new Perro();
        
        System.out.println("como se llama tu gato?");
        
        
        
        perro.reproducirseCon('n');
        
        //establecemos que el gato se ponga a andar y a comer
        garfield.andar();
        garfield.comer();
        garfield.reproducirse();
        piolin.volar('s');
        
       
        
        
        
        //el gato no me deja introducir un felino
      
        
        Scanner entrada= new Scanner (System.in);
        char felino=entrada.next().charAt(0);
        Mamifero gato=new Gato(felino);
        gato.reproducirse();
        garfield.reproducirse();
    }
    
}
