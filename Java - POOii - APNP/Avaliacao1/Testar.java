public class Testar {
    
    public static void main(String[] args) {
        
        Vetor<Integer> vetor = new Vetor<Integer>(5);
        vetor.adicionar(1);
        vetor.adicionar(0, 2);
        System.out.println(vetor.toString());



        Pilha<String> pilha = new Pilha<String>(5);
        pilha.adicionar("teste");
        System.out.println(pilha.toString());


        Fila<Integer> fila = new Fila<Integer>(5);
        fila.adicionar(1);
        System.out.println(fila.toString());


    }

}
