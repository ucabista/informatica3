
package Paquete1;


public class Cheque extends MetodoPago{

    public Cheque(String nombre, int codigo, String tipoPago) {
        super(nombre, codigo, tipoPago);
    }
    
    @Override
  public String toString(){
      return "Tipo de pago: "+nombre+"\n Numero: "+codigo+"\nEntidad Bancaria: "+tipoPago;
  }
    
}
