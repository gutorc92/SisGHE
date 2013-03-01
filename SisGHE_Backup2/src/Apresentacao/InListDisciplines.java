/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Apresentacao;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author larissa
 */
public class InListDisciplines extends JFrame{
    public InListDisciplines(){
    JPanel makeListDisciplines = new InterfaceDisciplinas();
    
    super.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.add(makeListDisciplines, BorderLayout.CENTER);
        setVisible(true);
        this.setSize(900, 900);
    
    
    
}
}