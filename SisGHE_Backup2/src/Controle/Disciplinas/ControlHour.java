/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle.Disciplinas;

import DAO.Disciplinas.DeserializeHours;
import Modelo.Disciplinas.Hora;
import java.util.ArrayList;

/**
 *
 * @author Axs
 */
public class ControlHour {
    
    public ControlHour () {}
    
    public static Hora createHour(String codigo, String name) {
        Hora hour = new Hora(codigo, name);
        return hour;
    }
    
    public static void registerHour (ArrayList <Hora> hours, Hora hour) {
        hours.add(hour);
    }

    public static ArrayList <Hora> createHours () {
        ArrayList <Hora> hours = new ArrayList <Hora>();
        return hours;
    }
    
    public ArrayList <Hora> callDeserialize() {
        return DeserializeHours.deserializingHours();
    }
    
}
