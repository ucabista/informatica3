
package Clases;


public class Aves extends Vertebrados{
    

    public Aves(String cuerpo, String respiracion, String extremidades, int codigo, String alias, String tipo) {
        super(cuerpo, respiracion, extremidades, codigo, alias, tipo);
    }

   @Override
   public String mostrarDatos(){
       return "Cuerpo: "+cuerpo+"\nExtremidades: "+extremidades+"\nRespiracion: "+respiracion+"\ncodigo: "+codigo+"\nalias: "+alias+"\ntipo: "+tipo+"\n";
       
   }
    
}
