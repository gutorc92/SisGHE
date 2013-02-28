/*
 * Classe responsável por gerar um arquivo XML com as 
 * disciplinas selecionadas pelo usuário.
 */
package DAO;

import Modelo.Aluno;
import Modelo.DisciplinaCursada;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.XMLOutputter;

/**
 *
 * @author Beatriz Rezener, Felipe
 */
public class XmlDisciplinasCursadas {

    public static DisciplinaCursada gerarXml(ArrayList<DisciplinaCursada> disciplinasCursadas) {

        Element d_cursadas = new Element("disciplinas_cursadas");
        File file = new File("XML/CadastroAluno.xml");
       
        Document doc = new Document();
        doc.setRootElement(d_cursadas);

        Iterator i = disciplinasCursadas.iterator();
        DisciplinaCursada dc;
        while (i.hasNext()) {

            Element disciplina = new Element("disciplina");
            Element nome = new Element("nome");
            Element codigo = new Element("codigo");
            Element pre_req = new Element("pre_req");

            d_cursadas.addContent(disciplina);
            disciplina.addContent(nome);
            disciplina.addContent(codigo);
            disciplina.addContent(pre_req);

            dc = (DisciplinaCursada) i.next();

            nome.setText(dc.getNome());
            codigo.setText(dc.getCodigo());
            pre_req.setText(dc.getCod_preReq());

        }

        try {
            XMLOutputter out = new XMLOutputter();
            java.io.FileWriter writer = new java.io.FileWriter("XML/DisciplinasCursadas.xml");

            out.output(doc, writer);
            writer.flush();
            writer.close();

        } catch (Exception e) {
            e.getMessage();
        }

        return null;

    }
    
    // FELIPE>> para obter os dados do documento XML
    public static ArrayList DeserializaDisciplinas() {
        
        ArrayList<DisciplinaCursada> disciplinasCursadas = new ArrayList<DisciplinaCursada>();
        
        try {
            File file = new File("XML/DisciplinasCursadas.xml");
            SAXBuilder sax = new SAXBuilder();
            Document d = sax.build(file);
            Element root = d.getRootElement();
            List disciplinas = root.getChildren();
            Iterator i = disciplinas.iterator();
            
            while(i.hasNext()){
                DisciplinaCursada DISCIPLINA = new DisciplinaCursada();
                Element xml = (Element) i.next();
                DISCIPLINA.setNome(xml.getChildText("nome"));
                
                DISCIPLINA.setCodigo(xml.getChildText("codigo"));
                DISCIPLINA.setCod_preReq(xml.getChildText("pre_req"));
                disciplinasCursadas.add(DISCIPLINA);
                //saida para teste
                //System.out.println(DISCIPLINA.toString()+"\n");
                //System.out.println(disciplinasCursadas.toString());
   
             }
        
        } catch (Exception e) {
            e.printStackTrace();
        }
        return disciplinasCursadas;


     }
    
            public static int excluiXmlCadastro(){
            File FILE = new File("XML/DisciplinasCursadas.xml");
            try{
                FILE.delete();
                return 1;
               }catch(Exception e){
                   e.printStackTrace(); 
                   return -1;
               }
        }

    
    
    
    
}