package ListasDuplamenteLigadas;

public class TesteListaDuplamenteLigada {

    public static void main(String[] args) {

        ListaDuplamenteLigada lista = new ListaDuplamenteLigada();

        Aluno ronaldo = new Aluno("Ronaldo", 28);
        Aluno carol = new Aluno("Carol", 4);
        Aluno betty = new Aluno("Betty", 1);
        Aluno marina = new Aluno("Marina", 10);
        
        lista.adicionaNoComeco(marina);
        lista.adicionaNoComeco(betty);
        lista.adiciona(carol);
        lista.adiciona(0, ronaldo);

        System.out.println(lista.toString());

        lista.remove(2);

        System.out.println(lista.toString());

    }
    
}
