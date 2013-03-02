/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.Disciplinas;

import Controle.Disciplinas.ControleDisciplinas;
import Modelo.Disciplinas.Dia;
import Modelo.Disciplinas.Disciplina;
import Modelo.Disciplinas.Hora;
import Modelo.Disciplinas.Turma;
import java.util.List;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Axs
 */
public class DaoSerializaDisciplinas {
    private static final String success = "Cadastro e XML gerado com sucesso";
    private static final String fail = "Algum erro ocorreu!";
    
    public DaoSerializaDisciplinas() {}
    
    public static void serializingDisciplines(ArrayList <Disciplina> disciplines) {
        XStream xstream = new XStream(new DomDriver());

        OutputStream outputStream = null;
        xstream.alias("lista_disciplinas", disciplines.getClass());
        xstream.alias("disciplina", Disciplina.class);
        xstream.alias("turma", Turma.class);
        xstream.alias("dia", Dia.class);
        xstream.alias("hora", Hora.class);
        
        File file = new File("XML/Disciplinas/lista_disciplinas.xml");
        
        try {
            outputStream = new FileOutputStream(file);
            Writer writer = new OutputStreamWriter(outputStream, "UTF-8");
            xstream.toXML(disciplines, writer);
        
            JOptionPane.showMessageDialog(null, success);
        
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, fail + "\n" + ex);
        }
        
    }
    
    
    
    
    /*public static void serializingDisciplines(ArrayList <Disciplina> disciplines){
        
        int nr_turma = 0;
        int nr_dia = 0;
        int nr_hora = 0;
        
        
        Element e_lista_disciplinas = new Element("lista_disciplinas");
        //File file = new File("src/Output.xml");
        
        Document doc = new Document();
        doc.setRootElement(e_lista_disciplinas);
        
        Iterator i = disciplines.iterator();
        
        while (i.hasNext()) {
            
            Disciplina subject = (Disciplina) i.next();

            Element e_disciplina = new Element("disciplina");
            Element e_nomeDisciplina = new Element("nome");
            Element e_codigoDisciplina = new Element("codigo");
            Element e_pre_reqDisciplina = new Element("pre_req");
            Element e_turmas = new Element("turmas");
            Element e_turma = new Element("turma");
            Element e_nomeTurma = new Element("nome");
            Element e_dias = new Element("dias");
            Element e_horas = new Element("horas");
            Element e_dia = new Element("dia");
            Element e_hora = new Element("hora");
            Element e_nomeDia = new Element("nome");
            Element e_nomeHora = new Element("nome");
            Element e_idDia = new Element("id_dia");
            Element e_idHora = new Element("id_hora");
            
            e_nomeDisciplina.setText(subject.getNome());
            e_codigoDisciplina.setText(subject.getCodigo());
            e_pre_reqDisciplina.setText(subject.getPre_req());
            
            e_lista_disciplinas.addContent(e_disciplina);
            e_disciplina.addContent(e_nomeDisciplina);
            e_disciplina.addContent(e_codigoDisciplina);
            e_disciplina.addContent(e_pre_reqDisciplina);
            e_disciplina.addContent(e_turmas);

            ArrayList <Turma> turmas = subject.getTurmas();
            Iterator j = turmas.iterator();
            
            nr_turma = 0;
            
            while (j.hasNext()) {
                
                Element e_turma_temp = new Element (e_turma.getName() + String.valueOf(nr_turma));

                Turma classLesson = (Turma) j.next();
                e_nomeTurma.setText(classLesson.getNome());
                
                e_turmas.addContent(e_turma_temp);
                e_turma_temp.addContent(e_nomeTurma);
                e_turma_temp.addContent(e_dias);
                e_turma_temp.addContent(e_horas);
                
                ArrayList <Dia> dias = classLesson.getDias();
                ArrayList <Hora> horas = classLesson.getHoras();
                
                Iterator k = dias.iterator();
                
                nr_dia = 0;
                
                while (k.hasNext()) {
                    
                    Element e_dia_temp = new Element (e_dia.getName() + String.valueOf(nr_dia));
                    
                    Dia day = (Dia) k.next();
                    
                    e_dia_temp.setAttribute("idDia", day.getId_dia());
                    //e_idDia.setText(day.getId_dia());
                    e_nomeDia.setText(day.getNome());

                    e_dias.addContent(e_dia_temp);
                    e_dia_temp.addContent(e_idDia);
                    e_dia_temp.addContent(e_nomeDia);
                    
                    nr_dia ++;
                }
                
                Iterator l = horas.iterator();
                
                nr_hora = 0;
                
                while (l.hasNext()) {

                    Element e_hora_temp = new Element (e_hora.getName() + String.valueOf(nr_hora));
                    
                    Hora hour = (Hora) l.next();

                    e_idHora.setText(hour.getId_hora());
                    e_nomeHora.setText(hour.getNome());
                    
                    e_horas.addContent(e_hora_temp);
                    e_hora_temp.addContent(e_idHora);
                    e_hora_temp.addContent(e_nomeHora);
                    
                    nr_hora ++;
                }
                nr_turma ++;
            }
        }
        
        try {
            XMLOutputter out = new XMLOutputter();
            java.io.FileWriter writer = new java.io.FileWriter("src/Output/lista_disciplinas.xml");
            
            out.output(doc, writer);
            writer.flush();
            writer.close();
        } catch (Exception e) {
            e.getMessage();
        }
    }*/    
}
