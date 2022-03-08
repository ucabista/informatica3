/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author DELL
 */
public class Mamiferos extends Vertebrados {

    public String sonido;

    public Mamiferos(String cuerpo, String respiracion, String extremidades, int codigo, String alias, String tipo) {
        super(cuerpo, respiracion, extremidades, codigo, alias, tipo);
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public String getRespiracion() {
        return respiracion;
    }

    public String getExtremidades() {
        return extremidades;
    }

    public String emitirSonido()
    { // metodo abstracto
        return "sonido: " + sonido;
    }

}
