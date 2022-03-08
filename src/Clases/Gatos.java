
package Clases;


public class Gatos extends Mamiferos {
    private String maullar="Miao";

    public Gatos(String maullar, String cuerpo, String respiracion, String extremidades, int codigo, String alias, String tipo) {
        super(cuerpo, respiracion, extremidades, codigo, alias, tipo);
        this.maullar = maullar;
    }

    public String getMaullar() {
        return maullar;
    }
    
    

    @Override
    public String emitirSonido()
    { 
        return "Sonido: " + maullar;
    }
    
    
    
    
    
}


