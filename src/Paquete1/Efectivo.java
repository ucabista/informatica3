
package Paquete1;


public class Efectivo extends MetodoPago{

    public Efectivo(String tipoPago) {
        super(tipoPago);
    }

    @Override
    public String toString() {
        return  tipoPago;
    }
    
   
    
    
}
