
package DAO;

/**
 *
 * @authors larissa, david, beatriz
 */
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jdom2.*;
import org.jdom2.input.SAXBuilder;
import org.jdom2.JDOMException;
import Modelo.*;

public class DeserializaDisciplinas {

    static ArrayList<DisciplinaCursada> disciplinas = new ArrayList<DisciplinaCursada>();

    public static ArrayList<DisciplinaCursada> deserializarDisciplinas() {

        SAXBuilder builder = new SAXBuilder();

        try {
            //Log.i("xml", "xml gerado");  
            // File f = new File("/home/david/Documentos/","novodisciplinas 1.xml");
            Document documento = builder.build("XML/novodisciplinas 1.xml");

            Element disciplina = documento.getRootElement();

            List<Element> lista = disciplina.getChildren();

            for (Element e : lista) {
                {


                    /*Nesse trecho é possivel através dos métodos set da Classe DisciplinaCursada 
                     setar os valores do arquivo xml, direto na classe, e depois se for necessario adcionar o objeto
                     da classe em uma array*/
                    System.out.println("nome:" + e.getChildText("nome"));
                    System.out.println("codigo:" + e.getChildText("codigo"));
                    System.out.println("Pre requisito: " + e.getChildText("pre_req"));

                    DisciplinaCursada dc = new DisciplinaCursada(e.getChildText("nome"), e.getChildText("codigo"), e.getChildText("pre_req"));
                    disciplinas.add(dc);


                    List<Element> turmas = e.getChild("turmas").getChildren();
                    Iterator i = turmas.iterator();
                    while (i.hasNext()) {
                        Element turma = (Element) i.next();
                        System.out.println("turma" + turma.getChildText("turma"));
                        System.out.println("professor: " + turma.getChildText("professor"));
                        System.out.println("primeiro dia:" + turma.getChildText("dia1"));
                        System.out.println("horario: " + turma.getChildText("hora1"));
                        System.out.println("segundo dia:" + turma.getChildText("dia2"));
                        System.out.println("horario:" + turma.getChildText("hora2"));
                        System.out.println("terceiro dia:" + turma.getChildText("dia3"));
                        System.out.println("horario: " + turma.getChildText("hora3"));
                    }
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return disciplinas;
    }
}

