/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle.Disciplinas;

import Modelo.Disciplinas.Dia;
import Modelo.Disciplinas.Hora;
import Modelo.Disciplinas.Turma;
import java.util.ArrayList;

/**
 *
 * @author Axs
 */
public class ControlClass {
    
    public ControlClass () {}
    
    public static Turma createClassLesson (String name, ArrayList <Dia> listDias, ArrayList <Hora> listHoras) {
        Turma classLesson = new Turma(name, listDias, listHoras);
        return classLesson;
    }
            
    public static void registerClassLesson (ArrayList <Turma> classes, Turma classLesson) {
        classes.add(classLesson);
    }
    
    public static ArrayList <Turma> createClasses () {
        ArrayList <Turma> classes = new ArrayList <Turma>();
        return classes;
    }

}
