/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Disciplinas;

/**
 *
 * @author Axs
 */
public class Dia {
    
    private String id_dia;
    private String nome;

    public Dia(String id_dia, String nome) {
        this.setId_dia(id_dia);
        this.setNome(nome);
    }
    
    /**
     * @return the id_dia
     */
    public String getId_dia() {
        return id_dia;
    }

    /**
     * @param id_dia the id_dia to set
     */
    public void setId_dia(String id_dia) {
        this.id_dia = id_dia;
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
    
}
