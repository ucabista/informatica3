
package Paquete1;


public class Producto{
   
    
    protected String nombre;
    protected int cantProducto;
    protected double precio;
    protected String codProducto;
    protected String descripcion;
    protected double iva;
    protected double totalBs;

    public Producto(String nombre,int cantProducto, double precio, String codProducto, String descripcion, double iva) {
        
        this.cantProducto = cantProducto;
        this.precio = precio;
        this.codProducto = codProducto;
        this.descripcion = descripcion;
        this.iva = iva;
        this.totalBs = totalBs;
        this.nombre = nombre;
    }
    
    
    public Producto(String nombre){
        this.nombre = nombre;
    }
    
    public Producto(double totalBs){
        this.totalBs = totalBs;
    }
    
    public Producto(int cantProducto){
        this.cantProducto = cantProducto;
    }
    
    // setters y getters
    
    public String getProducto(){
        return "\nNombre: " + nombre + "\n Cantidad:" + cantProducto + "\n Precio Unitario: " + precio + "\n Codigo: " + codProducto + "\n Descripcion: " + descripcion + "\n IVA: " + iva + "\n Total Bs: " + totalBs;
    }
    
    public void setProducto(String nombre,int cantProducto, double precio, String codProducto, String descripcion, double iva) {
        this.cantProducto = cantProducto;
        this.precio = precio;
        this.codProducto = codProducto;
        this.descripcion = descripcion;
        this.iva = iva;
        this.totalBs = totalBs;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantProducto() {
        return cantProducto;
    }

    public void setCantProducto(int cantProducto) {
        this.cantProducto = cantProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getCodProducto() {
        return codProducto;
    }

    public void setCodProducto(String codProducto) {
        this.codProducto = codProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getTotalBs() {
        return totalBs;
    }

    public void setTotalBs(double totalBs) {
        this.totalBs = totalBs;
    }
    
    

  
    @Override
    public String toString() {
        return "\nNombre: " + nombre + "\n Cantidad:" + cantProducto + "\n Precio Unitario: " + precio + "\n Codigo: " + codProducto + "\n Descripcion: " + descripcion + "\n IVA: " + iva + "\n Total Bs: " + totalBs;
    }
    
 
    
}
