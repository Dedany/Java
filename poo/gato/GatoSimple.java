
package poo.gato;


public class GatoSimple {
    String color,raza,sexo;
    int edad;
    double peso;

    public GatoSimple(String s) {
        this.sexo = s;
    }

    public String getSexo() {
        return sexo;
    }
    
    void maulla(){
        System.out.println("Miauuu");
    }
    void ronronea(){
        System.out.println("mrrrrr");
        
    }
    
    void come(String comida){
        if (comida.equals("pescado")){
            System.out.println("Hmmm,   gracias");
        }else{
            System.out.println("Lo siento, yo solo como pescado");
        
        }
    }
           void peleaCon(GatoSimple contrincante){
               if (sexo.equals("hembra")){
                   System.out.println("no me gusta pelear");
               }else{
                   if (contrincante.getSexo().equals("hembra")){
                       System.out.println("no peleo contra gatitas");
                       
                   }else{
                       System.out.println("ven aquí que te vas a enterar");
                   }
               }
           
           } 
    
    
    
}
