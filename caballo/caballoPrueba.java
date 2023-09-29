
package caballo;

import java.util.Scanner;


public class caballoPrueba {
    
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
    String color;
    int velocidadmayor=0;
    //llamamos a los objetos
    
        System.out.println("nombramos a los caballos \n");
    caballo corcel1=new caballo("pedrusco",40);
    caballo corcel2=new caballo ("lusco",90);
    caballo corcel3=new caballo("fusco",10 );
    
        System.out.println("mi caballo se llama "+corcel1.getNombre());
        System.out.println("mi otro caballo se llama "+corcel2.getNombre());
        System.out.println("tenemos un último caballo llamado "+corcel3.getNombre());
        System.out.println("cual es el color de "+corcel1.getNombre());
        corcel1.setColor(entrada.nextLine());
        System.out.println("cual es el color de "+corcel2.getNombre());
        corcel2.setColor(entrada.nextLine());
        System.out.println("cual es el color de "+corcel3.getNombre());
        corcel3.setColor(entrada.nextLine());
        
        System.out.println("\nahora vamos a mandarlos a correr \n");
        
        if(corcel1.velocidad>corcel2.velocidad && corcel1.velocidad>corcel3.velocidad){
            velocidadmayor=corcel1.velocidad;
        } else 
            if(corcel2.velocidad>corcel1.velocidad && corcel2.velocidad>corcel3.velocidad){
                velocidadmayor=corcel2.velocidad;}
            else 
            if (corcel3.velocidad>corcel1.velocidad && corcel3.velocidad>corcel2.velocidad){
                velocidadmayor=corcel3.velocidad;}
        
        if (velocidadmayor==corcel1.velocidad){
            System.out.println(corcel1.toString());
        }
        if (velocidadmayor==corcel2.velocidad){
            System.out.println(corcel2.toString());
        }
        if (velocidadmayor==corcel3.velocidad){
            System.out.println(corcel3.toString());
        }
         
         
                
                
                
            
        
        
        corcel3.Correr(20);
        corcel1.Correr(50);
        corcel2.Comer("paja");
        System.out.println("\nempieza una carrera");
        corcel1.Carrera(corcel3);
        
        System.out.println("\nmandamos al caballo ganador a comer");
        corcel3.Comer("\nespaguettis");
        System.out.println("\ncambiamos la comida a paja");
        corcel3.Comer("paja");
    
        
    }
}
