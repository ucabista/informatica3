package Paquete1;

public class CamisaDeportiva extends Producto
{

    public CamisaDeportiva(String nombre, int cantProducto, double precio, String codProducto, String descripcion, double iva) {
        super(nombre, cantProducto, precio, codProducto, descripcion, iva);
    }

    public CamisaDeportiva(String nombre) {
        super(nombre);
    }

    public CamisaDeportiva(double totalBs) {
        super(totalBs);
    }

    public CamisaDeportiva(int cantProducto) {
        super(cantProducto);
    }
 

}
