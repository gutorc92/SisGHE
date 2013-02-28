/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle.Disciplinas;

import DAO.Disciplinas.DeserializeDays;
import Modelo.Disciplinas.Dia;
import java.util.ArrayList;

/**
 *
 * @author Axs
 */
public class ControlDay {
    
    public ControlDay() {}
    
    public static Dia createDay(String codigo, String name) {
        Dia day = new Dia(codigo, name);
        return day;
    }
    
    public static void registerDay (ArrayList <Dia> days, Dia day) {
        days.add(day);
    }

    public static ArrayList <Dia> createDays () {
        ArrayList <Dia> days = new ArrayList <Dia>();
        return days;
    }
    
    public ArrayList <Dia> callDeserialize() {
        return DeserializeDays.deserializingDays();
    }
    
}
