
package DAO;

import Modelo.Aluno;
import java.io.*;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;
import Controle.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.jdom2.JDOMException;


/**
 *
 * @author david, Felipe
 */
public class DeserializaAluno {
  //Essa classe ainda não foi implementada corretamente.  
  public static ArrayList<Aluno> listaAluno = new ArrayList();
    /**
     *
     */
    
public static void DeserializaAluno() {
Aluno aluno = new Aluno();
       
        try {
         
            File file = new File("XML/CadastroAluno.xml");
            SAXBuilder sax = new SAXBuilder();
            Document d = sax.build(file);
            Element root = d.getRootElement();
            List alunos = root.getChildren();
            Iterator i = alunos.iterator();
            
            while(i.hasNext()){
               
                Element xml = (Element) i.next();
                aluno.setNome(xml.getChildText("nome"));
                aluno.setMatricula(xml.getChildText("matricula"));
                aluno.setCurso(xml.getChildText("curso"));
                aluno.setSemestre(xml.getChildText("semestre"));
                listaAluno.add(aluno);
                
             }
        
        } catch (Exception e) {
            e.printStackTrace();
        }

}
        //Felipe >> criei esse metodo para obter os dados do arquivo xml, porem nao esta funcionando 
        // corretamente
        public static Aluno DeserializaAlunoR(Aluno aluno) {
        try {
            File file = new File("XML/CadastroAluno.xml");
            SAXBuilder sax = new SAXBuilder();
            Document d = sax.build(file);
            Element root = d.getRootElement();
            List alunos = root.getChildren();
            Iterator i = alunos.iterator();
            
            while(i.hasNext()){
                Element xml = (Element) i.next();
                aluno.setNome(xml.getChildText("nome"));
                aluno.setMatricula(xml.getChildText("matricula"));
                aluno.setCurso(xml.getChildText("curso"));
                aluno.setSemestre(xml.getChildText("semestre"));
             }
        
        } catch (Exception e) {
            e.printStackTrace();
        }
        return aluno;


     }
        
        
        public static boolean VerificaCadastro(){
         
         File file = new File("XML/CadastroAluno.xml");
         if(file.exists()){
              
             return false;
               }
 
                 
return true;                     
       

        }
        //FELIPE>>>
        
        public static int excluiXmlAluno(){
            File FILE = new File("XML/CadastroAluno.xml");
            try{
                FILE.delete();
                return 1;
                
               }catch(Exception e){
                   e.printStackTrace();
                   return -1;
               }
        }

}


