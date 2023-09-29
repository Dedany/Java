/*Crea la clase Pizza con los atributos y métodos necesarios. Sobre
 *    cada pizza se necesita saber el tamaño - mediana o familiar - el
 *    tipo - margarita, cuatro quesos o funghi - y su estado - pedida o
 *    servida. La clase debe almacenar información sobre el número total
 *    de pizzas que se han pedido y que se han servido. Siempre que se
 *    crea una pizza nueva, su estado es "pedida".*/
package pizza;


public  class pizza {
    
        private static int totalPedidas=0;
        private static int totalServidas=0;
    
    private String tamaño,tipo,estado;
    

            
//pedimos la pizza con el tamaño y tipo, y dejamos establecido un contador para las pizzas pedidas
    public pizza(String tamaño, String tipo) {
        this.tamaño = tamaño;
        this.tipo = tipo;
        this.estado="pedida";
        pizza.totalPedidas++;
   
    }
    
    
    
    
    public void servidas(){
        if (this.estado=="pedida"){
            this.estado="servida";
             pizza.totalServidas++;
             System.out.println("la pizza "+ tipo+ " ya se ha servido");
             
        }else{
            System.out.println("la pizza ya se ha servido");
        }
     
        
        
    

 
    }

    public static int getTotalPedidas() {
        return pizza.totalPedidas;
    }

    public static int getTotalServidas() {
        return pizza.totalServidas;
    }

    @Override
    public String toString() {
        return "pizza{" + "tamaño=" + tamaño + ", tipo=" + tipo + ", estado=" + estado + '}';
    }
    
    
    
    
    
    

    }
    

    

