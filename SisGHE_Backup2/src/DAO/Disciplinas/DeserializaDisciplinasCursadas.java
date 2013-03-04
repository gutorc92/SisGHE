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
import java.util.List;
import javax.swing.JOptionPane;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;

/**
 *
 * @author david
 */
public class DeserializaDisciplinasCursadas {
    private static ArrayList<Disciplina> disciplines = new ArrayList<Disciplina>();
    public static ArrayList<Disciplina> deserializaDisciplinasCursadasXml() {
        SAXBuilder builder = new SAXBuilder();
        Document documento;       //Variavel da Library Jdom para manipular arquivos Xml

        try {
            documento = builder.build("XML/Disciplinas/Oferta.xml");

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
        try {
            for (Element e : disciplinas) {


                List<Element> turmas = e.getChildren("turmas");

                ArrayList<Turma> classes = new ArrayList<Turma>();

                for (Element f : turmas) {
                    List<Element> turma = f.getChildren();
                    percorreTurmaXml(turma, classes);

                }
                ControleDisciplinas.adicionaDisciplinaArray(listDisciplinas, ControleDisciplinas.salvaDadosDisciplina(e.getChildText("nome"), e.getChildText("codigo"), e.getChildText("pre__req"), classes));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void percorreTurmaXml(List<Element> listTurma, ArrayList<Turma> arrayClasses) {
        assert (listTurma != null || arrayClasses != null);
        try {
            for (Element t : listTurma) {


                List<Element> dias = t.getChildren("dias");
                List<Element> horas = t.getChildren("horas");

                ArrayList<Dia> days = ControlDay.createDays();
                ArrayList<Hora> hours = ControlHour.createHours();

                percorreDiasXml(dias, days);
                percorreHorasXml(horas, hours);
                ControlClass.registerClassLesson(arrayClasses, ControlClass.createClassLesson(t.getChildText("nome"), days, hours));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void percorreDiasXml(List<Element> listDias, ArrayList<Dia> arrayDias) {

        assert (listDias != null || listDias != null);
        try {
            for (Element g : listDias) {

                List<Element> dia = g.getChildren("dia");


                for (Element d : dia) {
                    arrayDias.add(ControlDay.createDay(d.getChildText("id__dia"), d.getChildText("nome")));
                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void percorreHorasXml(List<Element> listHoras, ArrayList<Hora> arrayHoras) {
        assert (listHoras != null || arrayHoras != null);
        try {
            for (Element i : listHoras) {

                List<Element> hora = i.getChildren("hora");


                for (Element h : hora) {

                    ControlHour.registerHour(arrayHoras, ControlHour.createHour(h.getChildText("id__hora"), h.getChildText("nome")));

                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
