/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import DAO.*;
import javax.swing.JOptionPane;
import Controle.*;

/**
 *
 * @author david, Felipe
 */
public class Aluno {

    private SerializaAluno serializaXml;
    private String nome;
    private String matricula;
    private String curso;
    private String semestre;
    private static final String invalido = "Você deixou algum campo em branco ou com caracteres invalidos";
    private static final String invalidoMatricula = "Verifique sua Matricula:\n 1º:Ela não pode estar em branco.\n 2º:Ela não pode ter caracteres\n 3º: Ele deve ter 9 digitos.";

    public Aluno() {
    }

    public Aluno(String nome, String matricula, String curso, String semestre) throws IllegalArgumentException {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.semestre = semestre;
    }

    public void setNome(String nome) throws IllegalArgumentException {

        if (nome != null && !"".equals(nome)) {
            this.nome = nome;
        } else {
            JOptionPane.showMessageDialog(null, invalido, "Nome", JOptionPane.ERROR_MESSAGE);
            throw new IllegalArgumentException();

        }

    }

    public String getNome() {

        return nome;
    }

    public void setMatricula(String matricula) {




        if (matricula != null && !"".equals(matricula) && matricula.length() == 9) {
            this.matricula = matricula;
        } else {
            JOptionPane.showMessageDialog(null, invalidoMatricula, "Matricula", JOptionPane.ERROR_MESSAGE);
            throw new IllegalArgumentException();

            //e.printStackTrace();
        }
    }

    public String getMatricula() {

        return matricula;
    }

    public void setCurso(String curso) {
        if (curso != null && !"".equals(curso)) {
            this.curso = curso;
        } else {
            JOptionPane.showMessageDialog(null, invalido, "Curso", JOptionPane.ERROR_MESSAGE);
            throw new IllegalArgumentException();
        }
    }

    public String getCurso() {

        return curso;
    }

    public void setSemestre(String semestre) {
        if (semestre != null && !"".equals(semestre)) {
            this.semestre = semestre;
        } else {
            JOptionPane.showMessageDialog(null, invalido, "Semestre", JOptionPane.ERROR_MESSAGE);
            throw new IllegalArgumentException();
        }
    }

    public String getSemestre() {

        return semestre;
    }

    @Override
    public String toString() {
        return "Aluno{" + "serializaXml=" + serializaXml + ", nome=" + nome + ", matricula=" + matricula + ", curso=" + curso + ", semestre=" + semestre + '}';
    }
}
