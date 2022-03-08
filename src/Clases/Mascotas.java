/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author DELL
 */
public class Mascotas extends Veterinario{
    int codigo;
    String alias;
    String tipo;

    public Mascotas(int codigo, String alias, String tipo) { // Constructor
        this.codigo = codigo;
        this.alias = alias;
        this.tipo = tipo;
    }

  
    public int getCodigo() {
        return codigo;
    }

    public String getAlias() {
        return alias;
    }

    public String getTipo() {
        return tipo;
    }
    
    // método para el polimorfismo
    
   public String mostrarDatos(){
        return "Codigo: "+codigo+" Alias: "+alias+" Tipo: "+tipo;
    }
    
    
    
}
