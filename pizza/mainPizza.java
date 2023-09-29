
package pizza;


public class mainPizza {
    public static void main(String[] args) {
        pizza pizza1=new pizza("mediana","cuatroquesos");
        pizza pizza2= new pizza ("grande","funghi");
        pizza pizza3= new pizza("pequeña","margarita");
        pizza pizza4 = new pizza("grande","bacon y queso");
        pizza pizza5= new pizza ("pequeña","jamón y queso");
        pizza pizza45 = new pizza("grande","bacon y queso");
      
        pizza3.servidas();
        pizza2.servidas();
        pizza4.servidas();
        pizza5.servidas();
        
        System.out.println(pizza1);
        System.out.println(pizza2);
        System.out.println(pizza3);
        System.out.println(pizza4);
//        System.out.println(pizza5);
               
        
        System.out.println("el total de las pizzas es : " + pizza.getTotalPedidas());
        System.out.println("el total de las pizzas servidas es : "+pizza.getTotalServidas());
        
      
        
        
    }
}





