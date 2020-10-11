public class Fila<T> {
    
    private T[] elementos;
    private int tamanho;
    private int ultima_senha; // Usado para o exercício 3

    public Fila(int capacidade) {
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
        this.ultima_senha = 0;
    }

    public int getTamanho() {
        return tamanho;
    }

    public int getUltimaSenha() {
        return ultima_senha;
    }

    public boolean enfileirar(T elemento) {
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            this.ultima_senha++;
            return true;
        } else {
            aumentaCapacidade();
            if (this.tamanho < this.elementos.length) {
                this.elementos[this.tamanho] = elemento;
                this.tamanho++;
                this.ultima_senha++;
                return true;
            } else {
                return false;
            }
        }
    }

    private void aumentaCapacidade() {
        if (this.tamanho == this.elementos.length) {
            T[] elementosNovos = (T[]) new Object[this.elementos.length*2];
            for(int i = 0; i < this.elementos.length; i++) {
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }

    public boolean estaVazia() {
        return this.tamanho == 0;
    }

    public T proximoElemento() {
        if(this.estaVazia()) {
            return null;
        }
        return this.elementos[0];
    }

    public T desenfileirar() {
        T primeiro;
        if(this.estaVazia()) {
            return null;
        }

        primeiro = proximoElemento();
        this.tamanho--;

        for(int l_i = 0; l_i < this.tamanho; l_i++){
            if (l_i == (this.elementos.length-1)) {
                this.elementos[l_i] = null;
            } else {
                this.elementos[l_i] = this.elementos[l_i+1];
            }
        }
        return primeiro;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");
        for(int i = 0; i < tamanho - 1; i++) {
            s.append(this.elementos[i]);
            s.append(","); 
        }

        if(this.tamanho > 0) {
            s.append(this.elementos[this.tamanho-1]); 
        }

        s.append("]");
        return s.toString();
    }

}