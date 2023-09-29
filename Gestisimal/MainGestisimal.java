
package Gestisimal;

import java.util.Scanner;


public class MainGestisimal {
    
    
    public static void main(String[] args) {
    Scanner entrada= new Scanner(System.in);
    int opcion;
    int n=100;
    Gestisimal []ges=new Gestisimal[n];
    
    String codigo;
    String descripcion;
    int precioCompra;
    int PrecioVenta;
    int stock;
    int num;
    
    //iniciamos el array
    for(int i =0;i<n;i++){
        ges[i]=new Gestisimal();
    }
    
        
        do{
        System.out.println("ALMACEN");
        System.out.println("_______");
        System.out.println("1 listado");
        System.out.println("2 alta");
        System.out.println("3 baja");
        System.out.println("4 modificación");
        System.out.println("5 entrada mercancía");
        System.out.println("6 salida mercancía");
        System.out.println("7 salir");
        
        System.out.print("elije la opción:    ");
        opcion= entrada.nextInt();
        
        switch (opcion){
            
            case 1:
                System.out.println("Listado");
                System.out.println("_______");
                
                for (Gestisimal g: ges){
                    if (!g.getCodigo().equals("LIBRE")){
                        System.out.println(g);
                    }}
                break;
                    
                    
            
            case 2: 
                
                System.out.println("alta");
                System.out.println("_______");
                
                int i=-1;
                do{ i++;
                
                }while (!((ges[i].getCodigo()).equals("LIBRE")));
               
                System.out.println("introduce el código del artículo ");
                entrada.next();
                        codigo=entrada.nextLine();
                System.out.println("introduce una descripción breve del artículo");
                        descripcion=entrada.nextLine();
                System.out.println("introduce el precio de compra");
                        precioCompra=entrada.nextInt();
                System.out.println("introduce el precio de venta");
                        PrecioVenta=entrada.nextInt();
                System.out.println("cuantos productos son: ?");
                        stock=entrada.nextInt();
                ges[i] =new Gestisimal(codigo, descripcion, precioCompra, PrecioVenta, stock);
                
               
                
                break;
                
            case 3 :
                System.out.println("Baja del producto");
                System.out.println("_________________");
                System.out.println("introduce el codigo que quiere borrar");
                codigo=entrada.nextLine();
          
                   int x=-1;
                   do{
                       x++;
                       
                   }while (!(ges[x].getCodigo()).equals(codigo));
                  ges[x].setCodigo("LIBRE");
                  System.out.println("objeto borrado");
                  
                  break;
                    
            case 4 :
                System.out.println("Modificar el producto");
                System.out.println("_____________________");
                System.out.println("introduce el código del producto que desea modificar:   ");
                entrada.next();
                codigo = entrada.nextLine();
                
                int j =-1;
                do{ j++;
                }while (!(ges[j].getCodigo().equals(codigo)));
                if(ges[j].getCodigo().equals("LIBRE"))
                System.out.println("el código del articulo "+ ges[j].getCodigo());
                System.out.print("introduce el nuevo codigo:  ");
                codigo=entrada.nextLine();
                ges[j].setCodigo(codigo);
                System.out.println("descripcion: "+ges[j].getDescripcion());
                System.out.print("introduce la nueva descripción: ");
                descripcion= entrada.nextLine();
                ges[j].setDescripcion(descripcion);
                System.out.println("el precio de compra es : " +ges[j].getPrecioCompra());
                System.out.print("introduce el nuevo precio de compra: ");
                precioCompra= entrada.nextInt();
                ges[j].setPrecioCompra(precioCompra);
                System.out.println("Precio de la venta es: "+ges[j].getPrecioVenta());
                System.out.println("introduce el precio de la venta:  ");
                PrecioVenta=entrada.nextInt();
                ges[j].setPrecioVenta(PrecioVenta);
                System.out.println("el numero de productos que hay es: "+ges[j].getStock());
                System.out.println("introduce el nuevo numero: ");
                stock=entrada.nextInt();
                
                ges[j].setStock(stock);
                break;
                
            case 5:
                
                System.out.println("entrada del producto");
                System.out.println("____________________");
                System.out.println("introduce el código");
                entrada.next();
                codigo= entrada.nextLine();
                
           
                
                int a=-1;
                do {a++;
                } while (!(ges[a].getCodigo().equals(codigo)));{
                System.out.println("el producto es: "+ges[a].getDescripcion());
                System.out.println("y hay "+ges[a].getStock());
                System.out.println("cuántos productos das de alta");
                num = entrada.nextInt();
                
                ges[a].comprar( num);
              
                
                
            }
                
                
             
                break;
                
            case 6: 
                
                System.out.println("salida de mercancía");
                System.out.println("___________________");
                   System.out.print("introduce el código: ");
                   entrada.next();
                   
                   
                   codigo= entrada.nextLine();
                
                 int b=-1;
                do {b++;
                
                } while (!(ges[b].getCodigo().equals(codigo)));
                
                
                System.out.println("el producto es: "+ges[b].getDescripcion());
                ges[b].vender();
               
//                 System.out.println("cuantos productos vendes");
//                num = entrada.nextInt();
//                
//              ges[b].venta(num);
            }
          
                
        
        }while (opcion!=7);
                
                
    }       
                   
                
       
                

                        
                        
                        
                    }
                        
                    
        
                    
                
                
                
    
   

