
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
            
            Document documento = builder.build("XML/novodisciplinas 1.xml");

            Element disciplina = documento.getRootElement();

            List<Element> lista = disciplina.getChildren();

            for (Element e : lista) {
                {
                    
                    DisciplinaCursada dc = new DisciplinaCursada(e.getChildText("nome"), e.getChildText("codigo"), e.getChildText("pre_req"));
                    disciplinas.add(dc);
                    }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return disciplinas;
    }
}

