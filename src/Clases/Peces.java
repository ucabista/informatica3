
package Clases;


public class Peces extends Vertebrados{
    

    public Peces(String cuerpo, String respiracion, String extremidades, int codigo, String alias, String tipo) {
        super(cuerpo, respiracion, extremidades, codigo, alias, tipo);
    }

   
    
   @Override
   public String mostrarDatos(){
       return "Cuerpo: "+cuerpo+"\nExtremidades: "+extremidades+"\nRespiracion: "+respiracion+"\ncodigo: "+codigo+"\nalias: "+alias+"\ntipo: "+tipo+"\n";
       
   }
    
}
