package Clases;

public class Main {

    public static void main(String[] args) {

        Vertebrados misVertebrados[] = new Vertebrados[3];
        
        // cuerpo,respiracion,extr,codigo,alias,tipo
        misVertebrados[0] = new Vertebrados("Cuerpo","Respiracion","Extremidades",123,"animal","cualquiera");
        
        misVertebrados[1] = new Aves("Plumas","Pulmones","Alas",123,"pajarito","Aves");
        
        misVertebrados[2] = new Peces("Escamas","Branquias","Aletas",321,"pecesito","Peces");
        
        for(Vertebrados vertebrados: misVertebrados){
            System.out.println(vertebrados.mostrarDatos());
           
        }
 
    }
}
