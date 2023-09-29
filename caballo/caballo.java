
package caballo;


public class caballo {
    
    //creamos lo atributos
    
    private String color, nombre;
    private double peso;
    int velocidad;
    
    
    //creamos el costructor 
    
    public caballo (String nombre, int velocidad){
        this.nombre=nombre;
        this.velocidad=velocidad;
        
    }

    @Override
    public String toString() {
        return "el caballo ganador es de color " + color + ",su nombre es " + nombre + ",y corre a una  velocidad de " + velocidad;
    }

    public String getVelocidad() {
        return velocidad +nombre ;
        
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public caballo(String nombre) {
        this.nombre = nombre;
        velocidad=50;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public void Correr(int km){
        System.out.println("el caballo "+ nombre+ " está corriendo");
    }
    
    public void Comer(String comida){
        if (comida=="paja"){
            System.out.println("el caballo está comiendo paja");
        }
        else{
        System.out.println("al caballo no le apetece comer");
        }
    }
    
    public void Carrera (caballo contrincante){
        if (this.velocidad==contrincante.velocidad){
            System.out.println("los dos caballos empatan");
        }if (contrincante.velocidad>this.velocidad){
                System.out.println("el caballo "+contrincante.getNombre()+ " es más rápido y gana la carrera");
        }else{
                    System.out.println("soy invencible");
                }
                
            }
   
    
            
        }
    

