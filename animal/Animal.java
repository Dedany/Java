
package animal;


public abstract class Animal {
    //creamos los atributos
    
    protected String tamaño;
    protected String genero;


    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    
    
    
    
    

    

    public abstract void comer();
    
    public abstract void andar();
    
    public abstract void reproducirse();
}
