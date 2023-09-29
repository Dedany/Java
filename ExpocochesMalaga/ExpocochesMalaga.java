
package ExpocochesMalaga;


public class ExpocochesMalaga {
    
    public static void main(String[] args) {
        
        
        Zona principal=new Zona(1000);
        Zona compraVenta= new Zona(200);
        Zona vip =new Zona(25);
        
        
        int opcion = 0;
        int opcion2 = 0 ;
        int n= 0;
        
        
        do{
            System.out.println("\nEXPOCOCHES MÁLAGA");
            System.out.println("1. Mostrar número de entradas libres");
            System.out.println("2. Vender entradas");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            
            opcion =Integer.parseInt(System.console().readLine());
            
            if (opcion== 1 ){
                System.out.println("\n1. Principal");
                System.out.println("2. Compra-Venta");
                System.out.println("3. Vip");
                System.out.println("Elige la zona para la que quieres comprar las entradas ");
                
                opcion2 =Integer.parseInt(System.console().readLine());
                
                System.out.print("¿cuántas entradas quieres?");
                n= Integer.parseInt(System.console().readLine());
                
                switch (opcion2){
                    case 1:
                        principal.vender(n);
                        break;
                    case 2:
                        compraVenta.vender(n);
                        break;
                    case 3:
                        vip.vender(n);
                        break;
                    default:
                }
            }
        } while (opcion < 3);
      }
    }
