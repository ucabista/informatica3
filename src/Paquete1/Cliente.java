package Paquete1;

public class Cliente
{
    private String cedula;
    private String nombre;
    private String apellido;
    private int dia,mes,anio;
    private String genero;

    public Cliente(String cedula, String nombre, String apellido, int dia, int mes, int anio, String genero) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        this.genero = genero;
    }
    
    public void setCliente(String cedula, String nombre, String apellido, int dia, int mes, int anio, String genero) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        this.genero = genero;
    }
    
    public String getCliente(){
    return "Cedula: " + cedula + "\n Nombre: " + nombre + "\n apellido: " + apellido + "\n dia: " + dia + "\n mes: " + mes + "\n anio: " + anio + "\n genero: " + genero;

    
}

    

    @Override
    public String toString() {
        return "Cedula: " + cedula + "\n Nombre: " + nombre + "\n apellido: " + apellido + "\n dia: " + dia + "\n mes: " + mes + "\n anio: " + anio + "\n genero: " + genero;
    }
    
    

    
    
    
}
