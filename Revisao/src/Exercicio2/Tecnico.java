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
public class Tecnico extends Assistente{
    
    private Double bonus_salarial;

    public Double getBonus_salarial() {
        return bonus_salarial;
    }

    public void setBonus_salarial(Double bonus_salarial) {
        this.bonus_salarial = bonus_salarial;
    }

    public Tecnico(Integer nr_matricula, String nome) {
        super(nr_matricula, nome);
    }    
}
