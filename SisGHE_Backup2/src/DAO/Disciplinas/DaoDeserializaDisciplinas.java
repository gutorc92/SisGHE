/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.Disciplinas;

import Controle.Disciplinas.ControlClass;
import Controle.Disciplinas.ControlDay;
import Controle.Disciplinas.ControlHour;
import Controle.Disciplinas.ControleDisciplinas;
import Modelo.Disciplinas.Dia;
import Modelo.Disciplinas.Disciplina;
import Modelo.Disciplinas.Hora;
import Modelo.Disciplinas.Turma;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;
import org.jdom2.Content;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;
import org.w3c.dom.NodeList;

/**
 *
 * @author Axs
 */
public class DaoDeserializaDisciplinas {

    public DaoDeserializaDisciplinas() {
    }
    private static ArrayList<Disciplina> disciplines = new ArrayList<Disciplina>();
    
    public static ArrayList<Disciplina> deserializaDisciplinasXml() {
        SAXBuilder builder = new SAXBuilder();
        
        try {
            Document documento = builder.build("XML/Disciplinas/lista_disciplinas.xml");

            if (documento == null) {
                JOptionPane.showMessageDialog(null, "Arquivo inexistente no banco");
                assert (documento != null);
            } else {
                Element disciplinas = documento.getRootElement();
                List<Element> lista_disciplinas = disciplinas.getChildren();


                percorreDisciplinasXml(lista_disciplinas, disciplines);
               
            }
        } catch (Exception e) {
            e.printStackTrace();
        
        }

        return disciplines;
    }

    private static void percorreDisciplinasXml(List<Element> disciplinas, ArrayList listDisciplinas) {
        for (Element e : disciplinas) {


            List<Element> turmas = e.getChildren("turmas");

            ArrayList<Turma> classes = ControlClass.createClasses();

            for (Element f : turmas) {
                List<Element> turma = f.getChildren();
                percorreTurmaXml(turma, classes);

            }
            ControleDisciplinas.adicionaDisciplinaArray(listDisciplinas, ControleDisciplinas.salvaDadosDisciplina(e.getChildText("nome"), e.getChildText("codigo"), e.getChildText("pre__req"), classes));
        }

    }

    private static void percorreTurmaXml(List<Element> turma, ArrayList<Turma> classes) {

        for (Element t : turma) {


            List<Element> dias = t.getChildren("dias");
            List<Element> horas = t.getChildren("horas");

            ArrayList<Dia> days = ControlDay.createDays();
            ArrayList<Hora> hours = ControlHour.createHours();

            percorreDiasXml(dias, days);
            percorreHorasXml(horas, hours);
            ControlClass.registerClassLesson(classes, ControlClass.createClassLesson(t.getChildText("nome"), days, hours));
        }
    }

    private static void percorreDiasXml(List<Element> dias, ArrayList<Dia> listDias) {

        for (Element g : dias) {

            List<Element> dia = g.getChildren("dia");


            for (Element d : dia) {

                ControlDay.registerDay(listDias, ControlDay.createDay(d.getChildText("id__dia"), d.getChildText("nome")));
            }

        }

    }

    private static void percorreHorasXml(List<Element> horas, ArrayList<Hora> listHoras) {

        for (Element i : horas) {

            List<Element> hora = i.getChildren("hora");


            for (Element h : hora) {

                ControlHour.registerHour(listHoras, ControlHour.createHour(h.getChildText("id__hora"), h.getChildText("nome")));

            }

        }
    }
}
