/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Apresentacao;

import Controle.Disciplinas.ControleDisciplinas;
import Modelo.Disciplinas.Disciplina;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JLabel;
import javax.swing.JPanel;


/**
 *
 * @author larissa
 */

public class InterfaceDisciplinas extends JPanel{
     //JLabel Jlcodigo;
    
    public InterfaceDisciplinas(){
     
        this.setLayout(new GridLayout(41,2)) ;
        buscaDisciplinas();
 
        }
    

    private  void buscaDisciplinas(){
        ControleDisciplinas objControleDisciplinas = new ControleDisciplinas();
         ArrayList <Disciplina> listInterfaceDisciplinas = objControleDisciplinas.ControledeserializaDisciplinas();
        
        assert(listInterfaceDisciplinas != null);
       
        Iterator iteratorList = listInterfaceDisciplinas.iterator();

        while(iteratorList.hasNext()){
            
            Disciplina disciplina = (Disciplina) iteratorList.next();

            JLabel Jlcodigo = new JLabel();
            JLabel Jlnome = new JLabel();

            Jlcodigo.setSize(30, 30);
            Jlnome.setSize(30, 30);

            Jlcodigo.setText(disciplina.getCodigo());
            Jlnome.setText(disciplina.getNome());
            
            this.add(Jlcodigo);
            this.add(Jlnome);
        }

    }
}
