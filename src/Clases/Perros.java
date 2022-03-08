
package Clases;


public class Perros extends Mamiferos {
    private String ladrar="Guao";

    public Perros(String ladrar, String cuerpo, String respiracion, String extremidades, int codigo, String alias, String tipo) {
        super(cuerpo, respiracion, extremidades, codigo, alias, tipo);
        this.ladrar = ladrar;
    }

    public String getLadrar() {
        return ladrar;
    }

    
    @Override
    public String emitirSonido()
    { 
        return "Sonido: " + ladrar;
    }
    
    
    
    
    
}


