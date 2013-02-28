/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Disciplinas;

/**
 *
 * @author Axs
 */
public class Hora {
    
    private String id_hora;
    private String nome;

    
    public Hora(String id_hora, String nome) {
        this.setId_hora(id_hora);
        this.setNome(nome);
    }
    
    /**
     * @return the id_hora
     */
    public String getId_hora() {
        return id_hora;
    }

    /**
     * @param id_hora the id_hora to set
     */
    public void setId_hora(String id_hora) {
        this.id_hora = id_hora;
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
