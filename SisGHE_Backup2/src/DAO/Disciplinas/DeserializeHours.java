/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.Disciplinas;

import Controle.Disciplinas.ControlHour;
import Modelo.Disciplinas.Hora;
import java.util.ArrayList;
import java.util.List;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;

/**
 *
 * @author Axs
 */
public class DeserializeHours {
    
    static ArrayList <Hora> hours = ControlHour.createHours();
    
    public static ArrayList <Hora> deserializingHours() {
        SAXBuilder builder = new SAXBuilder();
        
        try {
            Document documento = builder.build("src/DAO/Disciplinas/lista_horas.xml");
            
            Element horas = documento.getRootElement();
            
            List <Element> lista_horas = horas.getChildren();
            
            //System.out.println("Horas");
            for(Element e : lista_horas) {
                //System.out.println("Codigo: " + e.getChildText("codigo"));
                //System.out.println("Nome: " + e.getChildText("nome"));
                ControlHour.registerHour(hours, ControlHour.createHour(e.getChildText("codigo"), e.getChildText("nome")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return hours;
    }
    
}
