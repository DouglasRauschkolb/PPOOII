
package Exercicio3;

/**
 *
 * @author douglas.220997
 */
public class vip extends Ingresso{
    
    private Double valor_adicional;

    public Double getValor_adicional() {
        return valor_adicional;
    }

    public void setValor_adicional(Double valor_adicional) {
        this.valor_adicional = valor_adicional;
    }
    
    public Double retorna_valor_vip(){
        return this.valor_adicional + this.getValor();
    }
    
}
