
package Gatos;

import java.util.Scanner;



public class PruebaGatos {
    
    public static void main(String[] args) {
        
        Gato [] gato = new Gato[3];
        Scanner entrada= new Scanner(System.in);
        String nombre,color,raza;
        
    
  
        
        //recorremos el array
        for (int i =0;i<gato.length;i++){
            
            System.out.println("introduce los datos del Gato");
            System.out.println("introduce la nombre");
            nombre=entrada.nextLine();
            gato[i].setNombre(nombre);
            
            System.out.println("introduce la color");
            color=entrada.nextLine();
           gato[i].setColor(color);
            System.out.println("introduce el raza");
            raza=entrada.nextLine();
            gato[i].setRaza(raza);
          
            
            
        }
        
//        for (Gato array2 : arrayGato){
//            System.out.println(array2);
//        }
       for(int i =0;i<gato.length;i++){
           System.out.println(gato[i].getNombre());
           System.out.println(gato[i].getColor());
           System.out.println(gato[i].getRaza());
       }
    }
    
}
