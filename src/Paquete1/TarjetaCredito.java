
package Paquete1;


public class TarjetaCredito extends MetodoPago {

    public TarjetaCredito(String nombre, int dia, int mes, int anio, int codigo, String tipoPago) {
        super(nombre, dia, mes, anio, codigo, tipoPago);
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nFecha de caducidad: \n"+dia+"/"+mes+"/"+anio+"\n codigo: "+codigo+"\n Tipo Pago:"+tipoPago;
    }

  
    
    
}
