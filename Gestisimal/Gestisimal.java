
package Gestisimal;


public class Gestisimal {
 //creamos los atributos
    
    String codigo="LIBRE";
    String descripcion;
    int precioCompra;
    int PrecioVenta;
    int stock;
    

    public Gestisimal() {
    }

    
    public Gestisimal(String codigo, String descripcion, int precioCompra, int PrecioVenta,int stock) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precioCompra = precioCompra;
        this.PrecioVenta = PrecioVenta;
        this.stock = stock;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(int precioCompra) {
        this.precioCompra = precioCompra;
    }

    public int getPrecioVenta() {
        return PrecioVenta;
    }

    public void setPrecioVenta(int PrecioVenta) {
        this.PrecioVenta = PrecioVenta;
    }

    public int getStock() {
        return stock;
    }

  

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        String resultado="\n________________________";
           resultado   += "\ncodigo :" + codigo;
           resultado   += " \ndescripcion :" + descripcion;
           resultado   += "\nprecioCompra :" + precioCompra;
           resultado   += "\nPrecioVenta: " +  PrecioVenta;
           resultado   += " \nstock :"+stock;
           
           return resultado;
    }

int comprar(int add ){
   stock=stock+add;
     return stock;
  }
 
 int vender(){
    
     
     stock=stock-1;
     return stock;
 }
    
    
    
}
