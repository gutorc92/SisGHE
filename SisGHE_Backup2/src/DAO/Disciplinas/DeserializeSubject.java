/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.Disciplinas;

import Controle.Disciplinas.ControlClass;
import Controle.Disciplinas.ControlDay;
import Controle.Disciplinas.ControlHour;
import Controle.Disciplinas.ControlSubject;
import Modelo.Disciplinas.Dia;
import Modelo.Disciplinas.Disciplina;
import Modelo.Disciplinas.Hora;
import Modelo.Disciplinas.Turma;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jdom2.Content;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;
import org.w3c.dom.NodeList;

/**
 *
 * @author Axs
 */
public class DeserializeSubject {
    
    public DeserializeSubject () {}
    
    static ArrayList <Disciplina> disciplines = ControlSubject.createDisciplines();
    
    public static ArrayList <Disciplina> deserializingDisciplines() {
        SAXBuilder builder = new SAXBuilder();

        try {
            Document documento = builder.build("src/DAO/Disciplinas/lista_disciplinas.xml");
            
            Element disciplinas = documento.getRootElement();
            List <Element> lista_disciplinas = disciplinas.getChildren();
            
            //System.out.println("Disciplinas");

            for(Element e: lista_disciplinas) {
                //System.out.println("Nome: " + e.getChildText("nome"));
                //System.out.println("Codigo: " + e.getChildText("codigo"));
                //System.out.println("Pre Requisito: " + e.getChildText("pre__req"));

                List<Element> turmas = e.getChildren("turmas");
                
                ArrayList<Turma> classes = ControlClass.createClasses();

                for(Element f: turmas) {
                    //System.out.println("Turma: " + f.getValue());
                    
                    List<Element> turma = f.getChildren();
                    
                    for(Element t: turma) {
                        //System.out.println("Turma: " + t.getChildText("nome"));
                        
                        List<Element> dias = t.getChildren("dias");
                        List<Element> horas = t.getChildren("horas");
                        
                        ArrayList<Dia> days = ControlDay.createDays();
                        ArrayList<Hora> hours = ControlHour.createHours();
                        
                        for(Element g: dias) {
                            //System.out.println("Dias: " + g.getValue());
                            List<Element> dia = g.getChildren("dia");
                            
                            //System.out.println("Dias");
                            for(Element d: dia) {
                                //System.out.println("ID: " + d.getChildText("id__dia"));
                                //System.out.println("Nome: " + d.getChildText("nome"));
                                ControlDay.registerDay(days, ControlDay.createDay(d.getChildText("id__dia"), d.getChildText("nome")));
                            }
                            
                        }
                        
                        for(Element i: horas) {
                            //System.out.println("Horas: " + g.getValue());
                            List<Element> hora = i.getChildren("hora");
                            
                            //System.out.println("Horas");
                            for(Element h: hora) {
                                //System.out.println("ID: " + h.getChildText("id__hora"));
                                //System.out.println("Nome: " + h.getChildText("nome"));
                                ControlHour.registerHour(hours, ControlHour.createHour(h.getChildText("id__hora"), h.getChildText("nome")));

                            }
                            
                        }
                        ControlClass.registerClassLesson(classes, ControlClass.createClassLesson(t.getChildText("nome"), days, hours));
                    }
                }
                ControlSubject.registerSubject(disciplines, ControlSubject.createSubject(e.getChildText("nome"), e.getChildText("codigo"), e.getChildText("pre__req"), classes));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return disciplines;
    }
    
}
