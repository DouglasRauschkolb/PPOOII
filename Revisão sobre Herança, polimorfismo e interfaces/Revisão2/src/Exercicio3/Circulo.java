
package Exercicio3;

/**
 *
 * @author douglas
 */
public class Circulo extends Quadrilateros{
    
    private Double raio;
    
    public Double calulaArea() {
        Double area = 3.14 * (this.raio * this.raio);
        return area;
    }
    
    @Override
    public Double calulaPerimetro(){
        Double perimetro = 2 * 3.14 * this.raio;
        return perimetro;
    }

    @Override
    public String toString() {
        return "Circulo{" + "raio=" + raio + '}';
    }

    public Circulo(Double raio) {
        this.raio = raio;
    }
    
}
