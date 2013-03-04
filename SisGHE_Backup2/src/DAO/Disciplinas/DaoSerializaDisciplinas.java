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
    
    public static void serializaDisciplinas(ArrayList <Disciplina> disciplines) {
        
        assert(disciplines != null);
            
        
        
        XStream xstream = new XStream(new DomDriver());

        OutputStream outputStream = null;
        xstream.alias("lista_disciplinas", disciplines.getClass());
        xstream.alias("disciplina", Disciplina.class);
        xstream.alias("turma", Turma.class);
        xstream.alias("dia", Dia.class);
        xstream.alias("hora", Hora.class);
        
        File file = new File("XML/Disciplinas/Oferta.xml");
        
        try {
            outputStream = new FileOutputStream(file);
            Writer writer = new OutputStreamWriter(outputStream, "UTF-8");
            xstream.toXML(disciplines, writer);
        
            JOptionPane.showMessageDialog(null, success);
        
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, fail + "\n" + ex);
        }
        
    }
    
    public static int excluiXmlCadastro(){
            File FILE = new File("XML/Disciplinas/Oferta.xml");
            try{
                FILE.delete();
                return 1;
               }catch(Exception e){
                   e.printStackTrace(); 
                   return -1;
               }
        }
   
}
