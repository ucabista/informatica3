/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete1;

/**
 *
 * @author DELL
 */
public class GuanteBeisbol extends Producto{

    public GuanteBeisbol(String nombre, int cantProducto, double precio, String codProducto, String descripcion, double iva) {
        super(nombre, cantProducto, precio, codProducto, descripcion, iva);
    }

    public GuanteBeisbol(String nombre) {
        super(nombre);
    }

    public GuanteBeisbol(double totalBs) {
        super(totalBs);
    }

    public GuanteBeisbol(int cantProducto) {
        super(cantProducto);
    }
    
    
}
