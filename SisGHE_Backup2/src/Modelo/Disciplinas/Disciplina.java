/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Disciplinas;

import java.io.Serializable;
import java.util.Iterator;
import java.util.ArrayList;

/**
 *
 * @author Axs
 */
public class Disciplina implements Serializable {
    
    private String nome;
    private String codigo;
    private String pre_req;
    private ArrayList <Turma> turmas;
    
    public Disciplina() {}

    public Disciplina(String nome, String codigo, String pre_req, ArrayList <Turma> turmas) {
        this.setNome(nome);
        this.setCodigo(codigo);
        this.setPre_req(pre_req);
        this.setTurmas(turmas);
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
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the pre_req
     */
    public String getPre_req() {
        return pre_req;
    }

    /**
     * @param pre_req the pre_req to set
     */
    public void setPre_req(String pre_req) {
        this.pre_req = pre_req;
    }

    /**
     * @return the turmas
     */
    public ArrayList <Turma> getTurmas() {
        return turmas;
    }

    /**
     * @param turmas the turmas to set
     */
    public void setTurmas(ArrayList <Turma> turmas) {
        this.turmas = turmas;
    }
    
    public String toString () {
        String retorno;
        retorno = "\nNome: " + this.getNome() +
                  "\nCodigo: " + this.getCodigo() +
                  "\nPre Requisito: " + this.getPre_req() +
                  "\nTurmas";
        
        Iterator i = turmas.iterator();
        
        while(i.hasNext()) {
            Turma t = (Turma) i.next();
            retorno += "\n" + t.toString();
        }
        
        return  retorno;
    }

}
