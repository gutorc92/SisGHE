package DAO;
import Modelo.*;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import Controle.*;
import java.util.Iterator;
import java.util.List;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.XMLOutputter;
import Controle.*;
/**
 *
 * @author david
 */
public class SerializaAluno  {
    ControlaAluno arrayAluno = new ControlaAluno();
    
     private Aluno aluno;
     private static final String sucesso = "Cadastro e Xml gerado com sucesso";
     private static final String falha = "Algum erro ocorreu, ou o endereço do arquivo está incorreto";
  public  SerializaAluno(){
      
      this.aluno = new Aluno();
  }
     
       //Objeto estatico da Classe CadastraFuncionario 
	
 public static void SerializarCadastro(List ArrayAlunos){
        
    
        
        XStream xstream = new XStream(new DomDriver()); //Classe responsavel  pela serialização xml
      
        OutputStream outputStream = null;
        
        xstream.alias("Cadastro", List.class);
        xstream.alias("aluno" , Aluno.class);
        //File file = new File("/home/david/Documentos","CadastroAluno.xml"  );
        File file = new File("XML/CadastroAluno.xml");
         
        try {
        outputStream  = new FileOutputStream(file);
        Writer writer = new OutputStreamWriter(outputStream, "UTF-8");
        xstream.toXML(ArrayAlunos, writer);
       
         
          //oos.write(xstream.toXML(aluno).getBytes());
          JOptionPane.showMessageDialog(null, sucesso);
         // oos.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, falha);
            //Logger.getLogger(SerializaAluno.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
        
        
        
 }


  public static void SerializarAlterar(){
     
      Aluno controle = (Aluno) ControlaAluno.alteraAluno.get(0);
      Document d = null;  
       
       
        try{
       //ControlaAluno controle = (ControlaAluno) ArrayAlunos.get(0)  ;
      
       File file = new File("XML/CadastroAluno.xml");
       SAXBuilder sax = new SAXBuilder();
       //XMLOutputter xml = new XMLOutputter();
        d = sax.build(file);
       Element root = d.getRootElement();
       List alterar = root.getChildren();
       Iterator i = alterar.iterator();
       
       while (i.hasNext()){
       
           Element altera = (Element) i.next(); 
          
            altera.removeChild("nome");
            Element nome = new Element("nome");
            nome.setText(controle.getNome());
            altera.addContent(nome);
            altera.removeChild("curso");
            Element curso = new Element("curso");
            curso.setText(controle.getCurso());
            altera.addContent(curso);
            altera.removeChild("matricula");
             Element matricula = new Element("matricula");
            matricula.setText(controle.getMatricula());
            altera.addContent(matricula);
            altera.removeChild("semestre");
            Element semestre = new Element("semestre");
            semestre.setText(controle.getSemestre());
            altera.addContent(semestre);
            
           
       } 
           
       
       XMLOutputter xml = new XMLOutputter();
        FileOutputStream outputStream  = new FileOutputStream(file);
       xml.output(d, outputStream);
       }
        
        
  
       
        catch(Exception e){
          //oos.write(xstream.toXML(aluno).getBytes());
          JOptionPane.showMessageDialog(null, sucesso);
         // oos.close();
        } 
       
        ControlaAluno.alteraAluno.remove(controle);
        
        
 }
}
 










   

  
    
          
          
          
     /*  public SerializaAluno() throws FileNotFoundException, IOException{
          
      FileOutputStream fsaida = new FileOutputStream("Documentos/CadastroAluno.txt");
      ObjectOutputStream osaida = new ObjectOutputStream(fsaida); 
      osaida.writeObject(aluno);
      osaida.close();
    */
    

    