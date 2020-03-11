
package Exercicio3;

/**
 *
 * @author douglas
 */
public class Quadrado extends Quadrilateros{
    
    private Double lado;

    @Override
    public Double calulaArea() {
        Double area = this.lado * this.lado;
        return area;
    }
    
    @Override
    public Double calulaPerimetro(){
        Double perimetro = this.lado * 4;
        return perimetro;
    }

    @Override
    public String toString() {
        return "Quadrado{" + "lado=" + lado + '}';
    }
    
    public Quadrado(Double lado) {
        this.lado = lado;
    } 
    
}
