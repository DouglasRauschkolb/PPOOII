/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio2;

/**
 *
 * @author douglas.220997
 */
public class Assistente extends Funcionario {
    
    private Integer nr_matricula;
    private String  nome;

    public Integer getNr_matricula() {
        return nr_matricula;
    }

    public void setNr_matricula(Integer nr_matricula) {
        this.nr_matricula = nr_matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
   
    @Override
    public void exibe_dados(){
        System.out.println("Sobreescrever!");
    }

    @Override
    public String toString() {
        return "Assistente{" + "nr_matricula=" + nr_matricula + ", nome=" + nome + '}';
    }

    public Assistente(Integer nr_matricula, String nome) {
        this.nr_matricula = nr_matricula;
        this.nome = nome;
    }
    
}
