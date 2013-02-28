/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Apresentacao;

import Modelo.Disciplinas.Disciplina;
import Controle.Disciplinas.ControlSubject;
import Modelo.Disciplinas.Turma;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author larissa
 */

public class InterfaceDisciplinas extends JPanel{
     //JLabel Jlcodigo;
    
    public InterfaceDisciplinas(){
        
        
        this.setLayout(new GridLayout(41,2));

        ControlSubject controlSubect = new ControlSubject();
        ArrayList <Disciplina> disciplinas = controlSubect.callDeserialize();
        Iterator i = disciplinas.iterator();

        while(i.hasNext()){
            
            Disciplina d = (Disciplina) i.next();

            JLabel Jlcodigo = new JLabel();
            JLabel Jlnome = new JLabel();

            Jlcodigo.setSize(30, 30);
            Jlnome.setSize(30, 30);

            Jlcodigo.setText(d.getCodigo());
            Jlnome.setText(d.getNome());
            
            this.add(Jlcodigo);
            this.add(Jlnome);
        } 
 //           ArrayList<Turma> turmas = d.getTurmas();
   //         Iterator j = turmas.iterator();
   
     //       while(j.hasNext()) {
       //       //ArrayList<dia> dias = d.getDia;  
         //      Turma t = (Turma) j.next();
                
           //     JLabel Jlturma = new JLabel();
                
             //   Jlturma.setText(d.toString());
               // this.add(Jlturma);    
           // }
            
            //Jldias.setLayout(d.getTurmas());
            
             //this.add(Jldias);
         //}
         
        }
    
}
