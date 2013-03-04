/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle.Disciplinas;

import DAO.Disciplinas.DaoDeserializaDisciplinas;
import DAO.Disciplinas.DaoSerializaDisciplinas;
import Modelo.Disciplinas.Disciplina;
import Modelo.Disciplinas.Turma;
import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
import Business.*;

/**
 *
 * @author Axs
 */
public class ControleDisciplinas {
    
    public ControleDisciplinas() {}
    
    public static Disciplina salvaDadosDisciplina (String name, String id, String pre_id, ArrayList <Turma> classes) {
        Disciplina novaDisciplina = new Disciplina(name, id, pre_id, classes);
        return novaDisciplina;
    }
    
    public static void adicionaDisciplinaArray (ArrayList <Disciplina>  listDisciplinas, Disciplina novaDisciplina) {
        listDisciplinas.add(novaDisciplina);
    }
    
   
    
    public static void ControleSerializaDisciplinas(ArrayList <Disciplina> disciplinas) {
        DaoSerializaDisciplinas.serializaDisciplinas(disciplinas);
    }
    
    public static ArrayList <Disciplina> ControledeserializaDisciplinas() {
     return  DaoDeserializaDisciplinas.deserializaDisciplinasXml();
      
    }
    
    public static void chamaSelecionaCheckBox(){
        SelecionaCheckBox.setaDisciplina();
    }
}