
package Paquete1;


public class MetodoPago {
 
String nombre;   
int dia,mes,anio; // fecha caducidad
int codigo;
String tipoPago; //visa o mastercard

    public MetodoPago(String nombre, int dia, int mes, int anio, int codigo, String tipoPago) {
        this.nombre = nombre;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        this.codigo = codigo;
        this.tipoPago = tipoPago;
    }

public MetodoPago(String tipoPago){
    this.tipoPago = tipoPago;
}

public MetodoPago(String nombre,int codigo,String tipoPago){
    this.nombre=nombre;
    this.codigo=codigo;
    this.tipoPago=tipoPago;
}

    @Override
    public String toString() {
        return "Metodos Pagos:\n ";
    }
    




    
}
