/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle.Disciplinas;

import DAO.Disciplinas.DeserializaDisciplinas;
import DAO.Disciplinas.SerializeSubject;
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
    
    public static Disciplina createSubject (String name, String id, String pre_id, ArrayList <Turma> classes) {
        Disciplina subject = new Disciplina(name, id, pre_id, classes);
        return subject;
    }
    
    public static void registerSubject (ArrayList <Disciplina> disciplines, Disciplina subject) {
        disciplines.add(subject);
    }
    
    public static ArrayList <Disciplina> createDisciplines () {
        ArrayList <Disciplina> disciplines = new ArrayList <Disciplina>();
        return disciplines;
    }
    
    public void callSerialize(ArrayList <Disciplina> disciplines) {
        SerializeSubject.serializingDisciplines(disciplines);
    }
    
    public ArrayList <Disciplina> deserializaDisciplinas() {
        ArrayList <Disciplina> disciplinas = DeserializaDisciplinas.deserializaDisciplinasXml();
        return disciplinas;
    }
    
    public static void chamaSelecionaCheckBox(){
        SelecionaCheckBox.setaDisciplina();
    }
}