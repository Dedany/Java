
package ColeccionDeDiscos.nuevaInformacion;

import java.util.Scanner;


public class ColeccionDeDiscosPrincipal {
    
    public static void main(String[] args) {//método main
        //N determina el tamño del array
        final int N = 100; //establece un valor que no se puede cambiar 
        
        //creamos la clase Scanner
        Scanner entrada= new Scanner(System.in);
        
        //crea el array de discos
        Disco[]discos=new Disco[N];
        
        //creamos los atributos 
        String codigoIntroducido;
        String autorIntroducido;
        String tituloIntroducido;
        String generoIntroducido;
        int duracionIntroducido;
         int opcion;
        
        //crea todos los discos que van en cada una de las celdas del array
        
        for (int i =0;i<N;i++){
           discos [i]=new Disco();
        }
        
        //cargamos varios discos
            discos[0]=new Disco("GAS421","Win Mertens","Mazimazing the Audience","Instrumental",50);
            discos[1]=new Disco("FSDF23","Metallica","TBlack album","hard rock",46);
            discos[2]=new Disco("TU342","Supersubmarina","Viento de cara","pop rock",42);
            
        
       
       
        
        do{
            
                System.out.println("MENÚ");
                System.out.println("____");
                System.out.println("1 ver lista");
                System.out.println("2 nuevo disco");
                System.out.println("3 modificar");
                System.out.println("4 borrar");
                System.out.println("5 salir");
                opcion= entrada.nextInt();
                
            //}while(opcion<1||opcion>5);
                
                switch (opcion){
                    case 1 :  
                        
                            System.out.println("\nLISTADO");
                            System.out.println("==========");
                            
                            for(Disco d:discos){//Creamos un foreach para extraer la información y poder mostrarla
                                if (!d.getCodigo().equals("LIBRE")){//si el codigo es distinto de libre se imprime d 
                                    System.out.println(d);
                                }
                            }
                                
                            break;
                       
                        
                        
                    case 2:
                        
                        System.out.println("NUEVO DISCO ");
                        System.out.println("============");
                        
                        //busca la primera posicion libre del array
                        int primeraLibre =-1;
                        
                        do{
                            primeraLibre++;//hace que la posicion se establezca en 0
                        }while(!((discos[primeraLibre].getCodigo()).equals("LIBRE")));//busca en el array de discos la posicion 0 y el atributo codigo y tiene que ser distinta de libre 
                        //mientras en la  posicion del array el codigo sea distinto de  Libre recorre las posiciones
                        
                             System.out.println("vamos a introducir los datos del disco :");
                                System.out.println("introduce el código");
                                entrada.next();
                                codigoIntroducido= entrada.nextLine();
                                System.out.println("introduce el autor");
                                autorIntroducido= entrada.nextLine();
                                System.out.println("introduce el titulo");
                                tituloIntroducido = entrada.nextLine();
                                System.out.println("introduce el genero");
                                generoIntroducido= entrada.nextLine();
                                System.out.println("introduce la duración");
                                duracionIntroducido=entrada.nextInt();

                                discos[primeraLibre]= new Disco
        (codigoIntroducido,autorIntroducido,tituloIntroducido,generoIntroducido,
                duracionIntroducido); //Con esto guardamos todo lo introducido en el array de objeto Disco en la posicion libre
            
        
                        break;
                        
                    case 3: System.out.println("\nModificar");
                        System.out.println("================");
                        
                        System.out.println("por favor , introduzca el código del disco cuyos datos desea cambiar");
                      codigoIntroducido= entrada.nextLine();
                      
                      int i =-1;
                      do{
                          i++;
                      }while (!((discos[i].getCodigo()).equals(codigoIntroducido)));//
                     // mientras que lo que hay en la posicion del array sea distinto del codigo introducido recorre el array
                      
                        System.out.println("introduce los nuevos datos del disco ");//busca el codigo
                        System.out.println("codigo: "+ discos[i].getCodigo());
                        System.out.println("nuevo codigo");
                        codigoIntroducido= entrada.nextLine();
                        if (!codigoIntroducido.equals("")){//si el codigo introducido es distinto de espacio en blanco , es decir de no meter nada, modifica el codigo a codigo introducido
                            discos[i].setCodigo(codigoIntroducido);
                        }
                        
                        System.out.println("autor: "+ discos[i].getAutor());//busca el autor
                        System.out.println("Nuevo autor: ");
                        autorIntroducido= entrada.nextLine();
                        if (!autorIntroducido.equals("")){
                            discos[i].setAutor(autorIntroducido);
                        }
                        
                        System.out.println("titulo: "+ discos[i].getTitulo());
                        System.out.println("Nuevo Titulo");
                        tituloIntroducido= entrada.nextLine();
                        if (!tituloIntroducido.equals("")){
                            discos[i].setTitulo(tituloIntroducido);
                        }
                        
                        System.out.println("género: "+ discos[i].getGenero());
                        System.out.println("Nuevo Genero");
                        generoIntroducido= entrada.nextLine();
                        if (!generoIntroducido.equals("")){
                        discos[i].setGenero(generoIntroducido);
                        }
                        
                        System.out.println("Duración: "+ discos [i].getDuracion());
                        System.out.println("Nueva duración");
                        final String duracionIntroducidaString = entrada.nextLine();
                      
                        if (!duracionIntroducidaString.equals("")){
                            discos[i].setDuracion(Integer.parseInt(duracionIntroducidaString));
                        }
                        break;
                        
                    case 4:
                        System.out.println("\nBorrar");
                        System.out.println("========");
                        
                        System.out.println("por favor introduzca el codigo del disco que desea borrar: ");
                        codigoIntroducido= entrada.nextLine();
                        
                        i=-1;
                        do{
                            i++;
                        } while (!((discos[i].getCodigo().equals(codigoIntroducido))));
                        discos[i].setCodigo("LIBRE");
                        System.out.println("album borrado");
                        break;
                        
                    default:
                        }
                
                
            }while (opcion>0|| opcion<5);
        
        
        }
        
            
    }
        
        
        
    
    

