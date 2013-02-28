/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Disciplinas;

import java.util.Iterator;
import java.util.ArrayList;

/**
 *
 * @author Axs
 */
public class Turma {
    
    private String nome;
    private ArrayList <Dia> dias;
    private ArrayList <Hora> horas;

    public Turma(String nome, ArrayList <Dia> dias, ArrayList <Hora> horas) {
        this.setNome(nome);
        this.setDias(dias);
        this.setHoras(horas);
    }
    

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    /**
     * @return the dias
     */
    public ArrayList <Dia> getDias() {
        return dias;
    }

    /**
     * @param dias the dias to set
     */
    public void setDias(ArrayList <Dia> dias) {
        this.dias = dias;
    }

    /**
     * @return the horas
     */
    public ArrayList <Hora> getHoras() {
        return horas;
    }

    /**
     * @param horas the horas to set
     */
    public void setHoras(ArrayList <Hora> horas) {
        this.horas = horas;
    }
    
    public String toString() {
        String retorno = "\tTurma: " + this.getNome();
        
        Iterator i = dias.iterator();
        Iterator j = horas.iterator();
        
        while(i.hasNext() && j.hasNext()) {
            Hora h = (Hora) j.next();
            Dia d = (Dia) i.next();
            
            retorno += "\n\tDia: " + d.getNome()
                    +  "\n\tHora: " + h.getNome();
        }
        retorno += "\n";
        
        return  retorno;
    }
    
}
