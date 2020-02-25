
package Exercicio2;

/**
 *
 * @author douglas.220997
 */
public class Exercicio2 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {    
        
        Assistente admin = new Administrativo(11111, "José");
        
        Assistente tecnico = new Tecnico(22222, "João");
        
        System.out.println(admin.toString());
        
        System.out.println(tecnico.toString());

    }
    
}
