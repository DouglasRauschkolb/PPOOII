
package Exercicio3;

/**
 *
 * @author douglas
 */
public class Retangulo extends Quadrilateros{
    
    private Double base;
    private Double altura;
    
    @Override
    public Double calulaArea() {
        Double area = this.base * this.altura;
        return area;
    }
    
    @Override
    public Double calulaPerimetro(){
        Double perimetro = this.base * 2 + this.altura * 2;
        return perimetro;
    }

    @Override
    public String toString() {
        return "Retangulo{" + "base=" + base + ", altura=" + altura + '}';
    }

    public Retangulo(Double base, Double altura) {
        this.base = base;
        this.altura = altura;
    } 
    
}
