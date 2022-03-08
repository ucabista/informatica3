
package Clases;

public class Vertebrados extends Mascotas{
    String cuerpo;
    String respiracion;
    String extremidades;
    
    // Constrcutor
    public Vertebrados(String cuerpo, String respiracion, String extremidades, int codigo, String alias, String tipo) {
        super(codigo, alias, tipo);
        this.cuerpo = cuerpo;
        this.respiracion = respiracion;
        this.extremidades = extremidades;
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
    
    public String mostrarDatos(){
        return "Animales: \n";
    }
    
   
}
