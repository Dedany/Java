
package animal;


public class Perro extends Mamifero{
    
    private boolean ladrar;
    private char ladra;
    private char perro;
    private boolean can;

    public Perro() {
    }
    
    
    
    
    @Override
    public void comer(){
        System.out.println("el perro come lo que los humanos le dean");
    }
    
    @Override
    public void reproducirse(){
        System.out.println("no me apetece reproducirme ahora mismo");
    }
    public void reproducirseCon(char perro){
        if (perro=='s'|| perro=='S'){
            can=true;
            System.out.println("el perro se reproduce con otro perro");
        }else{
            System.out.println("el perro solo se reproduce con su misma especie");
            can=false;
        }}
            
    @Override
     public void andar(){
                System.out.println("el perro anda con 4 patas");
            }
     
     public void ladrar(char ladra){
         if (ladra=='s'|| ladra == 'S'){
             ladrar=true;
             
          
         
         System.out.println("el perro está ladrando");
     }
     else {System.out.println("el perro no ladra");
     ladrar=false;
     
     
}
         
       
            
         }
       public void hambre(boolean ladrar){
           if (ladrar == true);
           System.out.println("el perro tiene hambre, dale de comer");
           
     }
       
    }
    

