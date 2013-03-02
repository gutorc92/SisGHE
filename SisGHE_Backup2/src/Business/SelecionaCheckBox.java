/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Apresentacao.InAlteraAluno;
import DAO.XmlDisciplinasCursadas;
import Modelo.DisciplinaCursada;
import java.util.ArrayList;

/**
 *
 * @author david
 */
public class SelecionaCheckBox {
     public static void setaDisciplina() {
         System.out.println("teste");
        ArrayList<DisciplinaCursada> disciplinasCursadas = XmlDisciplinasCursadas.DeserializaDisciplinas();
        assert(disciplinasCursadas != null);
        for (DisciplinaCursada dc : disciplinasCursadas) {


            if (dc.getNome().equals(InAlteraAluno.Acustica_e_vibracoes_veiculares.getText())) {
                InAlteraAluno.Acustica_e_vibracoes_veiculares.setSelected(true);
            }
            if (dc.getNome().equals(InAlteraAluno.Analise_de_sinais_e_design_de_circuitos.getText())) {
                InAlteraAluno.Analise_de_sinais_e_design_de_circuitos.setSelected(true);
            }
            if (dc.getNome().equals(InAlteraAluno.Calculo1.getText())) {
                InAlteraAluno.Calculo1.setSelected(true);
            }
            if (dc.getNome().equals(InAlteraAluno.Calculo2.getText())) {
                InAlteraAluno.Calculo2.setSelected(true);
            }
            if (dc.getNome().equals(InAlteraAluno.Calculo3.getText())) {
                InAlteraAluno.Calculo3.setSelected(true);
            }
            if (dc.getNome().equals(InAlteraAluno.Circuitos_eletronicos1.getText())) {
                InAlteraAluno.Circuitos_eletronicos1.setSelected(true);
            }
            if (dc.getNome().equals(InAlteraAluno.Circuito_Eletronico2.getText())) {
                InAlteraAluno.Circuito_Eletronico2.setSelected(true);
            }
            if (dc.getNome().equals(InAlteraAluno.circuitos_eletronicos3.getText())) {
                InAlteraAluno.circuitos_eletronicos3.setSelected(true);
            }
            if (dc.getNome().equals(InAlteraAluno.Dinamica_de_veiculos.getText())) {
                InAlteraAluno.Dinamica_de_veiculos.setSelected(true);
            }
        }
    }
}
