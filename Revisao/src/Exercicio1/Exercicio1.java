
package Exercicio1;

/**
 *
 * @author douglas.220997
 */
public class Exercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Endereco endereco_joao = new Endereco();
        
        endereco_joao.setCep("99999-99");
        
        Proprietario joao = new Proprietario("João", "999.999.999-99", "9999999999", endereco_joao);
        
        System.out.println(joao.toString());
        
        Marca ford = new Marca();
        ford.setNome("Nome do carro");
        
        Carro carro_do_joao = new Carro(joao);  
        carro_do_joao.setMarca(ford);
        
        System.out.println(carro_do_joao.toString());     
        
    }
    
}
