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
public class Administrativo extends Assistente{
    
    private String turno;
    private Double adicional_noturno;

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public Double getAdicional_noturno() {
        return adicional_noturno;
    }

    public void setAdicional_noturno(Double adicional_noturno) {
        this.adicional_noturno = adicional_noturno;
    }

    public Administrativo(Integer matricula, String nome) {
        super(matricula, nome);
    }
    
    
    
    
}
