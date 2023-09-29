
package Incidencias;


public class pruebaIncidencias {
    public static void main(String[] args) {
        
       
        Control inc1= new Control(1,"No funciona el ratón");
        Control inc2= new Control(2,"Se bloquea la pantalla");
        Control inc3= new Control(23,"Pantallazo azul");
        Control inc4= new Control(43,"No funcionan cascos");
        Control inc5= new Control(54,"Se para el ordenador");
        System.out.println("");
        System.out.println("");
        System.out.println("ESTAS SON LAS INCIDENCIAS DEL DÍA: ");
        System.out.println("___________________________________");
        System.out.println(inc1);
        System.out.println(inc2);
        System.out.println(inc3);
        System.out.println(inc4);
        System.out.println(inc5);
        
        inc2.resolver("cambio de hadware");
        inc5.resolver("problemas con el ventilador,ventilador cambiado");
        inc1.resolver("cambio de ratón");
        System.out.println("");
        System.out.println("");
        
        System.out.println(" CAMBIO DE TURNO DE LOS TÉCNICOS:");
        System.out.println("---------------------------------");
        
        System.out.println(inc1);
        System.out.println(inc2);
        System.out.println(inc3);
        System.out.println(inc4);
        System.out.println(inc5);
        
        System.out.println("ahora mismo hay "+Control.contador+" incidencias activas"); 
        
        
        
        
        
    }
    
    
}
