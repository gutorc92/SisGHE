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
public class ChamaDisciplina extends JFrame{
    public ChamaDisciplina(){
    JPanel interfaceD = new InterfaceDisciplinas();
    
    super.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.add(interfaceD, BorderLayout.CENTER);
        setVisible(true);
        this.setSize(900, 900);
    
    
    
}
}