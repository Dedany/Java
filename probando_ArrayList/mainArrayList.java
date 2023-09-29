
package probando_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;




public class mainArrayList {
    
   static ArrayList <lista> listanum =new ArrayList<>();
    
    public static void main(String[] args) {
        
       
      int numeros;
      int opcion;
        Scanner entrada=new Scanner(System.in);
        
      do{      
        
            
             
        System.out.println("escribe un número");
        numeros=entrada.nextInt();
        
        
     
        
       lista listanumeros =new lista(numeros);
   listanum.add(listanumeros);
  
   
  
            System.out.println("quieres introducir más números");
            System.out.println("1 si");
            System.out.println("2 no");
            opcion=entrada.nextInt();
            
        } while (opcion==1);
   
        
      
    
      
        
        mostrardatos();
        
            
       
         
      
}
            
            public static void mostrardatos(){
               for(lista listado:listanum){
                System.out.println(listado.toString()); 
            }
    
   
        
            
        
        
        
        
    }
}
    

